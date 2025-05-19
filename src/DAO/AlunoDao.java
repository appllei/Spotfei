package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Aluno;


public class AlunoDao {
    private final Connection conn;

    public AlunoDao(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet consultar(Aluno aluno) throws SQLException{
        String sql = "select * from aluno where usuario = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, aluno.getUsuario());
        statement.setString(2, aluno.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void inserir(Aluno aluno) throws SQLException{
        try (conn) {
            String sql = "insert into aluno (nome, usuario, senha) values ('"
                    + aluno.getNome()    + "', '"
                    + aluno.getUsuario() + "', '"
                    + aluno.getSenha()   + "')";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
        }
    }
    
    public void atualizar(Aluno aluno) throws SQLException{
        try (conn) {
            String sql = "update aluno set senha = ? where usuario = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, aluno.getSenha());
            statement.setString(2, aluno.getUsuario());
            statement.execute();
        }
    }
    
    public void remover(Aluno aluno) throws SQLException{
        try (conn) {
            String sql = "delete from aluno where usuario = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, aluno.getUsuario());
            statement.execute();
        }
    }
    
}