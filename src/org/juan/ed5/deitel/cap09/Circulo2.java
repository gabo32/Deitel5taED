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
public class Circulo2 extends Punto{
    private double radio;
    
    public Circulo2(){
        
    }
    
    public Circulo2(int x,int y,double r){
        //no se tienen estos datos
        //this.x = x;
        //this.y = y;
        setRadio(r);
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
        this.radio = radio;
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
        //no se herendan los datos protected
        //return "Centro = ["+x +", "+y+"]; radio = "+radio;
        return "";
    }
}
