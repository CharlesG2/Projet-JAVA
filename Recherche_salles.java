/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M;
import static C.Emploi_temps_salle.recup_seance_salle;
import C.seance;

/**
 *
 * @author valentin
 */
public class Recherche_salles {
    public static seance salle_par_jour(int sem, int jour, int heure, int room){
        seance seance;
        seance = recup_seance_salle(sem, jour, heure, room);
        return seance;  
    }
}
