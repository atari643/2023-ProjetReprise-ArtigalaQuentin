/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labyrinthe;

/**
 *
 * @author qartigala
 */
public class Salle implements ISalle {

    int x;
    int y;
    /**
     * Création d'une salle
     * @param x abscisse de la salle
     * @param y ordonnee de la salle
     */
    public Salle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public boolean estAdjacente(ISalle autre) {
        if (autre.getX() == x && autre.getY() == y + 1 || autre.getY() == y - 1) {
            return true;
        }
        if(autre.getY()==y && autre.getX()==x+1 || autre.getX()==x-1){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return x + ((x + y) * (x + y + 1) / 2);

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Salle other = (Salle) obj;
        if (this.x != other.x) {
            return false;
        }
        return this.y == other.y;
    }

}
