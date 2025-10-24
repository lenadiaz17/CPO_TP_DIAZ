package tp1_convertisseur_diaz;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 * convertisseur de température date : 24 octobre 2025
 *
 * @author LENA
 */

public class TP1_convertisseur_DIAZ {
public static double CelciusVersKelvin (double c) {return c + 273 ; };
public static double KelvinVersCelcius(double k) { return k - 273 ; };
public static double CelciusVersFarenheit(double c) { return c * 9 / 5 + 32; };
public static double FarenheitVersCelcius(double f) { return (f - 32) * 5 / 9; }; 
public static double KelvinVersFarenheit(double k) { return (CelciusVersFarenheit(KelvinVersCelcius(k))); };
public static double FarenheitVersKelvin(double f) { return (CelciusVersKelvin(FarenheitVersCelcius(f))); };    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez une température : ");
        double valeur = sc.nextDouble();
        
        System.out.println("Choisissez la conversion :");
        System.out.println("1) Celcius vers Kelvin");
        System.out.println("2) Kelvin vers Celcius");
        System.out.println("3) Celcius vers Farenheit");
        System.out.println("4) Farenheit vers Celcius");
        System.out.println("5) Kelvin vers Farenheit");
        System.out.println("6) Farenheit vers Kelvin");
        
        double result =0; 
        
        int choix = sc.nextInt();
        
        if (choix == 2) {
            result = KelvinVersCelcius(valeur);
        }
        if (choix == 1) {
            result = CelciusVersKelvin(valeur);
        }
        if (choix == 3) {
            result = CelciusVersFarenheit(valeur);
        }
        if (choix == 4) {
            result = FarenheitVersCelcius(valeur);
        }
        if (choix == 5) {
            result = KelvinVersFarenheit(valeur);
        }
        if (choix == 6) {
            result = FarenheitVersKelvin(valeur);
        }
        
        System.out.println("Résultat : " + result);
        
        
        // TODO code application logic here
    }
}
