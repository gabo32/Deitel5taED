/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap12.colores;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author JuanGB
 */
public class MostrarColores extends JFrame{
    public MostrarColores(){
        super("Uso de colores");
        
        setSize(400,130);
        setVisible(true);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        g.setColor(new Color(255, 0, 0));
        g.fillRect(25, 25, 100, 20);
        g.drawString("Rgb actual "+g.getColor(), 130, 40);
        
        g.setColor(new Color(0.0f, 1.0f, 0.0f));
        g.fillRect(25, 50, 100, 20);
        g.drawString("Rgb actual "+g.getColor(), 130, 65);
        
        g.setColor(Color.BLUE);
        g.fillRect(25, 75,100, 20);
        g.drawString("Rgb actual"+g.getColor(), 130, 90);
        
        Color color = Color.MAGENTA;
        g.setColor(color);
        g.fillRect(25, 100, 100, 20);
        g.drawString("Valores rgb"+ color.getRed()+" "+ color.getGreen()+" "+color.getBlue(),130,115);
    }
    
    public static void main(String[] args) {
        MostrarColores app = new  MostrarColores();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
