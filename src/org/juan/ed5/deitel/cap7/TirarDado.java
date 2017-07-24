/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap7;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author JuanVaio
 */
public class TirarDado {
    public static void main(String[] args) {
        int frecuencia[] = new int[7];
        
        for (int tiro = 1; tiro <=6000; tiro++) {
            ++frecuencia[1 +(int)(Math.random()*6)];
        }
        
        String salida = "Cara\tFrecuencia";
        
        for (int cara= 1; cara < frecuencia.length; cara++) {
            salida += "\n"+cara +"\t"+frecuencia[cara];
        }
        
        JTextArea areaSalida = new JTextArea();
        areaSalida.setText(salida);
        
        JOptionPane.showMessageDialog(null, areaSalida,"Tirar dato",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
