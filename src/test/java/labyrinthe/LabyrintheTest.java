/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package labyrinthe;

import java.util.Collection;
import javax.security.auth.login.FailedLoginException;
import org.junit.Test;
import static org.junit.Assert.*;
import personnages.IPersonnage;

/**
 *
 * @author qartigala
 */
public class LabyrintheTest {

    /**
     * Test de la méthode creerLabyrinthe de la classe Labyrinthe pour le level
     * 2
     */
    @Test
    public void testCreerLabyrintheLv2() {
        Labyrinthe labys = new Labyrinthe();
        labys.creerLabyrinthe("labys/level2.txt");
        for (int i = 1; i < labys.size(); i++) {
            //test si il y a deux salle qui sont les mêmes
            assertFalse(labys.get(i - 1).equals(labys.get(i)));
            //test si une des coordonnée x est négative
            assertFalse(labys.get(i - 1).getX() < 0);
            //test si une des coordonnée y est négative
            assertFalse(labys.get(i - 1).getY() < 0);
            //test si une des coordonnée x est trop grande
            assertFalse(labys.get(i - 1).getX() > labys.getLargeur());
            //test si une des coordonnée y est trop grande
            assertFalse(labys.get(i - 1).getY() > labys.getHauteur());
        }
    }

    /**
     * Test de la méthode creerLabyrinthe de la classe Labyrinthe pour le level
     * 3
     */
    @Test
    public void testCreerLabyrintheLv3() {
        Labyrinthe labys = new Labyrinthe();
        labys.creerLabyrinthe("labys/level3.txt");
        for (int i = 1; i < labys.size(); i++) {
            //test si il y a deux salle qui sont les mêmes
            assertFalse(labys.get(i - 1).equals(labys.get(i)));
            //test si une des coordonnée x est négative
            assertFalse(labys.get(i - 1).getX() < 0);
            //test si une des coordonnée y est négative
            assertFalse(labys.get(i - 1).getY() < 0);
            //test si une des coordonnée x est trop grande
            assertFalse(labys.get(i - 1).getX() > labys.getLargeur());
            //test si une des coordonnée y est trop grande
            assertFalse(labys.get(i - 1).getY() > labys.getHauteur());
        }
    }

    /**
     * Test de la méthode creerLabyrinthe de la classe Labyrinthe pour le level
     * 6
     */
    @Test
    public void testCreerLabyrintheLv6() {
        Labyrinthe labys = new Labyrinthe();
        labys.creerLabyrinthe("labys/level6.txt");
        for (int i = 1; i < labys.size(); i++) {
            //test si il y a deux salle qui sont les mêmes
            assertFalse(labys.get(i - 1).equals(labys.get(i)));
            //test si une des coordonnée x est négative
            assertFalse(labys.get(i - 1).getX() < 0);
            //test si une des coordonnée y est négative
            assertFalse(labys.get(i - 1).getY() < 0);
            //test si une des coordonnée x est trop grande
            assertFalse(labys.get(i - 1).getX() > labys.getLargeur());
            //test si une des coordonnée y est trop grande
            assertFalse(labys.get(i - 1).getY() > labys.getHauteur());
        }
    }

    /**
     * Test de la méthode creerLabyrinthe de la classe Labyrinthe pour le level
     * 7
     */
    @Test
    public void testCreerLabyrintheLv7() {
        Labyrinthe labys = new Labyrinthe();
        labys.creerLabyrinthe("labys/level7.txt");
        for (int i = 1; i < labys.size(); i++) {
            //test si il y a deux salle qui sont les mêmes
            assertFalse(labys.get(i - 1).equals(labys.get(i)));
            //test si une des coordonnée x est négative
            assertFalse(labys.get(i - 1).getX() < 0);
            //test si une des coordonnée y est négative
            assertFalse(labys.get(i - 1).getY() < 0);
            //test si une des coordonnée x est trop grande
            assertFalse(labys.get(i - 1).getX() > labys.getLargeur());
            //test si une des coordonnée y est trop grande
            assertFalse(labys.get(i - 1).getY() > labys.getHauteur());
        }
    }

