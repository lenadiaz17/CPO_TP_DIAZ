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
public class Magicien extends Personnage{
    
    boolean confirme;

    public static int nbMagiciens = 0;

    public Magicien(String nom, int vie, boolean confirme) {
        super(nom, vie);
        this.confirme = confirme;
        nbMagiciens++;
    }

    public void setConfirme(boolean c) {
        confirme = c;
    }

    public boolean isConfirme() {
        return confirme;
    }

    @Override
    public void attaquer(Personnage p) {
        int degats = 20;

        if (armeEnMain != null){
            Stirng typeArme = armeEnMain.getClass().getSimpleName();
            if (typeArme.equals("baton")){
                baton b = (baton) armeEnMain;
                degats = degats*b.getAge();
            }
        }

        if (confirme) {
            degats /= 2;
        }

        p.estAttaque(degats);
        this.seFatiguer();
    }
    @Override
    String toString(){
        String etat; 
        if (confirme) {
            etat = "Confirmé";
        } else {
            etat = "Débutant";
        }
        String arme; 
        if (armeEnMain != null){
            arme = armeEnMain.toString();
        } else {
            arme = "Aucune arme";
        }
        return nom + " (Vie : " + vie + ", État : " + etat + ", Arme : " + arme + ")";
    }
    
    
}

    

