/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package labyrinthe;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author qartigala
 */
public class SalleTest {

    /**
     * Test of getX method, of class Salle.
     */
    @Test
    public void testGetX() {
        Salle salle1 = new Salle(0, 0);
        assertEquals(0, salle1.getX());
        Salle salle2 = new Salle(1, 0);
        assertEquals(1, salle2.getX());
        for (int i = 0; i < 100; i++) {
            Salle salle = new Salle(i, 0);
            assertEquals(i, salle.getX());
        }
    }

    /**
     * Test of getY method, of class Salle.
     */
    @Test
    public void testGetY() {
        Salle salle1 = new Salle(0, 0);
        assertEquals(0, salle1.getY());
        Salle salle2 = new Salle(0, 1);
        assertEquals(1, salle2.getY());
        for (int i = 0; i < 100; i++) {
            Salle salle = new Salle(0, i);
            assertEquals(i, salle.getY());
        }
    }

    /**
     * Test of estAdjacente method, of class Salle.
     */
    @Test
    public void testEstAdjacente() {
        Salle salle1 = new Salle(0, 0);
        Salle salle2 = new Salle(1, 0);
        assertTrue(salle1.estAdjacente(salle2));
        assertTrue(salle2.estAdjacente(salle1));
        Salle salle3 = new Salle(0, 1);
        Salle salle4 = new Salle(1, 0);
        assertFalse(salle3.estAdjacente(salle4));
        assertFalse(salle4.estAdjacente(salle3));
        Salle salle5 = new Salle(0, 0);
        Salle salle6 = new Salle(0, 1);
        assertTrue(salle5.estAdjacente(salle6));
        assertTrue(salle6.estAdjacente(salle5));
        for (int i = 0; i < 100; i++) {
            Salle salle7 = new Salle(i, i);
            Salle salle8 = new Salle(i, i);
            assertFalse(salle7.estAdjacente(salle8));
            assertFalse(salle8.estAdjacente(salle7));
        }

    }

    /**
     * Test of hashCode method, of class Salle.
     */
    @Test
    public void testHashCode() {
        Salle salle1 = new Salle(0, 0);
        Salle salle2 = new Salle(0, 1);
        assertTrue(salle1.hashCode() != salle2.hashCode());
    }

    /**
     * Test of equals method, of class Salle.
     */
    @Test
    public void testEquals() {
        Salle salle1 = new Salle(0, 0);
        Salle salle2 = new Salle(0, 0);
        assertTrue(salle1.equals(salle2));
        for (int i = 0; i < 100; i++) {
            Salle salle3 = new Salle(i, 0);
            Salle salle4 = new Salle(i, 0);
            assertTrue(salle3.equals(salle4));
            assertTrue(salle4.equals(salle3));
        }
        for (int i = 0; i < 100; i++) {
            Salle salle3 = new Salle(0, i);
            Salle salle4 = new Salle(0, i);
            assertTrue(salle3.equals(salle4));
            assertTrue(salle4.equals(salle3));
        }
        for (int i = 0; i < 100; i++) {
            Salle salle3 = new Salle(i, i);
            Salle salle4 = new Salle(i, i);
            assertTrue(salle3.equals(salle4));
            assertTrue(salle4.equals(salle3));
        }
    }

}
