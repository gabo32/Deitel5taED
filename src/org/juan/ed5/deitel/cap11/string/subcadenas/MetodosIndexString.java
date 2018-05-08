/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap11.string.subcadenas;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanGB
 */
public class MetodosIndexString {
    public static void main(String[] args) {
        String letras = "abcdefghijklmnopqrstuvwxyzabcdefghijklmn";
        
        String salida = "'c' se encuentra en el indice "+letras.indexOf('c');
        
        salida += "\n'a' se encuentra "+letras.indexOf('a',1);
        salida += "\n'$' se encuentra "+letras.indexOf('$',1);
        
        salida += "\n\nLa ultima c esta en "+letras.lastIndexOf('c');
        salida += "\nLa ultima a esta en "+letras.lastIndexOf('a');
        salida += "\nLa ultima $ esta en "+letras.lastIndexOf('$');
        
        salida +="\n'def' se encuentra en "+letras.indexOf("def");
        salida +="\n'def' se encuentra en "+letras.indexOf("def",7);
        salida +="\n'hola' se encuentra en "+letras.indexOf("hola");
        
        salida +="\nEL ultimo def esta en "+letras.lastIndexOf("def");
        salida +="\nEL ultimo def esta en "+letras.lastIndexOf("def",25);
        
        JOptionPane.showMessageDialog(null, salida,"Metodos index",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
        
        
        
    }
}
