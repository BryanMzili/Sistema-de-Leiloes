package DAO;

import DTO.ProdutosDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutosDAO {

    Connection conn;
    PreparedStatement psmt;
    ResultSet rs;
    String sql;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();

    public void cadastrarProduto(ProdutosDTO produto) {
        sql = "insert into produtos (nome, valor, status) values (?,?,?);";
        conn = new conectaDAO().connectDB();

        try {
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, produto.getNome());
            psmt.setInt(2, produto.getValor());
            psmt.setString(3, produto.getStatus());
            psmt.execute();

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar Produtos");
        } finally {
            try {
                conn.close();
                psmt.close();
            } catch (SQLException e) {
            }
        }
    }

    public ArrayList<ProdutosDTO> listarProdutos() {
        sql = "select id, nome, valor, status from produtos;";
        conn = new conectaDAO().connectDB();

        try {
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();

            while (rs.next()) {
                ProdutosDTO produto = new ProdutosDTO();

                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getInt("valor"));
                produto.setStatus(rs.getString("status"));

                listagem.add(produto);
            }
        } catch (SQLException erro) {
            return null;
        } finally {
            try {
                conn.close();
                rs.close();
                psmt.close();
            } catch (SQLException ex) {
            }
        }
        return listagem;
    }
    
    public void venderProduto(int id){
        sql = "update produtos set status='Vendido' where id = ?;";
        conn = new conectaDAO().connectDB();

        try {
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, id);
            psmt.execute();
            
            JOptionPane.showMessageDialog(null, "Produto vendido com sucesso.");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao vender produto.");
        } finally {
            try {
                conn.close();
                psmt.close();
            } catch (SQLException ex) {
            }
        }
    } 

}
