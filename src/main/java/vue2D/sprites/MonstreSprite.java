/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue2D.sprites;

import javafx.scene.image.Image;
import labyrinthe.ILabyrinthe;
import personnages.IPersonnage;
import personnages.Monstre;

/**
 *
 * @author qartigala
 */
public class MonstreSprite extends ASprite{
    protected Monstre monstre;

    public MonstreSprite(Monstre monstre, ILabyrinthe labyrinthe) {
        super(monstre, new Image("file:icons/monstre0.gif"));
        this.monstre = monstre;
    }
    

    
}
