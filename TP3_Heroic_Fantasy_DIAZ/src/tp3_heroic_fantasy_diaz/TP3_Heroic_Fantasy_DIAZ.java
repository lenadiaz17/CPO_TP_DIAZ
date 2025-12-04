/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_diaz;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.baton;
import Armes.Epée;

/**
 *
 * @author user
 */
public class TP3_Heroic_Fantasy_DIAZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Epée excalibur = new Epée("Excalibur", 7, 5);
        Epée durandal = new Epée("Durandal", 4, 7);

        baton chene = new baton("Chêne", 4, 5);
        baton charme = new baton("Charme", 5, 6);

        Magicien m1 = new Magicien("Gandalf", 65, true);
        Magicien m2 = new Magicien("Garcimore", 44, false);

        Guerrier g1 = new Guerrier("Conan", 78, false);
        Guerrier g2 = new Guerrier("Lannister", 45, true);

        System.out.println(excalibur);
        System.out.println(durandal);
        System.out.println(chene);
        System.out.println(charme);
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(g1);
        System.out.println(g2);

        Magicien gandalf2 = new Magicien("Gandalf", 65, true);
        Guerrier conan2 = new Guerrier("Conan", 78, false);


        Epée excalibur2 = new Epée("Excalibur", 7, 5);
        Epée durandal2 = new Epée("Durandal", 4, 7);
        baton chene2 = new baton("Chêne", 4, 5);

       

        m1.ajouterArme(chene);
        m1.ajouterArme(excalibur);
        g1.ajouterArme(durandal);


        m1.equiperParNom("Chêne");
        g1.equiperParNom("Durandal");


        System.out.println(m1);
        System.out.println(g1);
       
       
        g1.seFatiguer();
        System.out.println("Conan vivant ? " + g1.estVivant());

        g1.attaquer(m1);
        System.out.println(m1);
        
        System.out.println("\n=== MORRRRTAL COMBAT ===");

        Magicien novice = new Magicien("Novice",50,false);
        Guerrier chevalier = new Guerrier("Chevalier",80,true);

        novice.ajouterArme(chene);
        novice.ajouterArme(durandal);
        novice.equiperParNom("Chêne");

        chevalier.ajouterArme(charme);
        chevalier.ajouterArme(excalibur);
        chevalier.equiperParNom("Excalibur");

        novice.attaquer(chevalier);
        System.out.println(chevalier);

        chevalier.attaquer(novice);
        System.out.println(novice);

        System.out.println("\nNovice vivant ? " + novice.estVivant());
        System.out.println("Chevalier vivant ? " + chevalier.estVivant());

        System.out.println("\n=== FIN TP3 ===");
    }  
}

