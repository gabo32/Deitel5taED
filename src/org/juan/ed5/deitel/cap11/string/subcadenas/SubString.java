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
public class SubString {

    public static void main(String[] args) {

        String letras = "abcdefghijklmabcdefghijklm";

        String salida = "La cadena desde el inidice 20 hasta el final es " + letras.substring(20) + "\n";

        salida += "la subcadena entre 3 y 6 es " + letras.substring(3, 6) + "\n";

        JOptionPane.showMessageDialog(null, salida, "Metodos substring", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
