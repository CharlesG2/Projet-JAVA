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
public class seance {
   private int semaine = 0;
   private String jour;
   private String date;
   private String heure;
   private String etat;
   private String cours;
   private String type;
   private int salle;
   private int groupe;
   private String professeur;
   private int promotion;
   
   public seance(int semaine, String jour, String date, String heure, String etat, String cours, String type, int salle, int groupe, String professeur, int promotion){
       this.semaine = semaine;
       this.jour = jour;
       this.date = date;
       this.heure = heure;
       this.etat = etat;
       this.cours = cours;
       this.type = type;
       this.salle = salle;
       this.groupe = groupe;
       this.professeur = professeur;
       this.promotion = promotion;
    }
   
   public void setsemaine(int semaine){
       this.semaine = semaine;
   }
   
   public int getsemaine(){
       return semaine;
   }
   
   public void setjour(String jour){
       this.jour = jour;
   }
   
   public String getjour(){
       return jour;
   }
   
   public void setdate(String date){
       this.date = date;
   }
   
   public String getdate(){
       return date;
   }
   
   public void setheure(String heure){
       this.heure = heure;
   }
   
   public String getheure(){
       return heure;
   }
   
   public void setetat(String etat){
       this.etat = etat;
   }
   
   public String getetat(){
       return etat;
   }
   
   public void setcours(String cours){
       this.cours = cours;
   }
   
   public String getcours(){
       return cours;
   }
   
   public void settype(String type){
       this.type = type;
   }
   
   public String gettype(){
       return type;
   }
   
   public void setsalle(int salle){
       this.salle = salle;
   }
   
   public int getsalle(){
       return salle;
   }
   
   public void setgroupe(int groupe){
       this.groupe = groupe;
   }
   
   public int getgroupe(){
       return groupe;
   }
   
   public void setprofesseur(String professeur){
       this.professeur = professeur;
   }
   
   public String getprofesseur(){
       return professeur;
   }
   
   public void setpromotion(int promotion){
       this.promotion = promotion;
   }
   
   public int getpromotion(){
       return promotion;
   }
}
