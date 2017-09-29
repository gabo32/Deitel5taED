/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap10.jerarquia;

import javax.swing.JOptionPane;
import org.juan.ed5.deitel.cap09.Circulo4;
import org.juan.ed5.deitel.cap09.Punto3;

/**
 *
 * @author juangb
 */
public class PruebaRelacionJerarquia1 {
    public static void main(String[] args) {
        //asignar a la variable de tipo superclase referencia
        Punto3 punto = new Punto3(30, 50);
        
        //asignar a la referencia de la subclase
        Circulo4 circulo = new Circulo4(120, 89, 2.7);
        
        //invocar a toString
        String salida = "LLamar a tostring de punto3 con la referencia a la superclase \n "+punto.toString();
        
        salida += "\n\n llamar a tostrign de circulo "+circulo.toString();
        
        Punto3 refPunto = circulo;
        salida += "\n\n llamar a tosTring de circulo con referecna a sublcase "+refPunto.toString();
        
        JOptionPane.showMessageDialog(null, salida);
        
        System.exit(0);
        
    }
}
