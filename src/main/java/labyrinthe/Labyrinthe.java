package labyrinthe;

import java.util.ArrayList;
import java.util.Collection;
import outils.Fichier;
import personnages.IPersonnage;

/**
 *
 * @author INFO Professors team
 */
public class Labyrinthe extends ArrayList<ISalle> implements ILabyrinthe {

    protected ISalle entree;
    protected ISalle sortie;
    private int largeur;
    private int hauteur;

    @Override
    public void creerLabyrinthe(String file) {
        Fichier f = new Fichier(file);
        // dimensions
        largeur=f.lireNombre(); 
        hauteur=f.lireNombre(); 
        entree=new Salle(f.lireNombre(), f.lireNombre());
        sortie=new Salle(f.lireNombre(), f.lireNombre());
        this.add(entree);
        this.add(sortie);
        int x = 0;
        int y=0;
        while(x>=0 && y>=0){
            x=f.lireNombre();
            y=f.lireNombre();
            this.add(new Salle(x, y));
        }
        
    }

    @Override
    public Collection<ISalle> sallesAccessibles(IPersonnage bob) {
        return null;
    }

    @Override
    public ISalle getEntree() {
        return entree;
    }

    @Override
    public ISalle getSortie() {
        return sortie;
    }

    @Override
    public Collection<ISalle> chemin(ISalle u, ISalle v) {
        return null;
    }

    @Override
    public int getLargeur() {
        return largeur;
    }

    @Override
    public int getHauteur() {
        return hauteur;
    }

}

