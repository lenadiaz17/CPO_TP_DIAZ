/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_diaz;

/**
 *
 * @author user
 */
public class Convertisseur {
    int nbConversions;
    public static double CelciusVersKelvin (double c) {return c + 273 ; };
    public static double KelvinVersCelcius(double k) { return k - 273 ; };
    public static double CelciusVersFarenheit(double c) { return c * 9 / 5 + 32; };
    public static double FarenheitVersCelcius(double f) { return (f - 32) * 5 / 9; }; 
    public static double KelvinVersFarenheit(double k) { return (CelciusVersFarenheit(KelvinVersCelcius(k))); };
    public static double FarenheitVersKelvin(double f) { return (CelciusVersKelvin(FarenheitVersCelcius(f))); }; 

    
    @Override
    public String toString() {
        return "nb de conversions " + nbConversions;
    }
}

    
