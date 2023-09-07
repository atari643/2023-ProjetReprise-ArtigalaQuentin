package labyrinthe;

import application.ExceptionInvalidFile;
import java.io.IOException;
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
    public void creerLabyrinthe(String file) throws ExceptionInvalidFile {
        Fichier f = new Fichier(file);
        // dimensions
        largeur = f.lireNombre();
        hauteur = f.lireNombre();
        boolean lecture = true;
        entree = new Salle(f.lireNombre(), f.lireNombre());
        sortie = new Salle(f.lireNombre(), f.lireNombre());
        lecture=this.add(entree);
        lecture=this.add(sortie);
        if(lecture==false){
            throw new ExceptionInvalidFile();
        }
        int x = 0;
        int y = 0;
        while (lecture) {
            x = f.lireNombre();
            y = f.lireNombre();
            if (y == -1) {
                lecture = false;
            } else {
                if (!this.add(new Salle(x, y))) {
                    throw new ExceptionInvalidFile();
                }else{
                    this.add(new Salle(x, y));
                }
            }
        }

    }

    @Override
    public boolean add(ISalle salle) {
        if (salle.getX() < 0 || salle.getX() > largeur) {
            return false;
        }
        if (salle.getY() < 0 || salle.getY() > hauteur) {
            return false;
        }
        if (this.contains(salle)) {
            return false;
        }
        super.add(salle);
        return true;
    }

    @Override
    public Collection<ISalle> sallesAccessibles(IPersonnage bob) {
        Collection<ISalle> sallesAcessibles = new ArrayList<>();
        int positionX = bob.getPosition().getX();
        int positionY = bob.getPosition().getY();
        for (ISalle salle : this) {
            if (salle.estAdjacente(new Salle(positionX, positionY))) {
                sallesAcessibles.add(salle);
            }
        }
        return sallesAcessibles;
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
