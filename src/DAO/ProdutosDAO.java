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
    ResultSet resultset;
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
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar Produtos");
        } finally {
            try {
                psmt.close();
            } catch (SQLException e) {}
        }

    }

    public ArrayList<ProdutosDTO> listarProdutos() {

        return listagem;
    }

}
