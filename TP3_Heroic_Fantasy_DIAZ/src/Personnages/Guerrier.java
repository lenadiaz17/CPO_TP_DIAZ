/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import tp3_heroic_fantasy_diaz.Personnage;

/**
 *
 * @author user
 */
public class Guerrier extends Personnage {
    
    boolean cheval;
    
    public static int nbGuerriers=0;
    
    public Guerrier(String nom, int vie, boolean cheval){
        super(nom, vie);
        this.cheval = cheval;
        nbGuerriers++;
    }
    
    public void setCheval(boolean c){
        cheval = c;
    }
    
    @Override
    public void attaquer (Personnage p){
        int degats=30;
        if (armeEnMain != null){
            String typeArme
        }
    }
    
    
    
    
}
