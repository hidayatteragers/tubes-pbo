/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasilaundy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    static Connection mysqlconfig;
        public static Connection configDB()throws SQLException{
            try {
                String url="jdbc:mysql://localhost:3306/laundry";
                    String user="root";
                    String pass="";
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlconfig=DriverManager.getConnection(url,user,pass);
            }   catch (SQLException e) {
                System.out.println("koneksi gagal "+e.getMessage());//perintah menampilkan error pada koneksi
            }
            return mysqlconfig;
        }
}
