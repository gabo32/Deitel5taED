/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap11.string;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanGB
 */
public class VariosString {
    public static void main(String[] args) {
        String s1 = "hola a todos";
        char arregloChar[] = new char[4];
        
        String salida = "s1: "+s1;
        
        salida += "\n longitud de s1 : "+s1.length();
        
        salida += "\n la cada invertida es";
        
        for (int cuenta = s1.length()-1; cuenta >= 0; cuenta--) {
            salida += s1.charAt(cuenta)+" ";
        }
        
        
        s1.getChars(0, 4, arregloChar, 0);
        salida += "\nEL arreglo de caracteres es : ";
        
        for (char c : arregloChar) {
            salida += c;
        }
        
        JOptionPane.showMessageDialog(null, salida);
        
        System.exit(0);
    }
}
