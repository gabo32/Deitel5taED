/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap5;

import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

/**
 * Dibujar lineas rectangulos u ovalos con base en la entrada del usuario
 * @author JuanVaio
 */
public class PruebaSwitch extends JApplet{
    int opcion;
    
    public void init(){
        String entrada;
        
        //obtener la opcion del usuario
        entrada = JOptionPane.showInputDialog("Escriba 1 para dibujar lineas\2 rectangulos\n3Ovalos");
        
        opcion = Integer.parseInt(entrada);
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        for (int i = 0; i < 10; i++) {
            switch (opcion) {
                case 1:
                    //dibujar linea
                    g.drawLine(10, 10, 250, 10+i*10);
                    break;
                case 2:
                    //dibujar un rectangulo
                    g.drawRect(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;
                case 3:
                    g.drawOval(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;
                default:
                    g.drawString("Se escribio un valor incorecto", 10, 20+i*15);
            }
        }
    }
}
