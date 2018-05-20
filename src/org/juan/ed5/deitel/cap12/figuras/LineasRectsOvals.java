/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap12.figuras;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author JuanGB
 */
public class LineasRectsOvals extends JFrame{
    public LineasRectsOvals(){
        super("Dibujo de lineas, rectangulos y ovalos");
        
        setSize(400,165);
        setVisible(true);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        g.setColor(Color.RED);
        g.drawLine(5, 30, 350, 30);
        
        g.setColor(Color.BLUE);
        g.drawRect(5, 40, 90, 55);
        g.fillRect(100, 40, 90, 55);
        
        g.setColor(Color.CYAN);
        g.fillRoundRect(195, 40, 90, 55, 50, 50);
        g.drawRoundRect(290, 40, 90, 55, 20, 20);
        
        g.setColor(Color.YELLOW);
        g.draw3DRect(5, 100, 90, 55, true);
        g.fill3DRect(100, 100, 90, 55, false);
        
        g.setColor(Color.MAGENTA);
        g.drawOval(195, 100, 90, 55);
        g.fillOval(290, 100, 90, 55);
        
    }
    
    public static void main(String[] args) {
        LineasRectsOvals app = new LineasRectsOvals();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
