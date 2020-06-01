/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author valentin
 */
public class Emploi_temps_cours extends ConnectBDD{
    
    public static seance recup_seance(int s, int j, int h){
        
        int ID = 0;
        int Groupe = 0;
        int 
                Promo = 0;
        
        try {
            Connection cc = connecterDB();
            Statement st;
            ResultSet rst;
            st = cc.createStatement();
            rst = st.executeQuery("SELECT ID_UTILISATEUR FROM seesion");
            
            while(rst.next()){
                ID  = rst.getInt("ID_UTILISATEUR");
            }  
            rst.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(ECE_Campus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Connection cc2 = connecterDB();
            Statement st2;
            ResultSet rst2;
            String query = "SELECT ID_GROUPE, Promotion FROM etudiant WHERE ID_UTILISATEUR='"+ ID +"'";
            st2 = cc2.createStatement();
            rst2 = st2.executeQuery(query);
            
            while(rst2.next()){
              Groupe  = rst2.getInt("ID_GROUPE");
              Promo = rst2.getInt("Promotion");
            }  
            rst2.close();
            st2.close();
        } catch (SQLException ex) {
            Logger.getLogger(ECE_Campus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Connection cc1 = connecterDB();
        Statement st1;
        ResultSet rst1;
        seance seance ;
        int semaine = 0;
        String Jour = "";
        String Heure = "";
        String date = "";
        String etat = "";
        String cours = "";
        String type = "";
        int salle = 0;
        int groupe = 0;
        String prof = "";
        int promo = 0;
        
         try {
            
            String query = "SELECT * FROM seance WHERE semaine='"+ s +"'AND Jour='"+ j +"'AND H_start='"+ h +"' AND Groupe='"+ Groupe +"' AND Promotion='"+Promo+"'";
            st1 = cc1.createStatement();
            rst1 = st1.executeQuery(query);
            
            while(rst1.next()){
              //if(rst1.getInt("Groupe") == Groupe){
                switch (rst1.getString("Jour"))
                {
                    case "1":
                        Jour = "Lundi";
                    break;
                    case "2":
                        Jour = "Mardi";
                    break;
                    case "3":
                        Jour = "Mercredi";
                    break;
                    case "4":
                        Jour = "Jeudi";
                    break;
                    case "5":
                        Jour = "Vendredi";
                    break;
                    default:
                        Jour = "rien";
                } 
             // }
              switch (rst1.getString("H_start"))
              {
                  case "1":
                      Heure = "8H30 à 10H00";
                  break;
                  case "2":
                      Heure = "10H15 à 11H45";
                  break;
                  case "3":
                      Heure = "12H00 à 13H30";
                  break;
                  case "4":
                      Heure = "13H45 à 15H15";
                  break;
                  case "5":
                      Heure = "15H30 à 17H00";
                  break;
                  case "6":
                      Heure = "17H15 à 18H45";
                  break;
                  case "7":
                      Heure = "19H00 à 20H30";
                  break;
                  default:
                       Heure = "00H00";
              }
              semaine = rst1.getInt("semaine");
              date = rst1.getString("Date");
              etat = rst1.getString("Etat");
              cours = rst1.getString("Cours");
              type = rst1.getString("Type");
              salle = rst1.getInt("Salle");
              groupe = rst1.getInt("Groupe");
              prof = rst1.getString("Professeur");
              promo = rst1.getInt("Promotion");
            }  
            rst1.close();
            st1.close();
        } catch (SQLException ex) {
            Logger.getLogger(ECE_Campus.class.getName()).log(Level.SEVERE, null, ex);
        }
       return seance = new seance(semaine, Jour, date, Heure, etat, cours, type, salle, groupe, prof, promo);
    }
}
