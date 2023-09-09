/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Collection;
import labyrinthe.ISalle;

/**
 * La classe qui permet de créer un heros et de choisir une salle pour ce déplacer 
 * @author qartigala
 */
public class Heros extends APersonnage{
    /**
     * La salle choisi par le joueur pour déplacer le héros
     */
    public ISalle salleChoisi;
    /**
     * Contructeur d'une personnage qui est un héros
     * @param salle la salle dans lequel il est positionné
     */
    public Heros(ISalle salle){
         super.setPosition(salle);
    }
    @Override
    public ISalle faitSonChoix(Collection<ISalle> sallesAccessibles) {
        if(sallesAccessibles.contains(salleChoisi)){
            return salleChoisi;
        }else{
            return super.getPosition();
        }
        
    }
    
}
