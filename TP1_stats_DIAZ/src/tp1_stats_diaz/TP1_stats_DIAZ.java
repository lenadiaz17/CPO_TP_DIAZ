/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_diaz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TP1_stats_DIAZ {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        int[] des = new int[6];

        System.out.println("Combien de lancers de dé voulez vous faire ? ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i = i + 1) {
            int lancer = generateurAleat.nextInt(6);
            des[lancer] = des[lancer] + 1;
        }

        for (int i = 0; i < 6; i = i + 1) {
            double pourcentage;
            pourcentage = ((double) des[i] / m) * 100;
            System.out.println("Face " + (i + 1) + " : " + des[i] + " = " + pourcentage + "% ");
        }
    }

}
