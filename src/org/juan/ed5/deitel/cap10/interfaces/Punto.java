/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap10.interfaces;

/**
 *
 * @author JuanGB
 */
public class Punto extends Object implements Figura{
    private int x;
    private int y;
    
    public Punto(){
        
    }
    
    public Punto(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public double getArea() {
        return 0.0;
    }

    @Override
    public double getVolumen() {
        return 0.0;
    }

    @Override
    public String getNombre() {
        return "Punto";
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
}
