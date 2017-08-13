/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap8.finals;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;

/**
 *
 * @author JuanVaio
 */
public class PruebaIncremento extends JApplet implements ActionListener{
    private Incremento objectoIncremento;
    private JButton boton;
    
    public void init(){
        objectoIncremento = new Incremento(5);
        
        Container contenedor = getContentPane();
        
        boton = new JButton("Click para incrementar");
        boton.addActionListener(this);
        contenedor.add(boton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        objectoIncremento.incrementar();
        showStatus(objectoIncremento.toStringIncremento());
    }
    
}

class Incremento{
    private int cuenta =0;
    private int total = 0;
    private final int INCREMENTO;
    
    public Incremento(int valorIncremento){
        INCREMENTO = valorIncremento;
    }
    
    public void incrementar(){
        total += INCREMENTO;
        ++cuenta;
    }
    
    public String toStringIncremento(){
        return "Despues de incremento "+cuenta+"# total "+total;
    }
}
