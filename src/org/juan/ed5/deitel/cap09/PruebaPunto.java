/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap09;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanVaio
 */
public class PruebaPunto {
    public static void main(String[] args) {
        Punto punto = new Punto(72,115);
        
        String salida = "La coordenada x es "+punto.getX() +"\nla coordenada y "+punto.getY();
        
        punto.setX(10);
        punto.setY(20);
        
        salida += "\n\nLa nueva ubicacion es "+punto;
        
        JOptionPane.showMessageDialog(null,salida);
        
        System.exit(0);
    }
}
