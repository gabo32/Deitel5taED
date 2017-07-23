/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap6;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * Tirar dado de seis lados 6000 veces
 *
 * @author JuanVaio
 */
public class TirarDado {

    public static void main(String[] args) {
        int frecuencia1 = 0;
        int frecuencia2 = 0;
        int frecuencia3 = 0;
        int frecuencia4 = 0;
        int frecuencia5 = 0;
        int frecuencia6 = 0;
        int cara;

        for (int tiro = 0; tiro < 6000; tiro++) {
            cara = 1 + (int) (Math.random() * 6);

            //determinar el valor
            switch (cara) {
                case 1:
                    ++frecuencia1;
                    break;
                case 2:
                    ++frecuencia2;
                    break;
                case 3:
                    ++frecuencia3;
                    break;
                case 4:
                    ++frecuencia4;
                    break;
                case 5:
                    ++frecuencia5;
                    break;
                case 6:
                    ++frecuencia6;
                    break;
            }
        }
        
        JTextArea areaSalida = new JTextArea();
        
        areaSalida.setText("Cara\tFrecuencia"
                +"\n1\t"+frecuencia1
                +"\n2\t"+frecuencia2
                +"\n3\t"+frecuencia3
                +"\n4\t"+frecuencia4
                +"\n5\t"+frecuencia5
                +"\n6\t"+frecuencia6);
        
        JOptionPane.showMessageDialog(null, areaSalida,"Tirar un dado 6000 veces",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
