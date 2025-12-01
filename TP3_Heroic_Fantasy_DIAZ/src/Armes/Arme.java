/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author user
 */
public class Arme {
    String nom;
    int niveauAttaque;
    
    public Arme(String nom, int niveauAttaque){
        this.nom = nom;
        if (niveauAttaque < 0) {
            niveauAttaque = 0;
        } else if (niveauAttaque > 100){
            niveauAttaque = 100;
        } else {
            niveauAttaque = niveauAttaque;
        }
        this.niveauAttaque = niveauAttaque;
    }
    public String getNom(){
         return this.nom;
    }
    public int getNiveauAttaque(){
        return this.niveauAttaque;
    }
    
    @Override
    public String toString(){
        return nom + " (Attaque : " + niveauAttaque + ")";
    }
}
