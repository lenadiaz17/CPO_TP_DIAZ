package chevauchee_fantastique_diaz;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class case_jeu {
    boolean allume;
    
    public case_jeu(boolean etat){
        allume=etat;
    }
    
    public void eteindre(){
        allume=false;
              
    }
    
    public boolean estAllume(){
        return allume;
    }
    
}
