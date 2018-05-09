/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap11.string.stringbuffer;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanGB
 */
public class StringBufferChars {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hola a todos");
        
        String salida = "buffer = "+buffer.toString() 
                +"\nCaracter en 0 = "+buffer.charAt(0)
                +"\nCaracter en 3 = "+buffer.charAt(3);
        
        char arregloChar[] = new char[buffer.length()];
        buffer.getChars(0, buffer.length(), arregloChar, 0);
        salida += "\nLos caracteres son ";
        for (char c : arregloChar) {
            salida += c;
        }
        
        buffer.setCharAt(0, 'H');
        buffer.setCharAt(7, 'T');
        salida += "\n\nBuf = "+buffer.toString();
        
        buffer.reverse();
        salida += "\n\nBuf = "+buffer.toString();
        
        JOptionPane.showMessageDialog(null, salida);
        System.exit(0);
        
        
    }
}
