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
        return false;
    }
    @Override
    public int hashCode(){
        return x+((x+y)*(x+y+1)/2);
        
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        final Salle other = (Salle)obj;
        if(this.x!=other.x){
            return false;
        }
        return this.y==other.y;
    }

}
