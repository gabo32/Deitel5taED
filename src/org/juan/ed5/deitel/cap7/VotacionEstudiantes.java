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
public class VotacionEstudiantes {
    public static void main(String[] args) {
        int respuestas[] = { 1,2,6,4,8,5,9,7,8,10,1,6,3,8,6,10,3,8,2,7,6,5,7,6,8,6,7,6,6,5,6,7,5,6,4,8,6,8,10};
        int frecuencia[] = new int[11];
        
        for (int respuesta = 0; respuesta < respuestas.length; respuesta++) {
            ++frecuencia[respuestas[respuesta]];
        }
        
        String salida = "Calificacion\tfrecuencia\n";
        
        for (int calificacion = 1; calificacion < frecuencia.length; calificacion++) {
            salida += calificacion+"\t"+frecuencia[calificacion]+"\n";
        }
        
        JTextArea areaSalida = new JTextArea();
        areaSalida.setText(salida);
        
        JOptionPane.showMessageDialog(null, areaSalida,"Votacion",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