    /**
     * Test de la méthode creerLabyrinthe de la classe Labyrinthe pour le level
     * 8
     */
    @Test
    public void testCreerLabyrintheLv8() {
        Labyrinthe labys = new Labyrinthe();
        labys.creerLabyrinthe("labys/level8.txt");
        for (int i = 1; i < labys.size(); i++) {
            //test si il y a deux salle qui sont les mêmes
            assertFalse(labys.get(i - 1).equals(labys.get(i)));
            //test si une des coordonnée x est négative
            assertFalse(labys.get(i - 1).getX() < 0);
            //test si une des coordonnée y est négative
            assertFalse(labys.get(i - 1).getY() < 0);
            //test si une des coordonnée x est trop grande
            assertFalse(labys.get(i - 1).getX() > labys.getLargeur());
            //test si une des coordonnée y est trop grande
            assertFalse(labys.get(i - 1).getY() > labys.getHauteur());
        }
    }

    /**
     * Test de la méthode creerLabyrinthe de la classe Labyrinthe pour le level
     * 9
     */
    @Test
    public void testCreerLabyrintheLv9() {
        Labyrinthe labys = new Labyrinthe();
        labys.creerLabyrinthe("labys/level9.txt");
        for (int i = 1; i < labys.size(); i++) {
            //test si il y a deux salle qui sont les mêmes
            assertFalse(labys.get(i - 1).equals(labys.get(i)));
            //test si une des coordonnée x est négative
            assertFalse(labys.get(i - 1).getX() < 0);
            //test si une des coordonnée y est négative
            assertFalse(labys.get(i - 1).getY() < 0);
            //test si une des coordonnée x est trop grande
            assertFalse(labys.get(i - 1).getX() > labys.getLargeur());
            //test si une des coordonnée y est trop grande
            assertFalse(labys.get(i - 1).getY() > labys.getHauteur());
        }
    }

    /**
     * Test de la méthode creerLabyrinthe de la classe Labyrinthe pour le level
     * 10
     */
    @Test
    public void testCreerLabyrintheLv10() {
        Labyrinthe labys = new Labyrinthe();
        labys.creerLabyrinthe("labys/level10.txt");
        for (int i = 1; i < labys.size(); i++) {
            //test si il y a deux salle qui sont les mêmes
            assertFalse(labys.get(i - 1).equals(labys.get(i)));
            //test si une des coordonnée x est négative
            assertFalse(labys.get(i - 1).getX() < 0);
            //test si une des coordonnée y est négative
            assertFalse(labys.get(i - 1).getY() < 0);
            //test si une des coordonnée x est trop grande
            assertFalse(labys.get(i - 1).getX() > labys.getLargeur());
            //test si une des coordonnée y est trop grande
            assertFalse(labys.get(i - 1).getY() > labys.getHauteur());
        }
    }

    /**
     * Test de la méthode creerLabyrinthe de la classe Labyrinthe pour le level
     * 11
     */
    @Test
    public void testCreerLabyrintheLv11() {
        Labyrinthe labys = new Labyrinthe();
        labys.creerLabyrinthe("labys/level11.txt");
        for (int i = 1; i < labys.size(); i++) {
            //test si il y a deux salle qui sont les mêmes
            assertFalse(labys.get(i - 1).equals(labys.get(i)));
            //test si une des coordonnée x est négative
            assertFalse(labys.get(i - 1).getX() < 0);
            //test si une des coordonnée y est négative
            assertFalse(labys.get(i - 1).getY() < 0);
            //test si une des coordonnée x est trop grande
            assertFalse(labys.get(i - 1).getX() > labys.getLargeur());
            //test si une des coordonnée y est trop grande
            assertFalse(labys.get(i - 1).getY() > labys.getHauteur());
        }
    }

    /**
     * Test de la méthode creerLabyrinthe de la classe Labyrinthe pour le level
     * 7
     */
    @Test
    public void testCreerLabyrintheLv12() {
        Labyrinthe labys = new Labyrinthe();
        labys.creerLabyrinthe("labys/level12.txt");
        for (int i = 1; i < labys.size(); i++) {
            //test si il y a deux salle qui sont les mêmes
            assertFalse(labys.get(i - 1).equals(labys.get(i)));
            //test si une des coordonnée x est négative
            assertFalse(labys.get(i - 1).getX() < 0);
            //test si une des coordonnée y est négative
            assertFalse(labys.get(i - 1).getY() < 0);
            //test si une des coordonnée x est trop grande
            assertFalse(labys.get(i - 1).getX() > labys.getLargeur());
            //test si une des coordonnée y est trop grande
            assertFalse(labys.get(i - 1).getY() > labys.getHauteur());
        }
    }

