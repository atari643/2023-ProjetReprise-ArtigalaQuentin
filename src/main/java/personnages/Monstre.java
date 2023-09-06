/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Collection;
import java.util.Random;
import labyrinthe.ISalle;

/**
 *
 * @author qartigala
 */
public class Monstre extends APersonnage {
    protected ISalle salleChoisi;
    
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
