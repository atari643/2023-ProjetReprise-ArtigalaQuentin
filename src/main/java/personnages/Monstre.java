/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Collection;
import java.util.Random;
import labyrinthe.ISalle;

/**
 * La classe qui permet de créer un monstre et de choisir une salle pour le déplacer 
 * @author qartigala
 */
public class Monstre extends APersonnage {
    /**
     * La salle choisi aléatoirement pour déplacer le monstre
     */
    protected ISalle salleChoisi;
    /**
     * Contructeur d'une personnage qui est un monstre
     * @param salle la salle dans lequel il est positionné
     */
    public Monstre(ISalle salle){
         super.setPosition(salle);
    }
    @Override
    public ISalle faitSonChoix(Collection<ISalle> sallesAccessibles) {
        Random rd = new Random();
        int i = rd.nextInt(sallesAccessibles.size());
        int in = 0;
        for(ISalle salle:sallesAccessibles){
            if(i==in){
                return salle;
            }
            in++;
        }
        return this.getPosition();
        
        
    }
}
