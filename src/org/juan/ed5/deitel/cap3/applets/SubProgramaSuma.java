/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap3.applets;

import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanVaio
 */
public class SubProgramaSuma extends JApplet{
    double suma;
    
    @Override
    public void init(){
        String primerNumero;
        String segundoNumero;
        
        double numero1;
        double numero2;
        
        //obtener el primero numero del usuario
        primerNumero = JOptionPane.showInputDialog("Escriba el primer valor de punto flotante");
        
        //obtenerl elsegundo numero del uusario
        segundoNumero = JOptionPane.showInputDialog("Escriba el segundo valor de punto flotante");
        
        //convertir los numero sde tipo string a double
        numero1 = Double.parseDouble(primerNumero);
        numero2 = Double.parseDouble(segundoNumero);
        
        //sumar los numeros
        suma = numero1+numero2;
    }//fin del memtod init
    
    //dibujar los resultados en un rectandulo en el fondo del applet
    @Override
    public void paint(Graphics g){
        //llamar a la version del metodo paint de la superclase
        super.paint(g);
        
        //dibujar un rectangulo empezando desde 15,10 que tenga 270 pizeles de antho
        g.drawRect(15, 10, 270, 20);
        
        //dibujar los resultados como string
        g.drawString("La suma es "+suma, 25, 25);
    }//fin de paint
}//fin de la clase
