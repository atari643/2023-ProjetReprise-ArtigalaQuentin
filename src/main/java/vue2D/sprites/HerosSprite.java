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
 *
 * @author qartigala
 */
public class HerosSprite extends ASprite implements EventHandler<KeyEvent> {

    protected Heros heros;

    public HerosSprite(Heros heros, ILabyrinthe labyrinthe) {
        super(heros, new Image("file:icons/link/LinkRunShieldL1.gif"));
        this.heros = heros;
    }

    @Override
    public void handle(KeyEvent t) {
        switch (t.getCode()) {
            case LEFT:
                heros.salleChoisi=new Salle(heros.getPosition().getX()-1, heros.getPosition().getY());
                break;
            case UP:
                heros.salleChoisi=new Salle(heros.getPosition().getX(), heros.getPosition().getY()-1);
                break;
            case RIGHT:
                heros.salleChoisi=new Salle(heros.getPosition().getX()+1, heros.getPosition().getY());
                break;
            case DOWN:
                heros.salleChoisi=new Salle(heros.getPosition().getX(), heros.getPosition().getY()+1);
                break;

        }
    }

}
