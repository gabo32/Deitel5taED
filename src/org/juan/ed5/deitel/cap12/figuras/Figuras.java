/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap12.figuras;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author JuanGB
 */
public class Figuras extends JFrame{
    public Figuras(){
        super("Dibujo de figuras en 2d");
        
        setSize(425,160);
        setVisible(true);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        Graphics2D g2d = (Graphics2D)g;
        
        //dibujar elipse 2d se rellena con degradado azul amarillo
        g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100, Color.YELLOW, true));
        g2d.fill(new Ellipse2D.Double(5, 30, 65, 100));
        
        //dibujar rectangulo 2d rojo
        g2d.setPaint(Color.RED);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.draw(new Rectangle2D.Double(80, 30, 65, 100));
        
        //dibujar rectangulo 2d redondeado con fondo tamponado
        BufferedImage buffImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        
        Graphics2D gg = buffImage.createGraphics();
        gg.setColor(Color.YELLOW);
        gg.fillRect(0, 0, 10, 10);
        gg.setColor(Color.BLACK);
        gg.drawRect(1, 1, 6, 6);
        gg.setColor(Color.BLUE);
        gg.fillRect(1, 1, 3, 3);
        gg.setColor(Color.RED);
        gg.fillRect(4, 4, 3, 3);
        
        //pintar buffimage en el objeto jframe
        g2d.setPaint(new TexturePaint(buffImage, new Rectangle(10, 10)));
        g2d.fill(new RoundRectangle2D.Double(155, 30, 75, 100, 50, 50));
        
        //dibujar arco 2d en forma de pastel
        g2d.setPaint(Color.WHITE);
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.draw(new Arc2D.Double(240, 30, 75, 100, 0, 270, Arc2D.PIE));
        
        //dibujar lineas 2d en verde y amarillo
        g2d.setPaint(Color.GREEN);
        g2d.draw(new Line2D.Double(395, 30, 320, 150));
        
        float guiones[] = {10};
        
        g2d.setPaint(Color.YELLOW);
        g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, guiones, 0));
        g2d.draw(new Line2D.Double(320, 30, 395, 150));
    }
    
    public static void main(String[] args) {
        Figuras app = new Figuras();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
