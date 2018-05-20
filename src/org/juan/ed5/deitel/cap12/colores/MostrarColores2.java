/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap12.colores;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

/**
 *
 * @author JuanGB
 */
public class MostrarColores2 extends JFrame{
    private JButton cambiarColorBoton;
    private Color color = Color.LIGHT_GRAY;
    private Container contenedor;
    
    public MostrarColores2(){
        super("Uso de jcolorChooser");
        
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        cambiarColorBoton = new JButton("Cambiar color");
        cambiarColorBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color = JColorChooser.showDialog(MostrarColores2.this, "Seleccione un color", color);
                
                if(color == null){
                    color = Color.LIGHT_GRAY;
                }
                contenedor.setBackground(color);
            }
        });
        
        contenedor.add(cambiarColorBoton);
        
        setSize(400,130);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MostrarColores2 app = new MostrarColores2();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
