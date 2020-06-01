/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M;

import V.Page_etudiant_salle;
import V.Page_etudiant_semaine;

/**
 *
 * @author valentin
 */
public class Gestion_aff_semaine {
    public static void gestion_seance(int i){
        Page_etudiant_semaine page_etu_semaine = new Page_etudiant_semaine(i);
        
    }
    public static void gestion_salle(int i, int j){
        Page_etudiant_salle page_etu_semaine = new Page_etudiant_salle(i,j);       
    }
}
