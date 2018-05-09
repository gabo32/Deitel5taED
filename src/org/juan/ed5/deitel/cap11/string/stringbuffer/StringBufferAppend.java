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
public class StringBufferAppend {
    public static void main(String[] args) {
        Object refObject = "hola";
        String cadena = "adios";
        char arregloChar[] = {'a','b','c','d','e','f'};
        boolean valorBooleano = true;
        char valorChar = 'Z';
        int valorInt = 7;
        long valorLong = 10000000L;
        float valorFloat = 2.5f;
        double valorDouble = 33.333;
        StringBuffer ultimoBuffer = new StringBuffer("Ultimo Stringbuffer");
        StringBuffer buffer = new StringBuffer();
        
        buffer.append(refObject);
        buffer.append("  ");
        buffer.append(cadena);
        buffer.append("  ");
        buffer.append(arregloChar);
        buffer.append("  ");
        buffer.append(arregloChar, 0, 3);
        buffer.append("  ");
        buffer.append(valorBooleano);
        buffer.append("  ");
        buffer.append(valorChar);
        buffer.append("  ");
        buffer.append(valorInt);
        buffer.append("  ");
        buffer.append(valorLong);
        buffer.append("  ");
        buffer.append(valorDouble);
        buffer.append("  ");
        buffer.append(valorFloat);
        buffer.append("  ");
        buffer.append(ultimoBuffer);
        
        JOptionPane.showMessageDialog(null, buffer.toString());
        System.exit(0);
    }
}
