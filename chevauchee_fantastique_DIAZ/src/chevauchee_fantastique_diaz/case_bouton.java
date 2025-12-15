/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chevauchee_fantastique_diaz;

/**
 *
 * @author user
 */
import javax.swing.JButton;
import java.awt.Color;

public class case_bouton {

    public class CaseBouton extends JButton {

        int x;
        int y;
        boolean allumee;

        public CaseBouton(int x, int y, boolean allumee) {
            this.x = x;
            this.y = y;
            this.allumee = allumee;

            if (allumee) {
                setText("O");
            } else {
                setText("X");
                setEnabled(false);
            }
        }

        public void eteindre() {
            allumee = false;
            setText("X");
            setEnabled(false);
        }
    }

}
