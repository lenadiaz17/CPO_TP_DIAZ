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

        baton Chêne = new baton("Chêne", 4, 5);
        baton charme = new baton("Charme", 5, 6);

        Magicien m1 = new Magicien("Gandalf", 65, true);
        Magicien m2 = new Magicien("Garcimore", 44, false);

        Guerrier g1 = new Guerrier("Conan", 78, false);
        Guerrier g2 = new Guerrier("Lannister", 45, true);

        ArrayList<Personnage> personnages = new ArrayList<>();
        personnages.add(m1);
        personnages.add(m2);
        personnages.add(g1);
        personnages.add(g2);

        System.out.println("Liste des personnages");
        for (int i = 0; i < personnages.size(); i = i + 1) {
        }

    }
}