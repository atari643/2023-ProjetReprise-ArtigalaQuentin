package application;

import java.io.IOException;
import java.util.Collection;
import labyrinthe.ILabyrinthe;
import labyrinthe.ISalle;
import personnages.Heros;
import personnages.IPersonnage;
import personnages.Monstre;
import vue2D.IVue;
import vue2D.sprites.HerosSprite;
import vue2D.sprites.ISprite;
import vue2D.sprites.MonstreSprite;

/**
 *
 * @author arpecher
 */
public class Core {
    /**
     * gestion du sprite du heros
     */
    ISprite heros;
    /**
     * Gestion du labyrinthe
     */
    ILabyrinthe labyrinthe;
    /**
     * gestion du sprite du monstre
     */
    ISprite monstre;

    protected void initLabyrinthe() {
        // creation du labyrinthe
        labyrinthe = new labyrinthe.Labyrinthe();
        chargementLaby("labys/level7.txt");
    }

    protected void initSprites(IVue vue) {
        // creation du heros 
        Heros h = new personnages.Heros(labyrinthe.getEntree());
        this.heros = new HerosSprite(h, labyrinthe);
        vue.add(this.heros);
        int nbMonstre=10;
        for (int i = 0; i < nbMonstre; i++) {
            Monstre m = new personnages.Monstre(labyrinthe.getSortie());
            this.monstre = new MonstreSprite(m, labyrinthe);
            vue.add(this.monstre);
        }
    }

    protected void jeu(IVue vue) {
        // boucle principale
        ISalle destination = null;
        while (!labyrinthe.getSortie().equals(heros.getPosition())) {
            // choix et deplacement
            for (IPersonnage p : vue) {
                Collection<ISalle> sallesAccessibles = labyrinthe.sallesAccessibles(p);
                destination = p.faitSonChoix(sallesAccessibles); // on demande au personnage de faire son choix de salle}
                p.setPosition(destination); // deplacement

            }

            // detection des collisions
            boolean collision = false;
            ISprite monstre = null;
            for (ISprite p : vue) {
                if (p != heros) {
                    if (p.getPosition().equals(heros.getPosition())) {
                        System.out.println("Collision !!");
                        collision = true;
                        monstre = p;
                    }
                }
            }
            if (collision) {
                vue.remove(monstre);
                vue.remove(heros);
                System.out.println("Perdu !");
                System.out.println("Plus que " + vue.size() + " personnages ...");
            }
            temporisation(50);
        }
        System.out.println("Gagné!");
    }

    private void chargementLaby(String fic) {
        try {
            labyrinthe.creerLabyrinthe(fic);
        } catch (IOException eif) {
            System.out.println("Fichier de labyrinthe non-valide");
            System.out.println("Chargement du fichier de secours ...");
            try {
                labyrinthe.clear();
                labyrinthe.creerLabyrinthe("labys/level7.txt");
            } catch (IOException e) {
                System.out.println("Fichier de secours invalide !");
                System.out.println("Erreur de l'application");
                System.exit(1);
            };
        }
    }

    protected void temporisation(int nb) {
        try {
            Thread.sleep(nb); // pause de nb millisecondes
        } catch (InterruptedException ie) {
        };
    }
}
