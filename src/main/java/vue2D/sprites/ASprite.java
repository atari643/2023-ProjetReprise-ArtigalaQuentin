/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue2D.sprites;

import java.util.Collection;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import labyrinthe.ISalle;
import labyrinthe.Salle;
import personnages.IPersonnage;

/**
 *
 * @author qartigala
 */
public abstract class ASprite implements ISprite {
    /**
     * l'attribut qui contient le personnage 
     */
    protected IPersonnage personnage;
    /**
     * L'attribut qui contient la position abscisse du sprite du personnage
     */
    protected int xSprite;
    /**
     * L'attribut qui contient la position ordonnée du sprite du personnage
     */
    protected int ySprite;
    /**
     * L'attribut qui contient l'image du sprite du personnage 
     */
    protected Image imgSprite;

    /**
     * Contructeur du sprite
     *
     * @param personnage Un personnage
     * @param imgSprite une image du sprite
     */
    public ASprite(IPersonnage personnage, Image imgSprite) {
        this.personnage = personnage;
        this.imgSprite = imgSprite;
    }

    @Override
    public void dessiner(GraphicsContext g) {
        g.drawImage(imgSprite, xSprite, ySprite);
    }

    @Override
    public void setCoordonnees(int xpix, int ypix) {
        this.xSprite = xpix;
        this.ySprite = ypix;
    }

    @Override
    public ISalle getPosition() {
        return personnage.getPosition();
    }

    @Override
    public void setPosition(ISalle s) {
        personnage.setPosition(s);
    }

    @Override
    public ISalle faitSonChoix(Collection<ISalle> sallesAccessibles) {
        return personnage.faitSonChoix(sallesAccessibles);
    }
}
