/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap07;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author JuanVaio
 */
public class BusquedaBinaria extends JApplet implements ActionListener{
    JLabel escribirEtiqueta;
    JLabel resultadoEtiqueta;
    JTextField escribirCampo;
    JTextField resultadoCampo;
    JTextArea salida;
    
    int arreglo[];
    String pantalla = "";
    
    @Override
    public void init(){
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        escribirEtiqueta = new JLabel("Escriba clave de busqueda (entero)");
        contenedor.add(escribirEtiqueta);
        
        escribirCampo = new JTextField(10);
        contenedor.add(escribirCampo);
        
        escribirCampo.addActionListener(this);
        
        resultadoEtiqueta = new JLabel("Resultado");
        contenedor.add(resultadoEtiqueta);
        
        resultadoCampo = new JTextField(20);
        resultadoCampo.setEditable(false);
        contenedor.add(resultadoCampo);
        
        salida = new JTextArea(6,60);
        salida.setFont(new Font("Monospaced", Font.PLAIN, 12));
        contenedor.add(salida);
        
        arreglo = new int[15];
        
        for (int contador = 0; contador < arreglo.length; contador++) {
            arreglo[contador] = 2*contador;
        }
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String claveBusqueda = e.getActionCommand();
        
        pantalla = "Porciones del arreglo buscaras\n";
        
        int elemento = BusquedaBinaria(arreglo, Integer.parseInt(claveBusqueda));
        
        salida.setText(pantalla);
        
        if(elemento != -1){
            resultadoCampo.setText("Valor encontrado en el elemento "+elemento);
        }else{
            resultadoCampo.setText("Valor no encontrado");
        }
    }
    
    public int BusquedaBinaria(int arr[], int clave){
        int inferior = 0;
        int superior = arr.length-1;
        int medio;
        
        while(inferior <= superior){
            medio = (inferior + superior )/2;
            
            crearSalida(arr, inferior,medio,superior);
            
            if(clave == arr[medio]){
                return medio;
            }else if(clave < arr[medio]){
                superior = medio -1;
            }else{
                inferior = medio+1;
            }
        }
        
        return -1;
    }
    
    void crearSalida(int ar[],int inferior, int medio, int superior){
        DecimalFormat twoDigits = new DecimalFormat("00");
        
        for (int contador = 0; contador < ar.length; contador++) {
            if(contador < inferior || contador> superior){
                pantalla +="     ";
            }else if(contador == medio){
                pantalla += twoDigits.format(ar[contador])+"* ";
            }else{
                pantalla += twoDigits.format(ar[contador])+" ";
            }
        }
        
        pantalla+="\n";
    }
}

