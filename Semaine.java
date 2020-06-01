/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C;

/**
 *
 * @author valentin
 */
public class Semaine {
    private int semaine;
    private Jour Jour1;
    private Jour Jour2;
    private Jour Jour3;
    private Jour Jour4;
    private Jour Jour5;
    private Jour Jour6;
    
    public Semaine(int semaine, Jour Jour1, Jour Jour2, Jour Jour3, Jour Jour4, Jour Jour5, Jour Jour6){
      this.semaine = semaine;
      this.Jour1 = Jour1;
      this.Jour1 = Jour2;
      this.Jour1 = Jour3;
      this.Jour1 = Jour4;
      this.Jour1 = Jour5;
      this.Jour1 = Jour6;
    }
    
    public void setsemaine(int semaine){
       this.semaine = semaine;
    }
   
    public int getsemaine(){
       return semaine;
    }
    
    public String getdate2(int choix){
       String date1;
       switch (choix)
        {
            case 1:
                date1 = Jour1.getdate1(1);
            break;
            case 2:
                date1 = Jour2.getdate1(2);
            break;
            case 3:
                date1 = Jour3.getdate1(3);
            break;
            case 4:
                date1 = Jour4.getdate1(4);
            break;
            case 5:
                date1 = Jour5.getdate1(5);
            break;
            case 6:
                date1 = Jour6.getdate1(6);
            break;
            default:
                date1 = "0";             
        }
       return date1;
    }
    
    public int getsemaine2(int choix){
       int semaine1;
       switch (choix)
        {
            case 1:
                semaine1 = Jour1.getsemaine1(1);
            break;
            case 2:
                semaine1 = Jour2.getsemaine1(2);
            break;
            case 3:
                semaine1 = Jour3.getsemaine1(3);
            break;
            case 4:
                semaine1 = Jour4.getsemaine1(4);
            break;
            case 5:
                semaine1 = Jour5.getsemaine1(5);
            break;
            case 6:
                semaine1 = Jour6.getsemaine1(6);
            break;
            default:
                semaine1 = 0;             
        }
       return semaine1;
    }
    
    public String getjour2(int choix){
       String jour1 = " ";
       switch (choix)
        {
            case 1:
                jour1 = Jour1.getjour1(1);
            break;
            case 2:
                jour1 = Jour2.getjour1(2);
            break;
            case 3:
                jour1 = Jour3.getjour1(3);
            break;
            case 4:
                jour1 = Jour4.getjour1(4);
            break;
            case 5:
                jour1 = Jour5.getjour1(5);
            break;
            case 6:
                jour1 = Jour6.getjour1(6);
            break;
            default:
                jour1 = "0";             
        }
       return jour1;
    }
    
    public String getheure2(int choix){
       String heure;
       switch (choix)
        {
            case 1:
                heure = Jour1.getheure1(1);
            break;
            case 2:
                heure = Jour2.getheure1(2);
            break;
            case 3:
                heure = Jour3.getheure1(3);
            break;
            case 4:
                heure = Jour4.getheure1(4);
            break;
            case 5:
                heure = Jour5.getheure1(5);
            break;
            case 6:
                heure = Jour6.getheure1(6);
            break;
            default:
                heure = "0";             
        }
       return heure;
    }
    
    public String getetat2(int choix){
       String etat;
       switch (choix)
        {
            case 1:
                etat = Jour1.getetat1(1);
            break;
            case 2:
                etat = Jour2.getetat1(2);
            break;
            case 3:
                etat = Jour3.getetat1(3);
            break;
            case 4:
                etat = Jour4.getetat1(4);
            break;
            case 5:
                etat = Jour5.getetat1(5);
            break;
            case 6:
                etat = Jour6.getetat1(6);
            break;
            default:
                etat = "0";             
        }
       return etat;
    }
    
    public String getcours2(int choix){
       String cours = " ";
       switch (choix)
        {
            case 1:
                cours = Jour1.getcours1(1);
            break;
            case 2:
                cours = Jour2.getcours1(2);
            break;
            case 3:
                cours = Jour3.getcours1(3);
            break;
            case 4:
                cours = Jour4.getcours1(4);
            break;
            case 5:
                cours = Jour5.getcours1(5);
            break;
            case 6:
                cours = Jour6.getcours1(6);
            break;
            default:
                cours = "0";             
        }
       return cours;
    }
    
    public String gettype2(int choix){
       String type;
       switch (choix)
        {
            case 1:
                type = Jour1.gettype1(1);
            break;
            case 2:
                type = Jour2.gettype1(2);
            break;
            case 3:
                type = Jour3.gettype1(3);
            break;
            case 4:
                type = Jour4.gettype1(4);
            break;
            case 5:
                type = Jour5.gettype1(5);
            break;
            case 6:
                type = Jour6.gettype1(6);
            break;
            default:
                type = "0";             
        }
       return type;
    }
    
    public int getsalle2(int choix){
       int salle;
       switch (choix)
        {
            case 1:
                salle = Jour1.getsalle1(1);
            break;
            case 2:
                salle = Jour2.getsalle1(2);
            break;
            case 3:
                salle = Jour3.getsalle1(3);
            break;
            case 4:
                salle = Jour4.getsalle1(4);
            break;
            case 5:
                salle = Jour5.getsalle1(5);
            break;
            case 6:
                salle = Jour6.getsalle1(6);
            break;
            default:
                salle = 0;             
        }
       return salle;
    }
    
    public int getgroupe2(int choix){
       int groupe;
       switch (choix)
        {
            case 1:
                groupe = Jour1.getgroupe1(1);
            break;
            case 2:
                groupe = Jour2.getgroupe1(2);
            break;
            case 3:
                groupe = Jour3.getgroupe1(3);
            break;
            case 4:
                groupe = Jour4.getgroupe1(4);
            break;
            case 5:
                groupe = Jour5.getgroupe1(5);
            break;
            case 6:
                groupe = Jour6.getgroupe1(6);
            break;
            default:
                groupe = 0;             
        }
       return groupe;
    }
}
