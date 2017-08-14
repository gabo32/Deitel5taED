/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap09;

/**
 *
 * @author JuanVaio
 */
public class Circulo {
    private int x;
    private int y;
    private double radio;
    
    public Circulo(){
        
    }
    
    public Circulo(int x,int y,double r){
        this.x = x;
        this.y = y;
        setRadio(r);
        
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

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = (radio<0.0?0.0:radio);
    }
    
    public double getDiametro(){
        return 2*radio;
    }
    
    public double getCircunferencia(){
        return Math.PI*getDiametro();
    }
    
    public double getArea(){
        return Math.PI *radio*radio;
    }
    
    @Override
    public String toString(){
        return "Centro = ["+x +", "+y+"]; radio = "+radio;
    }
}
