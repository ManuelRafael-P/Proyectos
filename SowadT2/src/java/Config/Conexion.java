/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Manuel
 */
public class Conexion {

    Connection cn = null;
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/sowadt2";
    String user = "root";
    String pass = "root";

    public Connection getConnection(){
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
        }
        return cn;
    }
}
