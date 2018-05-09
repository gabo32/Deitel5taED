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
public class StringBufferInsert {
    public static void main(String[] args) {
        Object refObject = "hola";
        String cadena = "adios";
        char arregloChar[] = {'a','b','c','d','e','f'};
        boolean valorBooleano = true;
        char valorChar = 'K';
        int valorInt = 7;
        long valorLong = 10000000L;
        float valorFloat = 2.5f;
        double valorDouble = 33.333;
        StringBuffer buffer = new StringBuffer();
        
        buffer.insert(0,refObject);
        buffer.insert(0,"  ");
        buffer.insert(0,cadena);
        buffer.insert(0,"  ");
        buffer.insert(0,arregloChar);
        buffer.insert(0,"  ");
        buffer.insert(0,arregloChar,3,3);
        buffer.insert(0,"  ");
        buffer.insert(0,valorBooleano);
        buffer.insert(0,"  ");
        buffer.insert(0,valorChar);
        buffer.insert(0,"  ");
        buffer.insert(0,valorInt);
        buffer.insert(0,"  ");
        buffer.insert(0,valorLong);
        buffer.insert(0,"  ");
        buffer.insert(0,valorFloat);
        buffer.insert(0,"  ");
        buffer.insert(0,valorDouble);
        
        String salida = "buffer despues de inserciones:\n"+buffer.toString();
        
        buffer.deleteCharAt(10);
        buffer.delete(2,6);
        
        salida += "\n\nBuffes despues de eliminar \n"+buffer.toString();
        
        JOptionPane.showMessageDialog(null,salida);
        
        System.exit(0);
        
    }
}
