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
public class PruebaCilindro {
     public static void main(String[] args) {
        Cilindro cilindro = new Cilindro(37, 43, 2.5,5.7);
        
        String salida ="x es "+cilindro.getX() +"\n y es "+cilindro.getY() 
                +"\nradio es "+cilindro.getRadio()
                +"\nla altura es "+cilindro.getAltura();
        
        cilindro.setX(35);
        cilindro.setY(20);
        cilindro.setRadio(4.25);
        cilindro.setAltura(10.75);
        
        salida +="\n\nla nueva ubicacion es \n"+cilindro;
        
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        
        salida += "\n El diametro es "+dosDigitos.format(cilindro.getDiametro());
        
        salida += "\n la circunferencia es "+dosDigitos.format(cilindro.getCircunferencia());
        
        salida += "\n El area es "+dosDigitos.format(cilindro.getArea());
        
        salida += "\n El volumen es "+dosDigitos.format(cilindro.getVolumen());
        
        JOptionPane.showMessageDialog(null, salida);
        
        System.exit(0);
    }
}
