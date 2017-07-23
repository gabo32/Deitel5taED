/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap6;

import javax.swing.JOptionPane;

/**
 * ENteros aleatorios con desplazamiento y escala
 * @author JuanVaio
 */
public class EnterosAleatorios {
    public static void main(String[] args) {
        int valor;
        String salida = "";
        
        //iterar 20 veces
        for (int contador = 1; contador <= 20; contador++) {
            //elegir entero aleatorio entre 1 y 6
            valor = 1+(int)(Math.random()*6);
            
            salida += valor +"  ";
            
            if(contador % 5 == 0){
                salida += "\n";
            }
        }
        
        JOptionPane.showMessageDialog(null, salida,"20 numeros",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
