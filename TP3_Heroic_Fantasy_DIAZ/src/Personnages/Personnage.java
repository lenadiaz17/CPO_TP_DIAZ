package Personnages;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Personnages.Magicien;
import Personnages.Guerrier;

/**
 *
 * @author user
 */
public class Personnage {
    String nom;
    int vie;
    
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
    for (int i = 0; i<personnages.size(); i=i+1){
}
}