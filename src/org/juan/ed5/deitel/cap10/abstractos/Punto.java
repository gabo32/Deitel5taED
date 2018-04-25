/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap10.abstractos;

/**
 *
 * @author JuanGB
 */
public class Punto extends Figura{
    private int x;
    private int y;
    
    public Punto(){
        
    }
    
    public Punto(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getX(){
        return this.x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public int getY(){
        return this.y;
    }

    @Override
    public String getNombre() {
        return "punto";
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
