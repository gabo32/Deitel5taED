/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap5;

import java.awt.Graphics;
import javax.swing.JApplet;

/**
 * Repeticion controlada por contador
 * @author JuanVaio
 */
public class ContadorWhile extends JApplet{
    //dibujar lineas en el fondo del applet
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        int contador = 1;
        
        while(contador <= 10){
            g.drawLine(10, 10, 250, contador*10);
            ++contador;
        }
    }
}
