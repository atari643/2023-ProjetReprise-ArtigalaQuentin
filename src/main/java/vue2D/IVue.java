package vue2D;

import java.util.Collection;

import vue2D.sprites.ISprite;

/**
*
* @author INFO Professors team
*/
public interface IVue extends Collection<ISprite>{
    /**
     * Fonction qui permet de dessiner des éléments graphiques
     */
    public void dessiner();
    
}
