package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Musica;

public class MusicaDao {

    private Connection conexao;

    public MusicaDao() {
        try {
            conexao = new Conexao().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Musica> buscarMusicas(String termo) {
        List<Musica> lista = new ArrayList<>();
        String sql = "SELECT * FROM musica WHERE nome ILIKE ? OR artista ILIKE ? OR genero ILIKE ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            String busca = "%" + termo + "%";
            stmt.setString(1, busca);
            stmt.setString(2, busca);
            stmt.setString(3, busca);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Musica m = new Musica();
                m.setId(rs.getInt("id"));
                m.setNome(rs.getString("nome"));
                m.setArtista(rs.getString("artista"));
                m.setGenero(rs.getString("genero"));
                lista.add(m);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
