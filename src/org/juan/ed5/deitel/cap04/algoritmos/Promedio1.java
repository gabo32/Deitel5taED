/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap04.algoritmos;

import javax.swing.JOptionPane;

/**
 * Programa del promedio de una clase mediante la repeticion controlada por contador
 * @author JuanVaio
 */
public class Promedio1 {
    public static void main(String[] args) {
        int total;
        int contadorCalif;
        int calificacion;
        int promedio;
        
        String cadenaCalif;
        
        //fase de inicializacion
        total = 0;
        contadorCalif = 1;
        
        //fase de procesamiento
        while(contadorCalif <= 10){
            //pedir la entrada y leer la calificacion del usuario
            cadenaCalif = JOptionPane.showInputDialog("Escriba la calificacion como entero");
            
            //convertir a entero
            calificacion = Integer.parseInt(cadenaCalif);
            
            total = total + calificacion;
            
            contadorCalif = contadorCalif+1;
        }
        
        //fase de terminacion
        promedio = total/10;
        
        //mostrar el promedio
        JOptionPane.showMessageDialog(null, "El promedio de la clase es "+promedio,"Promedio", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
