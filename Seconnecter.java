/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author valentin
 */
public class Seconnecter extends ConnectBDD{
    
    public static int Se_connecter(String mail, String mdp){
        Connection cc = connecterDB();
        Statement st;
        ResultSet rst;
        int t = 0;
        int ID;
       
        try {
            st = cc.createStatement();
            rst = st.executeQuery("SELECT * FROM utilisateur");
            
            while(rst.next()){
                if(mail.equals(rst.getString("Email")) && mdp.equals(rst.getString("PASSWD")) && rst.getInt("DROIT") == 1){
                    t = t + 1;
                    ID = rst.getInt("ID");
                    Session(ID);
                }
                if(mail.equals(rst.getString("Email")) && mdp.equals(rst.getString("PASSWD")) && rst.getInt("DROIT") == 2){
                    t = t + 2;
                    ID = rst.getInt("ID");
                    Session(ID);
                }
                if(mail.equals(rst.getString("Email")) && mdp.equals(rst.getString("PASSWD")) && rst.getInt("DROIT") == 3){
                    t = t + 3;
                    ID = rst.getInt("ID");
                    Session(ID);
                }
            }   
            rst.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(ECE_Campus.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return t;
    }
// --------------Procédure pour créer la session de l'utilisateur---------------  
    public static void Session(int ID){
        
        try {
            Connection cc2 = connecterDB();
            Statement st2;
            ResultSet rst2;
            String query = "UPDATE seesion SET ID_UTILISATEUR='"+ ID +"'";
            st2 = cc2.createStatement();
            st2.executeUpdate(query); 
            st2.close();
        } catch (SQLException ex) {
            Logger.getLogger(ECE_Campus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
