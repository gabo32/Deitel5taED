/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap6;

import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JTextArea;

/**
 * Ejemplo de alcance
 * @author JuanVaio
 */
public class Alcance extends JApplet{
    JTextArea areaSalida;
    
    int x = 1;
    
    @Override
    public void init(){
        areaSalida = new JTextArea();
        Container contenedor = getContentPane();
        contenedor.add(areaSalida);
    }
    
    @Override
    public void start(){
        int x = 5;
        areaSalida.append("x local en metodo start "+x);
        usarLocal();
        usarCampo();
        usarLocal();
        usarCampo();
        
        areaSalida.append("\n\nx local en start es "+x);
    }
    
    public void usarLocal(){
        int x = 25;
        
        areaSalida.append("\n\nx local en usarLocal es "+x);
        ++x;
        areaSalida.append("\n\nx local en usar local es "+x);
    }
    
    public void usarCampo(){
        areaSalida.append("\n\nel campo x es: "+x);
        x*= 10;
        areaSalida.append("\nel campo x es "+x);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
    }
}
