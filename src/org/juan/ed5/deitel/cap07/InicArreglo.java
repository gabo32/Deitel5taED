/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap07;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * Creacion de un arreglo
 * @author JuanVaio
 */
public class InicArreglo {
    public static void main(String[] args) {
        int arreglo[] = {32,27,64,18,95,14,90,70,60,37};
        
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
