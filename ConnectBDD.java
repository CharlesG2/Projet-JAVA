/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C;
import java.sql.*;
/**
 *
 * @author valentin
 */
public class ConnectBDD {
   public static Connection connecterDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("Driver ok");
            String url ="jdbc:mysql://localhost:3306/campus_ece";
            String user ="root";
            String password = "";
            
            Connection cc = DriverManager.getConnection(url, user, password);
            //System.out.println("connexion ok");
            return cc;
        }catch(ClassNotFoundException | SQLException e){
            return null;
        }
    } 
}
