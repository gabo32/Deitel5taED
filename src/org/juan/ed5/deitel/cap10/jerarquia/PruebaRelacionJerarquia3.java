/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap10.jerarquia;

import org.juan.ed5.deitel.cap09.Circulo4;
import org.juan.ed5.deitel.cap09.Punto3;

/**
 *
 * @author JuanGB
 */
public class PruebaRelacionJerarquia3 {
    public static void main(String[] args) {
        Punto3 punto;
        Circulo4 circulo = new Circulo4(120,89,2.7);
        
        punto = circulo;
        
        int x = punto.getX();
        int y = punto.getY();
        
        punto.setX(10);
        punto.setY(20);
        punto.toString();
        
        //errores
        //double radio = punto.getRadio();
        //punto.setRadio(33.33)
        //double diametro = punto.getDIametro();
        //double area = punto.getArea();
        
    }
}
