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
public class Circulo extends Punto{
    private double radio;
    
    
    public Circulo(){
        
    }
    
    public Circulo(int x,int y, double radio){
        super(x,y);
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = (radio <0.0 ?0.0 :radio);
    }
    
    public double getDiametro(){
        return 2*getRadio();
    }
    
    public double getCircunferencia(){
        return Math.PI*getDiametro();
    }
    
    @Override
    public double getArea(){
        return Math.PI *getRadio()*getRadio();
    }
    
    
    public String getNombre(){
        return "Circulo";
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    
    
    
    
}
