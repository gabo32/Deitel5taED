/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap04.algoritmos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Programa del promedio de una clase mediante la repeticion controlada por
 * contador
 *
 * @author JuanVaio
 */
public class Promedio2 {

    public static void main(String[] args) {
        int total;
        int contadorCalif;
        int calificacion;

        double promedio;

        String cadenaCalif;

        //fase de inicializacion
        total = 0;
        contadorCalif = 1;

        //fase de procesamiento
        //obtener la priemdia calificacion del usuario
        cadenaCalif = JOptionPane.showInputDialog("Escriba calificacion como entero o -1 para salir");

        //convertir cadenacalif en int
        calificacion = Integer.parseInt(cadenaCalif);

        while (calificacion != -1) {
            total = total + calificacion;
            contadorCalif = contadorCalif + 1;

            //pedir la entrada y leer la calificacion del usuario
            cadenaCalif = JOptionPane.showInputDialog("Escriba calificacion como entero o -1 para salir");

            //convertir a entero
            calificacion = Integer.parseInt(cadenaCalif);

            total = total + calificacion;
        }

        //fase de terminacion
        DecimalFormat dosDigitos = new DecimalFormat("0.00");

        //si el usuario introdujo al menos una calificacion
        if (contadorCalif != 0) {
            //calcular el promedio de todas las calificaciones
            promedio = (double) total / contadorCalif;

            //mostrar el promedio
            JOptionPane.showMessageDialog(null, "El promedio de la clase es " + dosDigitos.format(promedio), "Promedio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se introdujero califiaciones", "Promedio", JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }
}
