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
public class DibujarArcos extends JFrame{
    public DibujarArcos(){
        super("Dibujo de arcos");
        
        setSize(300,170);
        setVisible(true);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        g.setColor(Color.YELLOW);
        g.drawRect(15, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(15, 35, 80, 80, 0, 360);
        
        g.setColor(Color.YELLOW);
        g.drawRect(100, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(100, 35, 80, 80, 0, 110);
        
        g.setColor(Color.YELLOW);
        g.drawRect(185, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(185, 35, 80, 80, 0, -270);
        
        g.fillArc(15, 120, 80, 40, 0, 360);
        
        g.fillArc(100, 120, 80, 40, 270, -90);
        
        g.fillArc(185, 120, 80, 40, 0, -270);
        
    }
    
    public static void main(String[] args) {
        DibujarArcos app = new DibujarArcos();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
            
}
