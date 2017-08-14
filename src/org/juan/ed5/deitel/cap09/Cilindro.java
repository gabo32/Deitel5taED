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
public class Cilindro extends Circulo4{
    private double altura;
    
    
    public Cilindro(){
        
    }
    
    public Cilindro(int x,int y, double radio,double altura){
        super(x,y,radio);
        setAltura(altura);
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = (altura < 0.0? 0.0:altura);
    }
    
    
    @Override
    public double getArea(){
        return 2*super.getArea() + getCircunferencia()*getAltura();
    }
    
    public double getVolumen(){
        return super.getArea()*getAltura();
    }
    
    @Override
    public String toString(){
        return super.toString() +"; altura= "+getAltura();
    }
    
}
