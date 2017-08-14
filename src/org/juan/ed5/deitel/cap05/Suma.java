/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap05;

import javax.swing.JOptionPane;

/**
 * Suma de enteros con la instruccion for
 * @author JuanVaio
 */
public class Suma {
    public static void main(String[] args) {
        int total = 0;
        
        for (int numero = 2; numero <= 100; numero+=2) {
            total+= numero;
        }
        
        //mostrar resultado
        JOptionPane.showMessageDialog(null, "La suma es "+total,"suma",JOptionPane.INFORMATION_MESSAGE);
    }
}
