/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_diaz;

/**
 *
 * @author user
 */
public class TP2_manip_DIAZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        Tartiflette assiette3 = assiette2;

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        
        //Modif assiette 2
        assiette2.nbCalories = assiette2.nbCalories + 100;

        System.out.println("Après modification :");
        System.out.println("Assiette2 : " + assiette2.nbCalories);
        System.out.println("Assiette3 : " + assiette3.nbCalories);
        
        //Echange entre assiette 1 et assiette 2
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;
        
        
        System.out.println("Après échange :");
        System.out.println("Assiette1 : " + assiette1.nbCalories);
        System.out.println("Assiette2 : " + assiette2.nbCalories);

        //tableau de 10 moussakas
        Moussaka[] tableau = new Moussaka[10];
        for (int i = 0; i < 10; i++) {
            tableau[i] = new Moussaka(400 + i * 10);
            System.out.println("Moussaka " + i + " : " + tableau[i].nbCalories + " calories");
        }
    }
}
