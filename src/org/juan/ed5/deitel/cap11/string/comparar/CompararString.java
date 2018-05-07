/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap11.string.comparar;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanGB
 */
public class CompararString {
    public static void main(String[] args) {
        String s1 = new String("hola");
        String s2 = "adios";
        String s3 = "Feliz cumpleaños";
        String s4 = "feliz cumpleaños";
        
        String salida = 
                "s1= "+s1+"\n"+
                "s2= "+s2+"\n"+
                "s3= "+s3+"\n"+
                "s4= "+s4+"\n\n";
        
        if(s1.equals("hola")){
            salida += "s1 es igual a hola\n";
        }else{
            salida += "s1 es distinta de hola\n";
        }
        
        if(s1 == "hola"){
            salida += "s1 es igual a hola\n";
        }else{
            salida += "s1 es distinta de hola\n";
        }
        
        if(s3.equalsIgnoreCase(s4)){
            salida += "s3 es igual a s4\n";
        }else{
            salida += "s3 es distinta a s4\n";
        }
        
        salida +=
                "\ns1.compareto(s2) es "+s1.compareTo(s2)+
                "\ns2.compareto(s1) es "+s2.compareTo(s1)+
                "\ns1.compareto(s1) es "+s1.compareTo(s1)+
                "\ns3.compareto(s4) es "+s3.compareTo(s4)+
                "\ns4.compareto(s3) es "+s4.compareTo(s3) +"\n\n";
        
        if(s3.regionMatches(0, s4, 0, 5)){
            salida += "Los primeros 5 caracteres de s3 y s4 concuerdan \n";
        }else{
            salida += "Los primero 5 caracteres de s3 y s4 no concuierdad \n";
        }
        
        if(s3.regionMatches(true,0, s4, 0, 5)){
            salida += "Los primeros 5 caracteres de s3 y s4 concuerdan \n";
        }else{
            salida += "Los primero 5 caracteres de s3 y s4 no concuierdad \n";
        }
        
        JOptionPane.showMessageDialog(null, salida,"Comparaciones",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
    }
}
