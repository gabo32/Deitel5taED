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
public class ConstructoresStringBuffer {
    public static void main(String[] args) {
        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer(10);
        StringBuffer buffer3 = new StringBuffer("hola");
        
        String salida = 
                "buffer1 = \""+buffer1.toString()+"\"\n"+
                "buffer2 = \""+buffer2.toString()+"\"\n"+
                "buffer3 = \""+buffer3.toString()+"\"\n";
        
        JOptionPane.showMessageDialog(null, salida,"COnstructores de stringbuffer",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
