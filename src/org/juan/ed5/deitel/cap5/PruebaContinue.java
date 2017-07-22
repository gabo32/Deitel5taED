/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap5;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanVaio
 */
public class PruebaContinue {
    public static void main(String[] args) {
        String salida = "";
        
        for (int cuenta = 1; cuenta <= 10; cuenta++) {
            if(cuenta == 5){
                continue;
            }
            
            salida += cuenta +" ";
        }
        
        salida += "\nSe utlilizo para evitar el 5";
        JOptionPane.showMessageDialog(null, salida);
    }
}
