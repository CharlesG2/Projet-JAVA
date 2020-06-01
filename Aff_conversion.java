/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V;

/**
 *
 * @author valentin
 */
public class Aff_conversion {
    public static String affConv(String a, String e, int d, String f){
        String b = "";
        String c;
        
        
        if (a.equals(b)){
            c = " ";
        }else{
            c = a +" - "+ e +" - "+f+ " - salle " + d;
        }
        return c;
    }
    
    public static String affConvsalle(String a, String e, int d, int g, String f){
        String b = "";
        String c;
        
        
        if (a.equals(b)){
            c = " ";
        }else{
            c = a +" - "+ e +" - "+f+ " - " + "ING"+d + "Grp"+g;
        }
        return c;
    }
}
