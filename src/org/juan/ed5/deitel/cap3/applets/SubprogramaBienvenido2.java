/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap3.applets;

import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author JuanVaio
 */
public class SubprogramaBienvenido2 extends JApplet{
    //dibujar texto con el fondo del applet
    public void paint(Graphics g){
        //llamar a la version del metodo paint de la superclase
        super.paint(g);
        
        //dibujar un String en la coordenada z25 y y25
        g.drawString("Bienvenido a", 25, 25);
        g.drawString("la programacion en java", 25, 40);
    }
}
