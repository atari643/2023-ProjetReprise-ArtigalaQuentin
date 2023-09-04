package labyrinthe;

import java.io.IOException;
import java.util.Collection;

import personnages.IPersonnage;

/**
 *
 * @author INFO Professors team
 */
public interface ILabyrinthe extends Collection<ISalle>{ 
 
    // cree le labyrinthe a partir d'un fichier 
    public void creerLabyrinthe(String file) throws IOException;

    // renvoie les salles accessibles pour le heros
    public Collection<ISalle> sallesAccessibles(IPersonnage heros);
    
    
    // accesseurs sur l'entree 
    public ISalle getEntree();
    
    // accesseur sur la sortie
    public ISalle getSortie();
    
    // un plus court chemin entre u et v
     public Collection<ISalle> chemin(ISalle u, ISalle v);
     
     // dimensions grille
     public int getLargeur();
     public int getHauteur();
}
