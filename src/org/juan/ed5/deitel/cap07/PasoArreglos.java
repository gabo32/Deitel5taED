/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap07;

import javax.swing.JApplet;
import javax.swing.JTextArea;

/**
 *
 * @author JuanVaio
 */
public class PasoArreglos extends JApplet{
    public void init(){
        JTextArea areaSalida = new JTextArea();
        getContentPane().add(areaSalida);
        
        int arreglo[] = { 1,2,3,4,5};
        
        String salida = "Efectos de pasar arreglo completo por referencia\n";
        
        for (int contador = 0; contador < arreglo.length; contador++) {
            salida += "    "+arreglo[contador];
        }
        
        modificarArreglo(arreglo);
        
        salida += "\nLos valores modificados son: \n";
        for (int contador = 0; contador < arreglo.length; contador++) {
            salida += "    "+arreglo[contador];
        }
        
        salida += "\nefectos de psar elemento\n";
        
        modificarElemento(arreglo[3]);
        
        salida += "\narreglo[3] despues de ser modificado "+arreglo[3];
        
        areaSalida.setText(salida);
        
    }
    
    public void modificarArreglo(int arr[]){
        for (int contador = 0; contador < arr.length; contador++) {
            arr[contador] *= 2;
        }
    }
    
    public void modificarElemento(int elemento){
        elemento *=2;
    }
}
