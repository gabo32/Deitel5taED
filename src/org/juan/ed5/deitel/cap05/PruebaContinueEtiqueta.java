/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap05;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanVaio
 */
public class PruebaContinueEtiqueta {
    public static void main(String[] args) {
        String salida = "";
        
        siguienteFila:
            for (int fila = 1; fila <=5; fila++) {
                salida += "\n";
                
                for (int columna = 1; columna <=10; columna++) {
                    
                    if(columna > fila){
                        continue siguienteFila;
                    }
                    salida += "*  ";
                }
            }
        JOptionPane.showMessageDialog(null, salida,"Probando continuea",JOptionPane.INFORMATION_MESSAGE);
    }
}
