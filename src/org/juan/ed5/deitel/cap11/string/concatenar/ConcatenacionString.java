/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap11.string.concatenar;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanGB
 */
public class ConcatenacionString {
    public static void main(String[] args) {
        String s1 = new String("Feliz ");
        String s2 = new String("Cumpleaños");
        
        String salida = "s1 = "+s1+"\nS2 = "+s2;
        
        salida +="\n\nResuldado de concatenar "+s1.concat(s2);
        salida+="\ns1 despues de concatenacion "+s1;
        
        JOptionPane.showMessageDialog(null, salida,"concatenacion",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
