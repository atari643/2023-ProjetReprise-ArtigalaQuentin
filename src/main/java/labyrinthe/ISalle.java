package labyrinthe;

/**
 *
 * @author INFO Professors team
 */
public interface ISalle {
    /**
     * Fonction qui donne l'abscisse de la salle
     * @return l'abssice de la salle
     */
    public int getX(); // abcisse
    /**
     * Fonction qui donne l'ordonnee de la salle
     * @return l'ordonnee de la salle
     */
    public int getY(); // ordonnee
    /**
     * Fonction qui vérifie que deux salles sont adjacente
     * @param autre une salle
     * @return vrai ssi les deux salles sont adjacentes sinon faux
     */
    public boolean estAdjacente( ISalle autre);
}
