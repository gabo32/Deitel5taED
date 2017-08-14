/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap07;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author JuanVaio
 */
public class BusquedaLineal extends JApplet implements ActionListener{

    JLabel escribirEtiqueta;
    JLabel resultadoEtiqueta;
    JTextField escribirCampo;
    JTextField resultadoCampo;
    int arreglo[];
    
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
        
        arreglo = new int[100];
        
        for (int contador = 0; contador < arreglo.length; contador++) {
            arreglo[contador] = 2*contador;
        }
    }
    
    public int BusquedaLineal(int arr[], int clave){
        for (int contador = 0; contador < arr.length; contador++) {
            if(arr[contador]== clave){
                return contador;
            }
        }
        
        return -1;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String claveBusqueda = e.getActionCommand();
        
        int elemento = BusquedaLineal(arreglo, Integer.parseInt(claveBusqueda));
        
        if(elemento != -1){
            resultadoCampo.setText("Valor encontrado en el elemento "+elemento);
        }else{
            resultadoCampo.setText("Valor no encontrado");
        }
    }
    
}
