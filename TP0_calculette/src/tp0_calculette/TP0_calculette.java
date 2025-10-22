/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        System.out.print("Choisi un nombre entre 1 et 5 : ");
        int operateur = sc.nextInt();

        System.out.print("Entrer le premier nombre : ");
        int operande1 = sc.nextInt();

        System.out.print("Entrer le second nombre : ");
        int operande2 = sc.nextInt();

        if (operateur == 1) {
            int resultat = operande1 + operande2;
            System.out.println("Resultat : " + resultat);
        } else if (operateur == 2) {
            int resultat = operande1 - operande2;
            System.out.println("Resultat : " + resultat);
        } else if (operateur == 3) {
            int resultat = operande1 * operande2;
            System.out.println("Resultat : " + resultat);
        } else if (operateur == 4) {
            if (operande2 != 0) {
                int resultat = operande1 / operande2;
                System.out.println("Result: " + resultat);
            } else if (operateur == 5) {
                int resultat = operande1 % operande2;
                System.out.println("Resultat :" + resultat);
            }
        }
    }
}

