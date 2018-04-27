/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap10.interfaces;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanGB
 */
public class PruebaInterfaz {
    public static void main(String[] args) {
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        
        Punto punto = new Punto(7, 11);
        Circulo circulo = new  Circulo(22, 8, 3.5);
        Cilindro cilindro = new Cilindro(20, 30, 3.3, 10.75);
        
        
        String salida = punto.getNombre() +": "+ punto+"\n"+
                circulo.getNombre() +": "+ circulo+"\n" +
                cilindro.getNombre() +": "+ cilindro+"\n";
        
        Figura arregloDeFiguras[] = new Figura[3];
        arregloDeFiguras[0] = punto;
        arregloDeFiguras[1] = circulo;
        arregloDeFiguras[2] = cilindro;
        
        for (Figura arregloDeFigura : arregloDeFiguras) {
            salida += "\n\n"+arregloDeFigura.getNombre() +": "+ arregloDeFigura.toString()+"\n area = "+
                    dosDigitos.format(arregloDeFigura.getArea()) +
                    "\n volumen = "+dosDigitos.format(arregloDeFigura.getVolumen());
        }
        
        JOptionPane.showMessageDialog(null, salida);
        
        System.exit(0);
    }
}
