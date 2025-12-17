/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chevauchee_fantastique_diaz;

/**
 *
 * @author user
 */
public class damier {
    int taille=6;
    case_jeu[][] cases;
    
    public damier(){
        cases = new case_jeu[taille][taille];
        
        for (int i=0; i<taille; i++){
            for (int j=0; j<taille; j++){
                cases[i][j] = new case_jeu(true);
            }
        }
    }
    
    public case_jeu getCase(int ligne, int colonne){
        return cases[ligne][colonne];
    }
}

   
