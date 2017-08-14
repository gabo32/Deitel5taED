/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap07;

import javax.swing.JApplet;
import javax.swing.JTextArea;

/**
 * Inicializacion de arreglos multidimensionales
 * @author JuanVaio
 */
public class InicMatriz extends JApplet{
    JTextArea areaSalida;
    
    @Override
    public void init(){
        areaSalida = new JTextArea();
        getContentPane().add(areaSalida);
        
        int arr1[][] = {{1,2,3},{4,5,6}};
        int arr2[][] = {{1,2},{3},{4,5,6}};
        
        areaSalida.setText("Los valores en arr por fila son\n");
        crearSalida(arr1);
        
        areaSalida.append("\nLos valores en arr2 por fila son\n");
        crearSalida(arr2);
    }
    
    public void crearSalida(int a[][]){
        for (int fila = 0; fila < a.length; fila++) {
            for (int columna = 0; columna < a[fila].length; columna++) {
                areaSalida.append(a[fila][columna]+"  ");
            }
            areaSalida.append("\n");
        }
    }
}
