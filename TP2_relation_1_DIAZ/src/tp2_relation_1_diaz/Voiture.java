/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_diaz;

/**
 *
 * @author user
 */
public class Voiture {
    String modele;
    String marque;
    int puissanceCV;
    Personne proprietaire;
    
    Voiture(String unModele, String uneMarque, int unePuissanceCV) {
        modele = unModele;
        marque = uneMarque;
        puissanceCV = unePuissanceCV;
        proprietaire = null;
    }
    
    @Override 
    public String toString(){
        String chaine = modele + "(" + marque + " , " + puissanceCV + "CV)";
        if (proprietaire != null) {
            chaine += " - proprietaire : " + proprietaire.prenom + " " + proprietaire.nom;
        } else {
            chaine += " - pas de proprietaire";
            
        }
        return chaine;
    }
}
