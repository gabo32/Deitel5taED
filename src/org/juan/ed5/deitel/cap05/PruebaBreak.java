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
public class PruebaBreak {
    
    public static void main(String[] args) {
        String salida = "";
        
        int cuenta;
        
        for (cuenta = 0; cuenta <= 10; cuenta++) {
            if(cuenta == 5){
                break;
            }
            
            salida += cuenta+ " ";
            
        }
        
        salida += "\nSe salio del ciclo en cuenta = "+cuenta;
        JOptionPane.showMessageDialog(null, salida);
        
        System.exit(0);
    }
}
