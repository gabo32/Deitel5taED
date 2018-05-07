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
public class InicioFinString {
    public static void main(String[] args) {
        String cadenas[] = {"empezo","empezando","termino","terminando"};
        String salida = "";
        
        for(int cuenta = 0;cuenta < cadenas.length; cuenta++){
            if(cadenas[cuenta].startsWith("em")){
                salida += "\""+cadenas[cuenta]+"\"empieza con em\n";
            }
        }
        salida +="\n";
        for(int cuenta = 0;cuenta < cadenas.length; cuenta++){
            if(cadenas[cuenta].startsWith("pez",2)){
                salida += "\""+cadenas[cuenta]+"\"empieza con pez en la posicion 2\n";
            }
        }
        salida +="\n";
        for(int cuenta = 0;cuenta < cadenas.length; cuenta++){
            if(cadenas[cuenta].endsWith("do")){
                salida += "\""+cadenas[cuenta]+"\"termina con do\n";
            }
        }
        salida +="\n";
        
        JOptionPane.showMessageDialog(null, salida,"COmparaciones",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
