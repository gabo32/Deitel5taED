/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap09;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanVaio
 */
public class Circulo4 extends Punto3 {

    private double radio;

    public Circulo4() {
        //implicita al contrustructor padre
        System.out.println("constructor sin argumentos de circulo "+this);
    }

    public Circulo4(int x, int y, double r) {
        //no se tienen estos datos
        super(x, y);
        setRadio(r);
        
        System.out.println("constructor de circulo "+this);
    }
    
    @Override
    protected void finalize(){
        try {
            System.out.println("Finalizador de circulo !"+this);
            
            super.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(Circulo4.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        this.radio = (radio < 0.0 ? 0.0 : radio);
    }

    public double getDiametro() {
        return 2 * radio;
    }

    public double getCircunferencia() {
        return Math.PI * getDiametro();
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        //no se herendan los datos protected
        return "Centro = "+super.toString() +" ; radio = " + getRadio();
    }
}
