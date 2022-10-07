/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author HP
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionProvider {
    Connection conn;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.mysql.JDBC");
            Connection conn = DriverManager.getConnection("jdbc.3306/mysql://localhost:3306/lms","root","123456");
            return conn;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
