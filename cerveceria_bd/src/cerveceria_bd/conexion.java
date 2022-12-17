/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerveceria_bd;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author luis hernandez
 */
public class conexion {

    public Connection MiConexion() {

        String db = "licoreria";
        String url = "jdbc:mysql://localhost/" + db;
        String user = "root";
        String pass = "12345678";
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, pass);
//            JOptionPane.showMessageDialog(null, "Estamos Conectado Con " + db);
        } catch (ClassNotFoundException ex) {
            System.out.println("1");
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            System.out.println("2\n" + ex);

        }

        return con;
    }
}
