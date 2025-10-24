/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombreslnt_diaz;

import java.util.Scanner;

/** Saisie et manipulation de nombres 
 * date : 24 octobre 2025
 * @author lena 
 */
public class TP1_manipNombreslnt_DIAZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        int nb1 = sc.nextInt();
        System.out.print("Entrez le deuxième nombre : ");
        int nb2 = sc.nextInt();

        System.out.println("Somme : " + (nb1 + nb2));
        System.out.println("Différence : " + (nb1 - nb2));
        System.out.println("Produit : " + (nb1 * nb2));
        System.out.println("Quotient entier : " + (nb1 / nb2));
        System.out.println("Reste de la division : " + (nb1 % nb2));
    }

}
