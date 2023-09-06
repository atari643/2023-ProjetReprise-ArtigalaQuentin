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
public abstract class APersonnage implements IPersonnage {
    public ISalle position;
    @Override
    public ISalle getPosition() {
        return this.position;
    }

    @Override
    public void setPosition(ISalle s) {
        this.position=s;
    }
    
}
