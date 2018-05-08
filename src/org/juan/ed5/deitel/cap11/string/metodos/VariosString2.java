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
public class VariosString2 {
    public static void main(String[] args) {
        String s1 = "Hola";
        String s2 = "ADIOS";
        String s3 = "     espacios      ";
        
        String salida = 
                "s1 = "+s1+
                "\ns2 = "+s2+
                "\ns3 = "+s3;
        
        salida += "\nReemplazar l con L "+s1.replace('l', 'L');
        
        salida += "upper "+s1.toUpperCase() +"\ns2 "+s2.toUpperCase();
        
        salida += "\ntrim "+s3.trim();
        
        salida += "\nlower "+s1.toLowerCase() +"\ns2 "+s2.toLowerCase();
        
        char arregloChar[] = s1.toCharArray();
        
        for (char c : arregloChar) {
            salida +="\n"+c;
        }
        
        JOptionPane.showMessageDialog(null, salida);
        
        System.exit(0);
        
       
                
                
    }
}
