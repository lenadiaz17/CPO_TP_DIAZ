/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chevauchee_fantastique_diaz;

/**
 *
 * @author user
 */
public class cavalier {
    int x;
    int y;

    public cavalier(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplacer(int newX, int newY) {
        x = newX;
        y = newY;
    }
    
}
