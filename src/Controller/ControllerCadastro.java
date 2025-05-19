package Controller;

import DAO.AlunoDao;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Aluno;
import view.Cadastro;
import view.Login;

public class ControllerCadastro {
    private final Cadastro view;
    
    public ControllerCadastro(Cadastro view){
        this.view = view;
    }

    
    
    public void salvarAluno(){
        String nome = view.getTxt_nome_cadastro().getText();
        String usuario = view.getTxt_usuario_cadastro().getText();
        String senha = view.getTxt_senha_cadastro().getText();
        Aluno aluno = new Aluno(nome, usuario,senha);
        
        Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConnection();
            AlunoDao dao = new AlunoDao (conn);
            dao.inserir(aluno);
            JOptionPane.showMessageDialog(view, "Usuario Cadastrado!","Aviso", JOptionPane.INFORMATION_MESSAGE);
            Login aec = new Login();
                aec.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Usuário não cadastrado!","Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