    /**
     * Test de la méthode creerLabyrinthe de la classe Labyrinthe pour le level
     * invalide 1
     */
    @Test
    public void testCreerLabyrintheLvInv1() {
        Labyrinthe labys = new Labyrinthe();
        labys.creerLabyrinthe("labys/levelInvalide1.txt");
        for (int i = 1; i < labys.size(); i++) {
            //test si il y a deux salle qui sont les mêmes
            assertFalse(labys.get(i - 1).equals(labys.get(i)));
            //test si une des coordonnée x est négative
            assertFalse(labys.get(i - 1).getX() < 0);
            //test si une des coordonnée y est négative
            assertFalse(labys.get(i - 1).getY() < 0);
            //test si une des coordonnée x est trop grande
            assertFalse(labys.get(i - 1).getX() > labys.getLargeur());
            //test si une des coordonnée y est trop grande
            assertFalse(labys.get(i - 1).getY() > labys.getHauteur());
        }
    }

    /**
     * Test de la méthode creerLabyrinthe de la classe Labyrinthe pour le level
     * invalide 2
     */
    @Test
    public void testCreerLabyrintheLvInv2() {
        Labyrinthe labys = new Labyrinthe();
        labys.creerLabyrinthe("labys/levelInvalide2.txt");
        for (int i = 1; i < labys.size(); i++) {
            //test si il y a deux salle qui sont les mêmes
            assertFalse(labys.get(i - 1).equals(labys.get(i)));
            //test si une des coordonnée x est négative
            assertFalse(labys.get(i - 1).getX() < 0);
            //test si une des coordonnée y est négative
            assertFalse(labys.get(i - 1).getY() < 0);
            //test si une des coordonnée x est trop grande
            assertFalse(labys.get(i - 1).getX() > labys.getLargeur());
            //test si une des coordonnée y est trop grande
            assertFalse(labys.get(i - 1).getY() > labys.getHauteur());
        }
    }

    /**
     * Test de la méthode creerLabyrinthe de la classe Labyrinthe pour le level
     * invalide 3
     */
    @Test
    public void testCreerLabyrintheLvInv3() {
        Labyrinthe labys = new Labyrinthe();
        labys.creerLabyrinthe("labys/levelInvalide3.txt");
        for (int i = 1; i < labys.size(); i++) {
            //test si il y a deux salle qui sont les mêmes
            assertFalse(labys.get(i - 1).equals(labys.get(i)));
            //test si une des coordonnée x est négative
            assertFalse(labys.get(i - 1).getX() < 0);
            //test si une des coordonnée y est négative
            assertFalse(labys.get(i - 1).getY() < 0);
            //test si une des coordonnée x est trop grande
            assertFalse(labys.get(i - 1).getX() > labys.getLargeur());
            //test si une des coordonnée y est trop grande
            assertFalse(labys.get(i - 1).getY() > labys.getHauteur());
        }
    }

    /**
     * Test de la méthode creerLabyrinthe de la classe Labyrinthe pour le level
     * invalide 4
     */
    @Test
    public void testCreerLabyrintheLvInv4() {
        Labyrinthe labys = new Labyrinthe();
        labys.creerLabyrinthe("labys/levelInvalide4.txt");
        for (int i = 1; i < labys.size(); i++) {
            //test si il y a deux salle qui sont les mêmes
            assertFalse(labys.get(i - 1).equals(labys.get(i)));
            //test si une des coordonnée x est négative
            assertFalse(labys.get(i - 1).getX() < 0);
            //test si une des coordonnée y est négative
            assertFalse(labys.get(i - 1).getY() < 0);
            //test si une des coordonnée x est trop grande
            assertFalse(labys.get(i - 1).getX() > labys.getLargeur());
            //test si une des coordonnée y est trop grande
            assertFalse(labys.get(i - 1).getY() > labys.getHauteur());
        }
    }

}
