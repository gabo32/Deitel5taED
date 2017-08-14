/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap06;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Metodo recursivo fibonacci
 *
 * @author JuanVaio
 */
public class PruebaFibonacci extends JApplet implements ActionListener {

    JLabel numeroEtiqueta;
    JLabel resultadoEtiqueta;
    JTextField numeroCampo;
    JTextField resultadoCampo;

    public void init() {
        //obtener le panel del contendio
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        //crear numeroetiqeutal y adjuntarlo
        numeroEtiqueta = new JLabel("Escriba un entero y oprima intro");
        contenedor.add(numeroEtiqueta);

        //crear numero campo
        numeroCampo = new JTextField(10);
        contenedor.add(numeroCampo);

        //registra este applet como action listener
        numeroCampo.addActionListener(this);

        //crear resultados
        resultadoEtiqueta = new JLabel("El valor de fibonacci es ");
        contenedor.add(resultadoEtiqueta);

        //crear campo 
        resultadoCampo = new JTextField(15);
        resultadoCampo.setEditable(false);
        contenedor.add(resultadoCampo);
    }

    //obtener entrada de usuario
    @Override
    public void actionPerformed(ActionEvent e) {
        long numero, valorFibonacci;
        
        //obtener entrada del usuario y convertirla en long
        numero = Long.parseLong(numeroCampo.getText());
        
        showStatus("Calculando...");
        
        //caloclar 
        valorFibonacci = fibonacci(numero);
        
        //indicar que se termino el procesamiento
        showStatus("LIsto...");
        
        resultadoCampo.setText(Long.toString(valorFibonacci));
    }
    
    //fibonacci
    public long fibonacci(long n){
        //(caso base
        if(n == 0 || n == 1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

}
