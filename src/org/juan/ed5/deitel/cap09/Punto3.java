/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap09;

/**
 * la mejor forma de hacerlo
 * @author JuanVaio
 */
public class Punto3 {
    private int x;
    private int y;
    
    public Punto3(){
        System.out.println("COnstructor sin argumentos");
    }
    
    public Punto3(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("Constructor de punto "+this);
    }
    
    @Override
    protected void finalize() throws Throwable{
        try {
            System.out.println("Finalizador de putno");
        } finally {
            super.finalize();
        }
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
        return "["+getX()+", "+getY()+"]";
    }
}
