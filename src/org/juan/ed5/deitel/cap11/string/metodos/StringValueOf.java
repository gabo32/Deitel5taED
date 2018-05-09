/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap11.string.metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanGB
 */
public class StringValueOf {
    public static void main(String[] args) {
        char arregloChar[] = {'a','b','c','d','e','f'};
        boolean valorBooleano = true;
        char valorChar = 'Z';
        int valorInteger = 7;
        long valorLong = 10000000L;
        float valorFloat = 2.5f;
        double valorDouble = 33.333;
        Object refObject = "hola";
        
        String salida = 
                "arregloChar = "+String.valueOf(arregloChar)+"\n"+
                "parte de arregloChar = "+String.valueOf(arregloChar,3,3)+"\n"+
                "boolean = "+String.valueOf(valorBooleano)+"\n"+
                "char = "+String.valueOf(valorChar)+"\n"+
                "int = "+String.valueOf(valorInteger)+"\n"+
                "long = "+String.valueOf(valorLong)+"\n"+
                "float = "+String.valueOf(valorFloat)+"\n"+
                "double = "+String.valueOf(valorDouble)+"\n"+
                "Object = "+String.valueOf(refObject)+"\n";
        
        JOptionPane.showMessageDialog(null, salida);
        System.exit(0);
    }
}
