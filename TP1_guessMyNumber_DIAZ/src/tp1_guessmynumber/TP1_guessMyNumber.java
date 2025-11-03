/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TP1_guessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        int nombreSecret = generateurAleat.nextInt(101);
        int tentative = 0;
        int nombre = -1 ;
        
        System.out.println(" Choisis un nombre entre 0 et 100 ");
        
        while (nombre != nombreSecret){
            System.out.println("Ton nombre : ");
            nombre = sc.nextInt();
            tentative++;
            
            if (nombre < nombreSecret){
                System.out.println("Trop petit !");    
            } else if (nombre > nombreSecret){
                System.out.println("Trop grand !");    
            } else {
                System.out.println("Bravo ! Tu as trouvé en " + tentative + "coups !");
            }
        }
      
    }
    
}
