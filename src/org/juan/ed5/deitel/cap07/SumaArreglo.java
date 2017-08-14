/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap07;

import javax.swing.JOptionPane;

/**
 * sumar el total de los valores de los elementos de un arreglo
 * @author JuanVaio
 */
public class SumaArreglo {
    public static void main(String[] args) {
        int arreglo[] = {1,2,3,4,5,6,7,8,9,10};
        int total = 0;
        
        for (int contador = 0; contador < arreglo.length; contador++) {
            total += arreglo[contador];
        }
        
        JOptionPane.showMessageDialog(null, "Total de elementos"+total,"sumar",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
