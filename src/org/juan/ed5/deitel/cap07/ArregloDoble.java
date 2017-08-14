/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap07;

import java.awt.Font;
import javax.swing.JApplet;
import javax.swing.JTextArea;

/**
 *
 * @author JuanVaio
 */
public class ArregloDoble extends JApplet {

    int calificaciones[][] = {{77, 68, 86, 73},
    {96, 87, 89, 81},
    {70, 90, 86, 81}};
    int estudiantes, examenes;
    String salida;
    JTextArea areaSalida;

    @Override
    public void init() {
        estudiantes = calificaciones.length;
        examenes = calificaciones[0].length;

        areaSalida = new JTextArea();
        getContentPane().add(areaSalida);

        salida = "El arreglo es \n";
        crearCadena();

        salida += "\n\nCalificacion mas baja " + minima() + "\nCalificacion mas alta " + maxima() + "\n";

        for (int contador = 0; contador < estudiantes; contador++) {
            salida += "\nEl promedio del estudiante " + contador + " es " + promedio(calificaciones[contador]);
        }

        areaSalida.setFont(new Font("Monospaced", Font.PLAIN, 12));

        areaSalida.setText(salida);
    }

    public int minima() {
        int califBaja = calificaciones[0][0];

        for (int fila = 0; fila < estudiantes; fila++) {
            for (int columna = 0; columna < examenes; columna++) {
                if (calificaciones[fila][columna] < califBaja) {
                    califBaja = calificaciones[fila][columna];
                }
            }
        }

        return califBaja;
    }

    public int maxima() {
        int califAlta = calificaciones[0][0];

        for (int fila = 0; fila < estudiantes; fila++) {
            for (int columna = 0; columna < examenes; columna++) {
                if (calificaciones[fila][columna] > califAlta) {
                    califAlta = calificaciones[fila][columna];
                }
            }
        }

        return califAlta;
    }

    public double promedio(int calif[]) {
        int total = 0;

        for (int cuenta = 0; cuenta < calif.length; cuenta++) {
            total += calif[cuenta];
        }

        return (double) total / calif.length;
    }

    public void crearCadena() {
        salida += "               ";
        for (int contador = 0; contador < examenes; contador++) {
            salida += "[" + contador + "]";
        }

        for (int fila = 0; fila < estudiantes; fila++) {
            salida += "\ncalificaciones[" + fila + "]   ";
            for (int columna = 0; columna < examenes; columna++) {
                salida += calificaciones[fila][columna]+"    ";
            }
        }

    }

}
