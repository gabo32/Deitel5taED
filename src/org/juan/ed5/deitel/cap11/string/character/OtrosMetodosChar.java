/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap11.string.character;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanGB
 */
public class OtrosMetodosChar {
    public static void main(String[] args) {
        Character c1 = new Character('A');
        Character c2 = new Character('a');
        
        String salida = "C1 = "+c1.charValue()+
                "\nc2 = "+c2.charValue();
        
        if(c1.equals(c2)){
            salida +="\n\nc1 y c2 son iguales";
        }else{
            salida +="\n\nc1 y c2 no son iguales";
        }
        
        JOptionPane.showMessageDialog(null, salida);
        
        System.exit(0);
        
    }
}
