/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap09;

/**
 * La declaracion de la clase punto representa coordenadas
 * @author JuanVaio
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(){
        System.out.println("COnstructor sin argumentos");
    }
    
    public Punto(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("Constructor de punto "+this);
    }
    
    @Override
    protected void finalize(){
        System.out.println("Finalizador de putno");
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    public String toString(){
        return "["+ x + ", "+y+"]";
    }
    
}
