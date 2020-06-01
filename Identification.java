/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M;
import static C.Seconnecter.Se_connecter;
import V.Page_connexion;
import V.Page_etudiant_salle;
import V.Page_etudiant_semaine;
/**
 *
 * @author valentin
 */
public class Identification {
    
    public static void identification(String mail, String mdp){
        
        int t = Se_connecter(mail, mdp);
        
        switch (t)
        {
            case 1:
                System.out.println("Bienvenue, Mr Admin");
            break;
            
            case 2:
                System.out.println("Bienvenue, Mr Professeur");
            break; 
            
            case 3:
                //Page_etudiant_semaine page_etu_semaine = new Page_etudiant_semaine(1);
                Page_etudiant_salle page_etu_salle = new Page_etudiant_salle(1,1);
            break;
            
            case 0:
                System.out.println("Erreur d'identification");
                Page_connexion log_in = new Page_connexion();
            break; 
            default:
                /*Action*/;             
        }
    }
    
}
