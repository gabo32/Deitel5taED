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
 * Uso de metodos sobrecargados
 * @author JuanVaio
 */
public class SobrecargaMetodos extends JApplet{
    public void init(){
        JTextArea areaSalida = new JTextArea();
        Container contenedor = getContentPane();
        contenedor.add(areaSalida);
        
        areaSalida.setText("El cuadrado del valor integer es "+cuadrado(7) +"\nEl cuadrado del double 7.5 es "+cuadrado(7.5));
        
    }
    
    public int cuadrado(int intValor){
        System.out.println("Se llamo al cuadrado con int");
        return intValor*intValor;
    }
    
    public double cuadrado(double doubleValor){
        System.out.println("se llamo a cuadrado con double");
        return doubleValor*doubleValor;
    }
}
