/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author user
 */
public class baton extends Arme {
    int age;

    public baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        if (age < 0){
            age=0;
           
        } else if (age>100){
            age = 100
        } else {
            age = age
        }
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString() + " | Âge : " + age;
    }
}

