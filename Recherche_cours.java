/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M;
import static C.Emploi_temps_cours.recup_seance;
import C.seance;

/**
 *
 * @author valentin
 */
public class Recherche_cours {
    public static seance seance_par_jour(int sem, int jour, int heure){
        seance seance;
        seance = recup_seance(sem, jour, heure);
        return seance;  
    }
}
