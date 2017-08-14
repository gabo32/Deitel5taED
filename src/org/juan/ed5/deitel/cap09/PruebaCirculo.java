/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap09;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanVaio
 */
public class PruebaCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(37, 43, 2.5);
        
        String salida ="x es "+circulo.getX() +"\n y es "+circulo.getY() +"\nradio es "+circulo.getRadio();
        
        circulo.setX(35);
        circulo.setY(20);
        circulo.setRadio(4.25);
        
        salida +="\n\nla nueva ubicacion es \n"+circulo;
        
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        
        salida += "\n El diametro es "+dosDigitos.format(circulo.getDiametro());
        
        salida += "\n la circunferencia es "+dosDigitos.format(circulo.getCircunferencia());
        
        salida += "\n El area es "+dosDigitos.format(circulo.getArea());
        
        JOptionPane.showMessageDialog(null, salida);
        
        System.exit(0);
    }
}
