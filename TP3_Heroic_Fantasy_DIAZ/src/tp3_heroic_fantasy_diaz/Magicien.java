/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_diaz;

/**
 *
 * @author user
 */
public class Magicien extends Personnage{
    private boolean confirme;

    public static int nbMagiciens = 0;

    public Magicien(String nom, int vie, boolean confirme) {
        super(nom, vie);
        this.confirme = confirme;
        nbMagiciens++;
    }

    public void setConfirme(boolean c) {
        confirme = c;
    }

    public boolean isConfirme() {
        return confirme;
    }

    @Override
    public void attaquer(Personnage p) {
        int degats = 20;

        if (armeEnMain != null) {
            Armes.Baton b = (armeEnMain instanceof Armes.Baton) ? (Armes.Baton) armeEnMain : null;
            if (b != null) degats *= b.getAge();
        }

        if (confirme) degats /= 2;

        p.estAttaque(degats);
        this.seFatiguer();
    }
}

    
}
