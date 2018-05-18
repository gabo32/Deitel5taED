/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap11.string.patterandmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanGB
 */
public class  ConcordanciasExpReg{
    public static void main(String[] args) {
        String salida = "";
        
        Pattern expresion = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
        
        String cadena1 = "Jacinto nacio el 05-12-75\n"+
                "David nacio el 11-04-68\n"+
                "Miguel nacio el 04-28-73\n"+
                "Juan nacio el 12-17-77";
        
        Matcher matcher = expresion.matcher(cadena1);
        
        while(matcher.find()){
            salida += matcher.group() +"\n";
        }
        
        JOptionPane.showMessageDialog(null, salida);
        
        System.exit(0);
    }
}
