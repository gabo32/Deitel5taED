/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap12.fuentes;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author JuanGB
 */
public class Metrica extends JFrame{
    public Metrica(){
        super("Demostracion de la FontMetrics");
        
        setSize(540,210);
        setVisible(true);
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        g.setFont(new Font("SansSerif", Font.BOLD, 12));
        FontMetrics metrica = g.getFontMetrics();
        g.drawString("Tipo de letra actual"+g.getFont(),10,40);
        g.drawString("ascendente "+metrica.getAscent(),10,55);
        g.drawString("descendente "+metrica.getDescent(),10,70);
        g.drawString("altura "+metrica.getHeight(),10,85);
        g.drawString("interlineado "+metrica.getLeading(),10,100);
        
        Font font = new Font("Serif", Font.ITALIC, 14);
        metrica = g.getFontMetrics(font);
        g.setFont(font);
        g.drawString("Tipo de letra actual"+g.getFont(),10,130);
        g.drawString("ascendente "+metrica.getAscent(),10,145);
        g.drawString("descendente "+metrica.getDescent(),10,160);
        g.drawString("altura "+metrica.getHeight(),10,175);
        g.drawString("interlineado "+metrica.getLeading(),10,190);
        
        
    }
    
    public static void main(String[] args) {
        Metrica app = new Metrica();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
