/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap7;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * Creacion de un arreglo
 * @author JuanVaio
 */
public class InicArreglo2 {
    public static void main(String[] args) {
        final int LONGITUD_ARREGLO = 10;
        int arreglo[];
        
        arreglo = new int[LONGITUD_ARREGLO];
        
        for (int contador = 0; contador < arreglo.length; contador++) {
            arreglo[contador] = 2+2*contador;
        }
        
        String salida = "indice\tvalor\n";
        for (int contador = 0; contador < arreglo.length; contador++) {
            salida += contador +"\t"+arreglo[contador]+"\n";
        }
        
        JTextArea areaSalida = new JTextArea();
        areaSalida.setText(salida);
        
        JOptionPane.showMessageDialog(null, areaSalida,"Inicializacion de arr",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
