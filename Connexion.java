/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece_planning;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author valentin
 */
public class Connexion {

    
    public static Connection connecterDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
            String url ="jdbc:mysql://localhost:3306/campus_ece";
            String user ="root";
            String password = "";
            
            Connection cc = DriverManager.getConnection(url, user, password);
            System.out.println("connexion ok");
            return cc;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static void Se_connecter(String mail, String mdp){
        Connection cc = connecterDB();
        Statement st;
        ResultSet rst;
        int t = 0;
        
        
        try {
            st = cc.createStatement();
            rst = st.executeQuery("SELECT * FROM utilisateur");
            
            while(rst.next()){
                if(mail.equals(rst.getString("Email")) && mdp.equals(rst.getString("PASSWD")) && rst.getInt("DROIT") == 1){
                    t = t + 1;
                }
                if(mail.equals(rst.getString("Email")) && mdp.equals(rst.getString("PASSWD")) && rst.getInt("DROIT") == 2){
                    t = t + 2;
                }
                if(mail.equals(rst.getString("Email")) && mdp.equals(rst.getString("PASSWD")) && rst.getInt("DROIT") == 3){
                    t = t + 3;
                }
            }
            if(t == 1){
                Confirme confirme = new Confirme();
                confirme.setVisible(true);
            }
            if(t == 2){
                Confirme2 confirme2 = new Confirme2();
                confirme2.setVisible(true);
            }
            if(t == 3){
                Confirme3 confirme3 = new Confirme3();
                confirme3.setVisible(true);
            }                
            if(t == 0){
                Refuse refuse = new Refuse();
                refuse.setVisible(true);
            }
                
            rst.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ece_Planning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
