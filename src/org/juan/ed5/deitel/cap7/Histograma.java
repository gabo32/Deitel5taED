/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap7;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * Imprimir histogramas
 * @author JuanVaio
 */
public class Histograma {
    public static void main(String[] args) {
        int arreglo[] = {19,3,15,7,11,9,13,17,1};
        
        String salida = "Elemento\tvalor\tHistograma";
        
        //
        for (int contador = 0; contador < arreglo.length; contador++) {
            salida += "\n"+contador +"\t"+arreglo[contador]+"\t";
            for (int estrellas = 0; estrellas < arreglo[contador]; estrellas++) {
                salida += "*";
            }
        }
        
        JTextArea areaSalida = new JTextArea();
        areaSalida.setText(salida);
        
        JOptionPane.showMessageDialog(null, areaSalida,"Histograma",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
