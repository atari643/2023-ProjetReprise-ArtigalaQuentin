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
    /**
     * L'ensemble des sprites à dessiner 
     */
    private Collection<ISprite> sprites;
    /**
     * Le labyrinthe qui a était défini
     */
    private ILabyrinthe labyrinthe;
    /**
     * L'unite d'échelle graphique
     */
    private int unite = 15;
    /**
     * La scène graphique où l'on dessine 
     */
    private GraphicsContext tampon;
    /**
     * Image du sol
     */
    private Image solImage;
    /**
     * Image des murs
     */
    private Image wallImage;
    /**
     * Image de salles de départ 
     */
    private Image startImage;
    /**
     * Image de salles d'arriver
     */
    private Image endImage;
    /**
     * La lumière du personnage
     */
    private Light.Point light;
    /**
     * Le constructeur de la zone de dessin
     * @param labyrinthe le labyrinthe à déssiner
     * @param sprites la liste des sprites à déssiner 
     */
    public Dessin(ILabyrinthe labyrinthe, Collection<ISprite> sprites) {
        this.sprites = sprites;
        this.labyrinthe = labyrinthe;
        setWidth(labyrinthe.getLargeur() * unite);
        setHeight(labyrinthe.getHauteur() * unite);
        tampon = this.getGraphicsContext2D();
        light = new Light.Point();
        light.setX(labyrinthe.getEntree().getX() * unite);
        light.setY(labyrinthe.getEntree().getY() * unite);
        light.setZ(50);

        light.setColor(Color.WHITE);
        Lighting lighting = new Lighting();
        lighting.setLight(light);
        lighting.setSurfaceScale(5.0);
        this.setEffect(lighting);
        chargementImages();
        dessinFond();
    }
    /**
     * Fonction qui charge les images du fichier icons
     */
    public void chargementImages() {
        solImage = new Image("file:icons/ground.gif");
        wallImage = new Image("file:icons/mur0.gif");
        startImage = new Image("file:icons/down.gif");
        endImage = new Image("file:icons/sortie.gif");

    }
    /**
     * Fonction qui dessine le sol du labyrinthe
     */
    public void dessinFond() {
        tampon.drawImage(solImage, 0, 0, unite * labyrinthe.getLargeur(),
                unite * labyrinthe.getHauteur());
    }
    /**
     * Fonction qui dessine les murs autour des salles
     */
    public void dessinSalle() {
        for (int i = 0; i < labyrinthe.getLargeur(); i++) {
            for (int y = 0; y < labyrinthe.getHauteur(); y++) {
                if (!labyrinthe.contains(new Salle(i, y))) {
                    tampon.drawImage(wallImage, i * unite, y * unite, unite, unite);
                }
            }

        }
        tampon.drawImage(startImage, labyrinthe.getEntree().getX() * unite, labyrinthe.getEntree().getY() * unite, unite, unite);
        tampon.drawImage(endImage, labyrinthe.getSortie().getX() * unite, labyrinthe.getSortie().getY() * unite, unite, unite);

    }
    /**
     * Fonction qui dessine les sprites
     */
    public void dessinSprite() {
        for (ISprite sprite : sprites) {
            if (sprite instanceof HerosSprite) {
                light.setX(sprite.getPosition().getX() * unite);
                light.setY(sprite.getPosition().getY() * unite);
            }
            sprite.dessiner(tampon);

        }
    }

}
