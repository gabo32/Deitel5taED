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
public class ConstructoresString {

    public static void main(String[] args) {
        char arregloChar[] = {'c', 'u', 'm', 'p', 'l', 'e', ' ', 'a', 'ñ', 'o', 's'};
        byte arregloByte[] = {
            (byte) 'a',
            (byte) 'ñ',
            (byte) 'o',
            (byte) ' ',
            (byte) 'n',
            (byte) 'u',
            (byte) 'e',
            (byte) 'v',
            (byte) 'o'};

        String s = new String("hola");
        
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(arregloChar);
        String s4 = new String(arregloChar, 7, 4);
        String s5 = new String(arregloByte, 4, 5);
        String s6 = new String(arregloByte);
        
        String salida = 
                "s1 = " + s1 +"\n"+
                "s2 = " + s2 +"\n"+
                "s3 = " + s3 +"\n"+
                "s4 = " + s4 +"\n"+
                "s5 = " + s5 +"\n"+
                "s6 = " + s6 +"\n";
        
        JOptionPane.showMessageDialog(null, salida,"COnstructores de string ",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
