/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue2D.sprites;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import personnages.IPersonnage;


/**
 *
 * @author qartigala
 */
public abstract class ASprite implements ISprite {
    
    protected IPersonnage personnage;
    protected int xSprite;
    protected int ySprite;
    protected Image imgSprite;
    /**
     * Contructeur du sprite 
     * @param personnage Un personnage
     * @param imgSprite une image du sprite 
     */
    public ASprite(IPersonnage personnage, Image imgSprite){
        this.personnage=personnage;
        this.imgSprite=imgSprite;
    }
    @Override
    public void dessiner(GraphicsContext g) {
        g.drawImage(imgSprite, xSprite, xSprite);
    }

    @Override
    public void setCoordonnees(int xpix, int ypix) {
        this.xSprite=xpix;
        this.ySprite=ypix;
    }
    
}
