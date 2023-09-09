/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue2D.sprites;

import java.util.Collection;
import javafx.scene.image.Image;
import labyrinthe.ILabyrinthe;
import labyrinthe.ISalle;
import personnages.IPersonnage;
import personnages.Monstre;

/**
 * La classe qui permet de créer le sprite du personnage et de le déplacer
 * @author qartigala
 */
public class MonstreSprite extends ASprite{
     /**
     * L'attribut qui contient le personnage du monstre
     */
    protected Monstre monstre;
    /**
     * Constructeur du sprites du monstre 
     * @param monstre le monstre
     * @param labyrinthe le labyrinthe
     */
    public MonstreSprite(Monstre monstre, ILabyrinthe labyrinthe) {
        super(monstre, new Image("file:icons/monstre0.gif"));
        this.monstre = monstre;
    }
    @Override
    public ISalle faitSonChoix(Collection<ISalle> sallesAccessibles) {
        setCoordonnees(monstre.getPosition().getX()*15-5, monstre.getPosition().getY()*15-15);
        return monstre.faitSonChoix(sallesAccessibles);
    }
    

    
}
