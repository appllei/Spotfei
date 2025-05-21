package controller;

import DAO.AlunoDao;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Aluno;
import Controller.ControllerSpotfei;


import view.Login;
import view.Spotfei;



public class ControllerLogin {
    private final Login view;

    public ControllerLogin(Login view) {
        this.view = view;
    }
    
    public void loginAluno(){
        Aluno aluno = new Aluno(null, 
                                view.getTxt_usuario_login().getText(),
                                view.getTxt_senha_login().getText());
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            AlunoDao dao = new AlunoDao(conn);
            ResultSet res = dao.consultar(aluno);
            if(res.next()){
                JOptionPane.showMessageDialog(view, 
                                              "Login efetuado!", 
                                              "Aviso",
                                              JOptionPane.INFORMATION_MESSAGE);
                Aluno aluno2 = new Aluno(res.getString("nome"), 
                                         res.getString("usuario"), 
                                         res.getString("senha"));
                Spotfei tela = new Spotfei();
                ControllerSpotfei cs = new ControllerSpotfei(tela);
                tela.setVisible(true);

            } else{
                JOptionPane.showMessageDialog(view, 
                                              "Login NÃO efetuado!", 
                                              "Aviso",
                                              JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e){    
            JOptionPane.showMessageDialog(view, 
                                              "Erro de conexão!", 
                                              "Aviso",
                                              JOptionPane.ERROR_MESSAGE);
        }
    }
}