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
public class Jour {
    private String day;
    private int semaines;
    seance seance1;
    private seance seance2;
    private seance seance3;
    private seance seance4;
    private seance seance5;
    private seance seance6;
    private seance seance7;
    
    public Jour(String day, int semaines, seance seance1, seance seance2, seance seance3, seance seance4, seance seance5, seance seance6, seance seance7){
        this.day = day;
        this.semaines = semaines;
        this.seance1 = seance1;
        this.seance1 = seance2;
        this.seance1 = seance3;
        this.seance1 = seance4;
        this.seance1 = seance5;
        this.seance1 = seance6;
        this.seance1 = seance7;
    }
    
    
    public void setday(String day){
       this.day = day;
    }
   
    public String getday(){
       return day;
    }
    
    public void setdate(int semaines){
       this.semaines = semaines;
    }
   
    public int getsemaines(){
       return semaines;
    }
    
    
   
    public String getdate1(int choix){
       String date1;
       switch (choix)
        {
            case 1:
                date1 = seance1.getdate();
            break;
            case 2:
                date1 = seance2.getdate();
            break;
            case 3:
                date1 = seance3.getdate();
            break;
            case 4:
                date1 = seance4.getdate();
            break;
            case 5:
                date1 = seance5.getdate();
            break;
            case 6:
                date1 = seance6.getdate();
            break;
            case 7:
                date1 = seance7.getdate();
            break;
            default:
                date1 = "0";             
        }
       return date1;
    }
    
    public int getsemaine1(int choix){
       int semaine;
       switch (choix)
        {
            case 1:
                semaine = seance1.getsemaine();
            break;
            case 2:
                semaine = seance2.getsemaine();
            break;
            case 3:
                semaine = seance3.getsemaine();
            break;
            case 4:
                semaine = seance4.getsemaine();
            break;
            case 5:
                semaine = seance5.getsemaine();
            break;
            case 6:
                semaine = seance6.getsemaine();
            break;
            case 7:
                semaine = seance7.getsemaine();
            break;
            default:
                semaine = 0;             
        }
       return semaine;
    }
    
    public String getjour1(int choix){
       String jour;
       switch (choix)
        {
            case 1:
                jour = seance1.getjour();
            break;
            case 2:
                jour = seance2.getjour();
            break;
            case 3:
                jour = seance3.getjour();
            break;
            case 4:
                jour = seance4.getjour();
            break;
            case 5:
                jour = seance5.getjour();
            break;
            case 6:
                jour = seance6.getjour();
            break;
            case 7:
                jour = seance7.getjour();
            break;
            default:
                jour = "0";             
        }
       return jour;
    }
    
    public String getheure1(int choix){
       String heure;
       switch (choix)
        {
            case 1:
                heure = seance1.getheure();
            break;
            case 2:
                heure = seance2.getheure();
            break;
            case 3:
                heure = seance3.getheure();
            break;
            case 4:
                heure = seance4.getheure();
            break;
            case 5:
                heure = seance5.getheure();
            break;
            case 6:
                heure = seance6.getheure();
            break;
            case 7:
                heure = seance7.getheure();
            break;
            default:
                heure = "0";             
        }
       return heure;
    }
    
    public String getetat1(int choix){
       String etat;
       switch (choix)
        {
            case 1:
                etat = seance1.getetat();
            break;
            case 2:
                etat = seance2.getetat();
            break;
            case 3:
                etat = seance3.getetat();
            break;
            case 4:
                etat = seance4.getetat();
            break;
            case 5:
                etat = seance5.getetat();
            break;
            case 6:
                etat = seance6.getetat();
            break;
            case 7:
                etat = seance7.getetat();
            break;
            default:
                etat = "0";             
        }
       return etat;
    }
    
    public String getcours1(int choix){
       String cours;
       switch (choix)
        {
            case 1:
                cours = seance1.getcours();
            break;
            case 2:
                cours = seance2.getcours();
            break;
            case 3:
                cours = seance3.getcours();
            break;
            case 4:
                cours = seance4.getcours();
            break;
            case 5:
                cours = seance5.getcours();
            break;
            case 6:
                cours = seance6.getcours();
            break;
            case 7:
                cours = seance7.getcours();
            break;
            default:
                cours = "0";             
        }
       return cours;
    }
    
    public String gettype1(int choix){
       String type;
       switch (choix)
        {
            case 1:
                type = seance1.gettype();
            break;
            case 2:
                type = seance2.gettype();
            break;
            case 3:
                type = seance3.gettype();
            break;
            case 4:
                type = seance4.gettype();
            break;
            case 5:
                type = seance5.gettype();
            break;
            case 6:
                type = seance6.gettype();
            break;
            case 7:
                type = seance7.gettype();
            break;
            default:
                type = "0";             
        }
       return type;
    }
    
    public int getsalle1(int choix){
       int salle;
       switch (choix)
        {
            case 1:
                salle = seance1.getsalle();
            break;
            case 2:
                salle = seance2.getsalle();
            break;
            case 3:
                salle = seance3.getsalle();
            break;
            case 4:
                salle = seance4.getsalle();
            break;
            case 5:
                salle = seance5.getsalle();
            break;
            case 6:
                salle = seance6.getsalle();
            break;
            case 7:
                salle = seance7.getsalle();
            break;
            default:
                salle = 0;             
        }
       return salle;
    }
    
    public int getgroupe1(int choix){
       int groupe;
       switch (choix)
        {
            case 1:
                groupe = seance1.getgroupe();
            break;
            case 2:
                groupe = seance2.getgroupe();
            break;
            case 3:
                groupe = seance3.getgroupe();
            break;
            case 4:
                groupe = seance4.getgroupe();
            break;
            case 5:
                groupe = seance5.getgroupe();
            break;
            case 6:
                groupe = seance6.getgroupe();
            break;
            case 7:
                groupe = seance7.getgroupe();
            break;
            default:
                groupe = 0;             
        }
       return groupe;
    }
    
}
