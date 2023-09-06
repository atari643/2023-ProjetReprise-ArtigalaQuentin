/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Collection;
import labyrinthe.ISalle;

/**
 *
 * @author qartigala
 */
public class Heros extends APersonnage{
    public ISalle salleChoisi;
    
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
