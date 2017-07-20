/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap5;

import java.awt.Graphics;
import javax.swing.JApplet;

/**
 * Repeticion controlada pro contador con for
 * @author JuanVaio
 */
public class ContadorFor extends JApplet{
    //dibujar lineas en el fondo del applet
    public void paint(Graphics g){
        super.paint(g);
        
        for (int contador = 1; contador <= 10; contador++) {
            g.drawLine(10, 10, 250, contador*10);
        }
    }
}
