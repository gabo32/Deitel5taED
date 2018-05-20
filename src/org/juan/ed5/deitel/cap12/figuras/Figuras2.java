/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap12.figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;

/**
 *
 * @author JuanGB
 */
public class Figuras2 extends JFrame {

    public Figuras2() {
        super("Dibujo con figuras 2d");

        getContentPane().setBackground(Color.WHITE);
        setSize(400, 400);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        int puntosX[] = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
        int puntosY[] = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath estrella = new GeneralPath();

        estrella.moveTo(puntosX[0], puntosY[0]);
        for (int cuenta = 1; cuenta < puntosX.length; cuenta++) {
            estrella.lineTo(puntosX[cuenta], puntosY[cuenta]);
        }

        estrella.closePath();

        g2d.translate(200, 200);

        for (int cuenta = 1; cuenta <= 20; cuenta++) {
            g2d.rotate(Math.PI/10.0);
            
            g2d.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
            g2d.fill(estrella);
        }

    }
    
    public static void main(String[] args) {
        Figuras2 app = new Figuras2();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
