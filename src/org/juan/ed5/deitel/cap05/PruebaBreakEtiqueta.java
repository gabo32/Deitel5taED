/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap05;

import javax.swing.JOptionPane;

/**
 * Instruccion break etiquetada
 * @author JuanVaio
 */
public class PruebaBreakEtiqueta {
    public static void main(String[] args) {
        String salida = "";
        
        alto:{
            //contar 10 filas
            for (int fila= 1; fila <= 10; fila ++) {
                //contar 5 columnas
                for (int conlumna = 1; conlumna <= 5; conlumna++) {
                    if(fila == 5){
                        break alto;
                    }
                    salida += "*  ";
                    
                }
                
                salida += "\n";
            }
            
            salida += "\nLos ciclos terminaron correctamente";
        }
        
        JOptionPane.showMessageDialog(null, salida,"Probando break",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
