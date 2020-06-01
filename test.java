/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M;
//import static C.Emploi_temps_cours.recup_jour;
import C.seance;
import C.Jour;
import static M.Recherche_salles.salle_par_jour;
/**
 *
 * @author valentin
 */
public class test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sem1 = 1;
        int room = 1;
        seance seance1 = salle_par_jour(sem1, 1, 1, room);
        seance seance2 = salle_par_jour(sem1, 1, 2, room);
        seance seance3 = salle_par_jour(sem1, 1, 3, room);
        seance seance4 = salle_par_jour(sem1, 1, 4, room);
        seance seance5 = salle_par_jour(sem1, 1, 5, room);
        seance seance6 = salle_par_jour(sem1, 1, 6, room); 
        seance seance7 = salle_par_jour(sem1, 1, 7, room);
        
        seance seance11 = salle_par_jour(sem1, 2, 1, room);
        seance seance21 = salle_par_jour(sem1, 2, 2, room);
        seance seance31 = salle_par_jour(sem1, 2, 3, room);
        seance seance41 = salle_par_jour(sem1, 2, 4, room);
        seance seance51 = salle_par_jour(sem1, 2, 5, room);
        seance seance61 = salle_par_jour(sem1, 2, 6, room); 
        seance seance71 = salle_par_jour(sem1, 2, 7, room);
        
        seance seance12 = salle_par_jour(sem1, 3, 1, room);
        seance seance22 = salle_par_jour(sem1, 3, 2, room);
        seance seance32 = salle_par_jour(sem1, 3, 3, room);
        seance seance42 = salle_par_jour(sem1, 3, 4, room);
        seance seance52 = salle_par_jour(sem1, 3, 5, room);
        seance seance62 = salle_par_jour(sem1, 3, 6, room); 
        seance seance72 = salle_par_jour(sem1, 3, 7, room);
        
        seance seance13 = salle_par_jour(sem1, 4, 1, room);
        seance seance23 = salle_par_jour(sem1, 4, 2, room);
        seance seance33 = salle_par_jour(sem1, 4, 3, room);
        seance seance43 = salle_par_jour(sem1, 4, 4, room);
        seance seance53 = salle_par_jour(sem1, 4, 5, room);
        seance seance63 = salle_par_jour(sem1, 4, 6, room); 
        seance seance73 = salle_par_jour(sem1, 4, 7, room);
        
        seance seance14 = salle_par_jour(sem1, 5, 1, room);
        seance seance24 = salle_par_jour(sem1, 5, 2, room);
        seance seance34 = salle_par_jour(sem1, 5, 3, room);
        seance seance44 = salle_par_jour(sem1, 5, 4, room);
        seance seance54 = salle_par_jour(sem1, 5, 5, room);
        seance seance64 = salle_par_jour(sem1, 5, 6, room); 
        seance seance74 = salle_par_jour(sem1, 5, 7, room);
        
        seance seance15 = salle_par_jour(sem1, 6, 1, room);
        seance seance25 = salle_par_jour(sem1, 6, 2, room);
        seance seance35 = salle_par_jour(sem1, 6, 3, room);
        seance seance45 = salle_par_jour(sem1, 6, 4, room);
        seance seance55 = salle_par_jour(sem1, 6, 5, room);
        seance seance65 = salle_par_jour(sem1, 6, 6, room); 
        seance seance75 = salle_par_jour(sem1, 6, 7, room);
        
       // System.out.println( seance.getsemaine() + seance.getjour() + seance.getdate() + seance.getheure() + seance.getetat() + seance.getcours() + seance.gettype() + seance.getsalle() + seance.getgroupe());
        
        
        
    
    
    }
}
