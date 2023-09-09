package vue2D;


import java.util.concurrent.CopyOnWriteArrayList;
import labyrinthe.ISalle;
import vue2D.sprites.ISprite;

/**
 *
 * @author INFO Professors team
 */
public abstract class AVue extends CopyOnWriteArrayList<ISprite> implements IVue {
    /**
     * C'est l'unité d'échelle graphique
     */
    static final int UNITE = 15;

    @Override
    public boolean add(ISprite sprite) {
        super.add(sprite);
        ISalle s = sprite.getPosition();
        sprite.setCoordonnees(s.getX() * UNITE, s.getY() * UNITE);
        return true;
    }

}
