/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap6;

import java.awt.Container;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * Encontrar el valor maximo de tres numeros de punto flotante
 * @author JuanVaio
 */
public class PruebaMaximo extends JApplet{
    
    //inicializar el applet obtener la entrada del usuario y  crear gui
    @Override
    public void init(){
        //obtener entrada del usuario
        String s1 = JOptionPane.showInputDialog("Escriba el primer valor de punto flotante");
        String s2 = JOptionPane.showInputDialog("Escriba el segundo valor de punto flotante");
        String s3 = JOptionPane.showInputDialog("Escriba el tercer valor de punto flotante");
        
        //convertir la entrada del usuario en valores double
        double numero1 = Double.parseDouble(s1);
        double numero2 = Double.parseDouble(s2);
        double numero3 = Double.parseDouble(s3);
        
        double max = maximo(numero1,numero2,numero3);
        
        //crear objecto jtextarea
        JTextArea areaSalida = new JTextArea();
        
        //mostrar los numeros
        areaSalida.setText("numero1 "+numero1+"\nnumero2: "+numero2+"\nnumero3: "+numero3+"\nmaximo: "+max);
        
        //obtener el container
        Container contenedor = getContentPane();
        
        //adjuntar areasalida al contenedor
        contenedor.add(areaSalida);
    }
    
    //el metodo maximo utiliza el metodo max de la clase max
    public double maximo(double x,double y, double z){
        return Math.max(x, Math.max(y, z));
    }
}
