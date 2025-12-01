/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author user
 */
public class Epée extends Arme {
    int finesse;

    public Epée(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        if (finesse < 0){
            finesse =0;
        
        } else if (finesse > 100){
            finesse =100;
        } else {
            finesse = finesse;
        }
        this.finesse=finesse;
    }

    public int getFinesse() {
        return finesse;
    }

    @Override
    public String toString() {
        return super.toString() + " Epée finesse : " + finesse;
    }
}

