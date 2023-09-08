package vue2D.javafx;

import java.util.Collection;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import labyrinthe.ILabyrinthe;
import labyrinthe.ISalle;
import labyrinthe.Salle;
import vue2D.sprites.HerosSprite;
import vue2D.sprites.ISprite;

/**
 *
 * @author INFO Professors team
 */
public class Dessin extends Canvas {

    private Collection<ISprite> sprites;
    private ILabyrinthe labyrinthe;
    private int unite = 15;
    private GraphicsContext tampon;
    private Image solImage;
    private Image wallImage;
    private Image startImage;
    private Image endImage;
    private Light.Point light;

    public Dessin(ILabyrinthe labyrinthe, Collection<ISprite> sprites) {
        this.sprites = sprites;
        this.labyrinthe = labyrinthe;
        setWidth(labyrinthe.getLargeur() * unite);
        setHeight(labyrinthe.getHauteur() * unite);
        tampon = this.getGraphicsContext2D();
        light=new Light.Point();
        light.setX(labyrinthe.getEntree().getX()*unite);
        light.setY(labyrinthe.getEntree().getY()*unite);
        light.setZ(50);
        
        light.setColor(Color.WHITE);
        Lighting lighting = new Lighting();
        lighting.setLight(light);
        lighting.setSurfaceScale(5.0);
        this.setEffect(lighting);
        chargementImages();
        dessinFond();
    }

    public void chargementImages() {
        solImage = new Image("file:icons/ground.gif");
        wallImage = new Image("file:icons/mur0.gif");
        startImage=new Image("file:icons/down.gif");
        endImage = new Image("file:icons/sortie.gif");

    }

    public void dessinFond() {
        tampon.drawImage(solImage, 0, 0, unite * labyrinthe.getLargeur(),
                unite * labyrinthe.getHauteur());
    }

    public void dessinSalle() {
        for (int i = 0; i<labyrinthe.getLargeur();i++){
            for(int y=0;y<labyrinthe.getHauteur();y++){
                if(!labyrinthe.contains(new Salle(i,y))){
                    tampon.drawImage(wallImage,i * unite, y * unite, unite, unite);
                }
            }
            
        }
        tampon.drawImage(startImage,labyrinthe.getEntree().getX() * unite, labyrinthe.getEntree().getY() * unite, unite, unite);
        tampon.drawImage(endImage,labyrinthe.getSortie().getX() * unite, labyrinthe.getSortie().getY() * unite, unite, unite);

    }

    public void dessinSprite() {
        for (ISprite sprite : sprites) {
            if(sprite instanceof HerosSprite){
                light.setX(sprite.getPosition().getX()*unite);
                light.setY(sprite.getPosition().getY()*unite);
            }
            sprite.dessiner(tampon);
        }
    }

}
