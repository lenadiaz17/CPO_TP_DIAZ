/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_diaz;

/**
 *
 * @author user
 */
public class TP2_relation_1_DIAZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles " + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);
        
        bob.liste_voitures[0] = uneClio;
        bob.nbVoitures = 1 ;
        
        uneClio.proprietaire = bob; 
        
        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(uneAutreClio);

        reno.ajouter_voiture(une2008);
        reno.ajouter_voiture(uneMicra);
        
        System.out.println("\nVoitures de Bob :");
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println(bob.liste_voitures[i]);
        
        }
        System.out.println("\nVoitures de Reno :");
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println(reno.liste_voitures[i]);
        }
        
       
        //bob.liste_voitures
    
    }
}
