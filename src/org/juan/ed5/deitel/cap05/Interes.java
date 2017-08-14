/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap05;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * Calculo de interes compuesto
 * @author JuanVaio
 */
public class Interes {
    public static void main(String[] args) {
        double cantidad;
        double principal = 1000;
        double tasa = 0.05;
        
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.US );
        
        //crear JtextArea para mostrar la salida
        JTextArea areaTextoSalida = new JTextArea();
        
        //establecer la primera linea de texto en el areatexto
        
        areaTextoSalida.setText("Año\tCantidad en deposito\n");
        
        //calcular la cantidad en deposito para cada uno de los diez años
        for (int anio = 1; anio <= 10; anio++) {
            //calcular la nueva cantidad para el año especifico
            cantidad = principal *Math.pow(1.0+tasa, anio);
            
            //anezar una linea de texto a areatexto
            areaTextoSalida.append(anio+"\t"+formatoMoneda.format(cantidad)+"\n");
        }
        
        //mostrar resultados
        JOptionPane.showMessageDialog(null, areaTextoSalida,"Interescompeusto",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
