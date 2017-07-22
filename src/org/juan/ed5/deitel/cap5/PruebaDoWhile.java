/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap5;

import java.awt.Graphics;
import javax.swing.JApplet;

/**
 * Uso de la instruccion do while
 * @author JuanVaio
 */
public class PruebaDoWhile extends  JApplet{
    
    //dibujar lineas en el applet
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        int contador = 1;
        
        do{
           g.drawOval(110-contador*10, 110-contador*10, contador*20, contador*20);
           ++contador;
        }while(contador <= 10);
    }
    
}
