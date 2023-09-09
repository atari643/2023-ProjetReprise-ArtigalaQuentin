/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue2D.sprites;

import java.util.Collection;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import labyrinthe.ILabyrinthe;
import labyrinthe.ISalle;
import labyrinthe.Salle;
import personnages.Heros;

/**
 * La classe qui permet de créer le sprite du personnage et de le déplacer
 * @author qartigala
 */
public class HerosSprite extends ASprite implements EventHandler<KeyEvent> {
    /**
     * L'attribut qui contient le personnage du heros
     */
    protected Heros heros;
    /**
     * L'attribut qui contient la direction du heros
     */
    protected String direction;
    /**
     * Fonction qui créer le sprite du heros 
     * @param heros le heros 
     * @param labyrinthe le labyrinthe  
     */
    public HerosSprite(Heros heros, ILabyrinthe labyrinthe) {
        super(heros, new Image("file:icons/link/LinkRunShieldL1.gif"));
        this.heros = heros;
    }


    @Override
    public ISalle faitSonChoix(Collection<ISalle> sallesAccessibles) {
        if (sallesAccessibles.contains(heros.salleChoisi)) {
            switch (direction) {
                case "LEFT":
                    super.setCoordonnees(xSprite - 15, ySprite);
                    this.imgSprite = new Image("file:icons/link/LinkRunShieldL" + (xSprite % 6 != 0 ? xSprite % 6 : 1) + ".gif");
                    break;
                case "UP":
                    super.setCoordonnees(xSprite, ySprite - 15);
                    this.imgSprite = new Image("file:icons/link/LinkRunU" + (ySprite % 8 != 0 ? ySprite % 8 : 1) + ".gif");
                    break;
                case "DOWN":
                    super.setCoordonnees(xSprite, ySprite + 15);
                    this.imgSprite = new Image("file:icons/link/LinkRunShieldD" + (ySprite % 6 != 0 ? ySprite % 6 : 1) + ".gif");
                    break;
                case "RIGHT":
                    super.setCoordonnees(xSprite + 15, ySprite);
                    this.imgSprite = new Image("file:icons/link/LinkRunR" + (xSprite % 6 != 0 ? xSprite % 6 : 1) + ".gif");
                    break;
            }
            return heros.salleChoisi;
        } else {
            setCoordonnees(personnage.getPosition().getX() * 15 - 5, personnage.getPosition().getY() * 15 - 15);
            return getPosition();
        }
    }

    @Override
    public void handle(KeyEvent t) {
        switch (t.getCode()) {
            case LEFT:
                heros.salleChoisi = new Salle(heros.getPosition().getX() - 1, heros.getPosition().getY());
                direction = "LEFT";
                break;
            case UP:
                heros.salleChoisi = new Salle(heros.getPosition().getX(), heros.getPosition().getY() - 1);
                direction = "UP";
                break;
            case RIGHT:
                heros.salleChoisi = new Salle(heros.getPosition().getX() + 1, heros.getPosition().getY());
                direction = "RIGHT";
                break;
            case DOWN:
                heros.salleChoisi = new Salle(heros.getPosition().getX(), heros.getPosition().getY() + 1);
                direction = "DOWN";
                break;

        }
    }

}
