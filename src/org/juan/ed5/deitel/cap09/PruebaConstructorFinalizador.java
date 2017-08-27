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
public class PruebaConstructorFinalizador {

    public static void main(String[] args) {

        Punto3 punto;
        Circulo4 circulo,circulo2;

        punto = new Punto3(11, 22);
        
        System.out.println("");
        
        circulo = new Circulo4(72, 29, 4.5);
        
        System.out.println("");
        circulo2 = new Circulo4(5, 7, 10.67);
        
        punto = null;
        circulo = null;
        circulo2 = null;
        
        System.out.println("");
        System.gc();
                
    }

}
