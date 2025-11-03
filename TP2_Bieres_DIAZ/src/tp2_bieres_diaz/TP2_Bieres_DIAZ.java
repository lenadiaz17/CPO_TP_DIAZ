/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_diaz;

/**
 *
 * @author user
 */
public class TP2_Bieres_DIAZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls" , 7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        
        BouteilleBiere uneSecondeBiere = new BouteilleBiere("Leffe", 7.0, "Abbaye de Leffe");
        uneSecondeBiere.lireEtiquette();
        
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Barbie biere", 5.3, "Malibu");
        troisiemeBiere.lireEtiquette();
        
        BouteilleBiere quatriemeBiere = new BouteilleBiere("La Ney", 8.0, "Rio de Janeiro");
        quatriemeBiere.lireEtiquette();
        
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("Blair", 6.5, "Abbaye de NYC");
        cinquiemeBiere.lireEtiquette();
        
        uneBiere.Decapsuler();
        System.out.println(uneBiere);
        System.out.println(uneSecondeBiere);
        System.out.println(troisiemeBiere);
        System.out.println(quatriemeBiere);
        System.out.println(cinquiemeBiere);
    }
}
