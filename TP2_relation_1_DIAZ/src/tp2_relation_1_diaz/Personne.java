/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_diaz;

/**
 *
 * @author user
 */
public class Personne {

    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;

    Personne(String unNom, String unPrenom) {
        prenom = unPrenom;
        nom = unNom;
        nbVoitures = 0;
        liste_voitures = new Voiture[3];

    }

    @Override
    public String toString() {
        String chaine = prenom + " " + nom + " possède " + nbVoitures + " voitures";
        for (int i = 0; i < nbVoitures; i++) {
            chaine += "\n\t" + liste_voitures[i];
        }

return chaine;
}
    
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null){
            System.out.println("Erreur : voiture volée");
            return false
        }
        if (nbVoitures >= 3) {
            System.out.println("Erreur : " + prenom + " possede deja 3 voitures");
            return false
        }
        lise_voitures[nbVoitures]= voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.proprietaire = this;
        return true 
    }
}