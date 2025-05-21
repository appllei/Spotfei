package Controller;

import DAO.MusicaDao;
import model.Musica;
import view.Spotfei;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ControllerSpotfei {
    private final Spotfei tela;
    private List<String> musicasCurtidas = new ArrayList<>();
    private Map<String, List<String>> playlists = new HashMap<>();
    private List<String> historicoBuscas = new ArrayList<>();
    private List<String> musicasDescurtidas = new ArrayList<>();




    public ControllerSpotfei(Spotfei tela) {
        this.tela = tela;
        tela.getBt_buscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarMusicas();
            }
        });
        
        tela.getBt_curtir().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        curtirOuDescutir();
        }
        });
        
        tela.getBt_criarPlaylist().addActionListener(e -> {
            String nome = JOptionPane.showInputDialog(tela, "Digite o nome da nova playlist:");
            if (nome != null && !nome.isBlank()) {
            if (playlists.containsKey(nome)) {
            JOptionPane.showMessageDialog(tela, "Já existe uma playlist com esse nome.");
        } else {
            playlists.put(nome, new ArrayList<>());
            JOptionPane.showMessageDialog(tela, "Playlist criada com sucesso!");
        }
    }
    });
        tela.getBt_editarPlaylist().addActionListener(e -> {
    String antiga = JOptionPane.showInputDialog(tela, "Nome da playlist que deseja renomear:");
    if (antiga != null && playlists.containsKey(antiga)) {
        String nova = JOptionPane.showInputDialog(tela, "Novo nome para a playlist:");
        if (nova != null && !nova.isBlank()) {
            playlists.put(nova, playlists.remove(antiga));
            JOptionPane.showMessageDialog(tela, "Playlist renomeada com sucesso!");
        }
    } else {
        JOptionPane.showMessageDialog(tela, "Playlist não encontrada.");
    }
});
        
        
        tela.getBt_excluirPlaylist().addActionListener(e -> {
    String nome = JOptionPane.showInputDialog(tela, "Digite o nome da playlist a excluir:");
    if (nome != null && playlists.containsKey(nome)) {
        playlists.remove(nome);
        JOptionPane.showMessageDialog(tela, "Playlist excluída!");
    } else {
        JOptionPane.showMessageDialog(tela, "Playlist não encontrada.");
    }
});
        
        tela.getBt_addMusicaPlaylist().addActionListener(e -> {
    String musica = tela.getListResultados().getSelectedValue();
    if (musica == null) {
        JOptionPane.showMessageDialog(tela, "Selecione uma música da lista.");
        return;
    }

    String nomePlaylist = JOptionPane.showInputDialog(tela, "Digite o nome da playlist:");
    if (nomePlaylist != null && playlists.containsKey(nomePlaylist)) {
        playlists.get(nomePlaylist).add(musica);
        JOptionPane.showMessageDialog(tela, "Música adicionada à playlist!");
    } else {
        JOptionPane.showMessageDialog(tela, "Playlist não encontrada.");
    }
});
        
        tela.getBt_removerMusicaPlaylist().addActionListener(e -> {
    String nomePlaylist = JOptionPane.showInputDialog(tela, "Nome da playlist:");
    if (nomePlaylist != null && playlists.containsKey(nomePlaylist)) {
        String musica = JOptionPane.showInputDialog(tela, "Nome da música que deseja remover:");
        playlists.get(nomePlaylist).remove(musica);
        JOptionPane.showMessageDialog(tela, "Música removida da playlist.");
    } else {
        JOptionPane.showMessageDialog(tela, "Playlist não encontrada.");
    }
});
        
        tela.getBt_verPlaylists().addActionListener(e -> {
    if (playlists.isEmpty()) {
        JOptionPane.showMessageDialog(tela, "Nenhuma playlist criada ainda.");
        return;
    }

    StringBuilder builder = new StringBuilder("Playlists disponíveis:\n\n");
    for (String nome : playlists.keySet()) {
        builder.append("- ").append(nome).append("\n");
    }

    JOptionPane.showMessageDialog(tela, builder.toString(), "Playlists", JOptionPane.INFORMATION_MESSAGE);
});
        tela.getBt_verHistorico().addActionListener(e -> {
    StringBuilder msg = new StringBuilder("🔎 Últimas 10 Buscas:\n");
    if (historicoBuscas.isEmpty()) msg.append("(vazio)\n");
    else for (String busca : historicoBuscas) msg.append("• ").append(busca).append("\n");

    msg.append("\n❤️ Músicas Curtidas:\n");
    if (musicasCurtidas.isEmpty()) msg.append("(vazio)\n");
    else for (String musica : musicasCurtidas) msg.append("• ").append(musica).append("\n");

    msg.append("\n💔 Músicas Descurtidas:\n");
    if (musicasDescurtidas.isEmpty()) msg.append("(vazio)\n");
    else for (String musica : musicasDescurtidas) msg.append("• ").append(musica).append("\n");

    JOptionPane.showMessageDialog(tela, msg.toString(), "Histórico", JOptionPane.INFORMATION_MESSAGE);
});






        
    }

    private void buscarMusicas() {
        String termo = tela.getTxtBuscar().getText();
        MusicaDao dao = new MusicaDao();
        List<Musica> musicas = dao.buscarMusicas(termo);
        
        if (!termo.isBlank()) {
        historicoBuscas.add(termo);
        if (historicoBuscas.size() > 10) {
            historicoBuscas.remove(0); // mantém só os 10 últimos
        }
    }

        DefaultListModel<String> model = new DefaultListModel<>();
        for (Musica musica : musicas) {
            model.addElement(musica.getNome() + " - " + musica.getArtista());
        }
        tela.getListResultados().setModel(model);
    }

    private void curtirOuDescutir(){
        String musicaSelecionada = tela.getListResultados().getSelectedValue();
        
        if(musicaSelecionada == null ){
            JOptionPane.showMessageDialog(tela,"Selecione , uma musica para curtir ou descurtir;.", "aviso ",JOptionPane.WARNING_MESSAGE);
            return;
      
    }
        if(musicasCurtidas.contains(musicaSelecionada)){
            musicasCurtidas.remove(musicaSelecionada);
            musicasDescurtidas.add(musicaSelecionada);
            JOptionPane.showMessageDialog(tela, "Musica Descurtida" , "info", JOptionPane.INFORMATION_MESSAGE);
        }else {
            musicasCurtidas.add(musicaSelecionada);
            JOptionPane.showMessageDialog(tela, "Música Curtida", "info",JOptionPane.INFORMATION_MESSAGE);
            
        }
        }
    

   
}




