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
public class StringBufferCapLen {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hola, ¿como estas?");
        
        String salida ="buffer = "+buffer.toString() +"\nlongitus = "+
                buffer.length() +"\ncapacidad = "+buffer.capacity();
        
        buffer.ensureCapacity(75);
        salida += "\n\nNueva capacidad = "+buffer.capacity();
        
        buffer.setLength(10);
        salida += "\n\nNueva longitud "+buffer.length() +"\nbuf = "+buffer.toString();
        
        JOptionPane.showMessageDialog(null, salida,"Metodos de stringbuffer",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
