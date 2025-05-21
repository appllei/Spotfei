
package view;


import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import model.Aluno;


public class Spotfei extends javax.swing.JFrame {

    
    public Spotfei() {
        initComponents();
    }
    
    public JButton getBt_verHistorico() {
    return bt_verHistorico;
}

    
    public JButton getBt_verPlaylists() {
        return bt_verPlaylists;
}

    
    public JButton getBt_criarPlaylist() { 
        return bt_criarPlaylist; }
    
    public JButton getBt_editarPlaylist() 
    {  return bt_editarPlaylist; }
    
    public JButton getBt_excluirPlaylist() {
     return bt_excluirPlaylist; }
    
    public JButton getBt_addMusicaPlaylist() {
         return bt_addMusica; }
    
       public JButton getBt_removerMusicaPlaylist() { 
           return bt_removermusica; }

    
    public JButton getBt_curtir(){ 
        return bt_curtir;
    }
    
    

    public JButton getBt_buscar() {   
    return bt_buscar;
}
    public JTextField getTxtBuscar(){
        return txtBuscar;
    }

public JList<String> getListResultados() {
    return listResultados;
}
    public JButton getBt_historico(){
        return bt_verHistorico;
    }
public JButton getBt_playlist(){
    return bt_criarPlaylist;
}
public JButton getBt_sair(){
    return bt_sair;
}
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bt_buscar = new javax.swing.JButton();
        bt_curtir = new javax.swing.JButton();
        bt_criarPlaylist = new javax.swing.JButton();
        bt_verHistorico = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listResultados = new javax.swing.JList<>();
        bt_editarPlaylist = new javax.swing.JButton();
        bt_excluirPlaylist = new javax.swing.JButton();
        bt_addMusica = new javax.swing.JButton();
        bt_removermusica = new javax.swing.JButton();
        bt_verPlaylists = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/transferir.png"))); // NOI18N

        bt_buscar.setText(" 🔍 Buscar Musicas");
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });

        bt_curtir.setText("Curtir / Descurtir");

        bt_criarPlaylist.setText("Nova Playlist");
        bt_criarPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_criarPlaylistActionPerformed(evt);
            }
        });

        bt_verHistorico.setText("Histórico");

        bt_sair.setText("X  Sair");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("SPOTFEI ");

        listResultados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listResultados);

        bt_editarPlaylist.setText("Editar Playlist");

        bt_excluirPlaylist.setText("Excluir Playlist");

        bt_addMusica.setText("Add Musica");

        bt_removermusica.setText("Remover Musica");

        bt_verPlaylists.setText("Ver Playlist");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_addMusica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_removermusica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_curtir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bt_criarPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_verPlaylists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_excluirPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(bt_editarPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(526, 526, 526)
                        .addComponent(bt_verHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 598, Short.MAX_VALUE)
                        .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_buscar)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(bt_addMusica)
                                .addGap(40, 40, 40)
                                .addComponent(bt_removermusica)
                                .addGap(29, 29, 29)
                                .addComponent(bt_curtir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_criarPlaylist)
                            .addComponent(bt_editarPlaylist))
                        .addGap(32, 32, 32)
                        .addComponent(bt_verPlaylists)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(bt_excluirPlaylist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_verHistorico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_sair)
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        
    }//GEN-LAST:event_bt_buscarActionPerformed

    private void bt_criarPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_criarPlaylistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_criarPlaylistActionPerformed

    
    //public static void main(String args[]) {
        
        //java.awt.EventQueue.invokeLater(new Runnable() {
            //public void run() {
                //new Spotfei().setVisible(true);
            //}
        //});
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addMusica;
    private javax.swing.JButton bt_buscar;
    private javax.swing.JButton bt_criarPlaylist;
    private javax.swing.JButton bt_curtir;
    private javax.swing.JButton bt_editarPlaylist;
    private javax.swing.JButton bt_excluirPlaylist;
    private javax.swing.JButton bt_removermusica;
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_verHistorico;
    private javax.swing.JButton bt_verPlaylists;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listResultados;
    private javax.swing.JFormattedTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
