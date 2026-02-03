package dao;

import database.Conexao;
import model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VeiculoDAO {

    public void salvar(Veiculo v) {

        String sql = """
            INSERT INTO veiculo
            (placa, modelo, ano, diaria, disponivel, tipo)
            VALUES (?, ?, ?, ?, ?, ?)
        """;

        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, v.getPlaca());
            ps.setString(2, v.getModelo());
            ps.setInt(3, v.getAno());
            ps.setDouble(4, v.getValorDiaria());
            ps.setBoolean(5, v.isDisponivel());
            ps.setString(6, v.getTipo().name());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Veiculo buscarPorPlaca(String placa) {

        String sql = "SELECT * FROM veiculo WHERE placa = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, placa);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return criarVeiculo(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Veiculo> listarDisponiveis() {

        List<Veiculo> lista = new ArrayList<>();
        String sql = "SELECT * FROM veiculo WHERE disponivel = true";

        try (Connection conn = Conexao.conectar();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(criarVeiculo(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    private Veiculo criarVeiculo(ResultSet rs) throws SQLException {

        String tipo = rs.getString("tipo");

        return switch (tipo) {
            case "CARRO" ->
                    new Carro(
                            rs.getString("placa"),
                            rs.getString("modelo"),
                            rs.getInt("ano"),
                            rs.getDouble("diaria")
                    );

            case "MOTO" ->
                    new Moto(
                            rs.getString("placa"),
                            rs.getString("modelo"),
                            rs.getInt("ano"),
                            rs.getDouble("diaria")
                    );

            default ->
                    new Caminhao(
                            rs.getString("placa"),
                            rs.getString("modelo"),
                            rs.getInt("ano"),
                            rs.getDouble("diaria")
                    );
        };
    }
}
