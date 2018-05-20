/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap12.fuentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author JuanGB
 */
public class TiposDeLetra extends JFrame{
    public TiposDeLetra(){
        super("TIpos de letras");
        
        setSize(400,125);
        setVisible(true);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        g.setFont(new Font("Serif", Font.BOLD, 12));
        g.drawString("Serif 12 puntos", 20, 50);
        
        g.setFont(new Font("Monospaced", Font.ITALIC, 24));
        g.drawString("Monospaced 24 puntos cursiva", 20, 70);
        
        g.setFont(new Font("SansSerif", Font.PLAIN, 14));
        g.drawString("Sandserif 14 puntos", 20, 90);
        
        g.setColor(Color.RED);
        g.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 18));
        g.drawString(g.getFont().getName()+" "+g.getFont().getSize()+" puntos", 20, 110);
    }
    
    public static void main(String[] args) {
        TiposDeLetra app = new TiposDeLetra();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
