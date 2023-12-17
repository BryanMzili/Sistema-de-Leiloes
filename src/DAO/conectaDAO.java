package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {

    public Connection connectDB() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11?user=user_leilao&password=12345");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar ao banco de dados.");
        }
        return conn;
    }

}
