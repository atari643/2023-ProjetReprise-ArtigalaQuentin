package vue2D.javafx;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import labyrinthe.ILabyrinthe;
import vue2D.IVue;
import vue2D.AVue;
import vue2D.sprites.ISprite;

/**
*
* @author INFO Professors team
*/
public class Vue extends AVue implements IVue{
    Dessin dessin;
    ILabyrinthe labyrinthe;
    public Scene scene;
    
    public Vue(ILabyrinthe labyrinthe){
        this.labyrinthe=labyrinthe;
        dessin = new Dessin(labyrinthe, this);
        Group root = new Group();
        this.scene = new Scene(root);
        root.getChildren().add(dessin);
    }
    
    @Override
    public void dessiner() {
     	// recopie du fond (image); murs + salles
         dessin.dessinFond();
         dessin.dessinSalle();
         dessin.dessinSprite();
    }	
    @Override
    public boolean add(ISprite sprite){
        super.add(sprite);
        if(sprite instanceof EventHandler){
            System.out.println("registering keylistener");
            this.scene.setOnKeyPressed((EventHandler) sprite);
        }
        return true;
    }

}
