/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap6;

import java.awt.Container;
import javax.swing.JApplet;
import javax.swing.JTextArea;

/**
 * Metodo recursivo para el factorial
 * @author JuanVaio
 */
public class PruebaFactorial extends JApplet{
    JTextArea areaSalida;
    @Override
    public void init(){
        areaSalida = new JTextArea();
        
        Container contenedor = getContentPane();
        contenedor.add(areaSalida);
        
        //calcular el factoria
        for (long contador = 0; contador <= 25; contador++) {
            areaSalida.append(contador +"! = "+factorial(contador)+"\n");
        }
    }
    
    public long factorial(long numero){
        //caso base
        if(numero<= 1){
            return 1;
        }else{
            //paso recursivo
            return numero*factorial(numero-1);
        }
    }
}
