/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap06;

import java.awt.Container;
import javax.swing.JApplet;
import javax.swing.JTextArea;

/**
 * Crear y utilizar un etodo definido
 * @author JuanVaio
 */
public class CuadradosEnteros extends JApplet{
    //configurar GUI y calcular los cuadrados de los enteros del 1 al 10
    public void init(){
        //objeto textArea para mostrar resultados
        JTextArea areaSalida = new JTextArea();
        
        //obtener el panel de contenido del appelts(area visible)
        Container contenedor = getContentPane();
        
        //adjuntar area slaida al contenedor
        contenedor.add(areaSalida);
        
        int resultado;
        
        String salida = "";
        
        //iterar 10 veces
        for (int contador = 1; contador <= 10; contador++) {
            resultado = cuadrado(contador);
            
            //anezar resultado al objeto string
            salida += "El cuadrado de "+contador +" es "+resultado +"\n";
        }
        
        areaSalida.setText(salida);
    }
    
    //declaracion del metodo cuadrado
    public int cuadrado(int y){
        return y*y;
    }
}
