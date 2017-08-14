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
public class OrdenamBurbuja extends JApplet{
    public void init(){
        JTextArea areaSalida = new JTextArea();
        getContentPane().add(areaSalida);
        
        int arreglo[]= {66,2,6,4,8,10,12,89,68,45,37};
        
        String salida = "Elementos de datos en su orden original \n";
        
        for (int contador = 0; contador < arreglo.length; contador++) {
            salida += "   "+ arreglo[contador];
        }
        
        ordenamBurbuja(arreglo);
        
        salida +="\n\nElementos ordenados\n\n";
        
        for (int contador = 0; contador < arreglo.length; contador++) {
            salida += "   "+arreglo[contador];
        }
        
        areaSalida.setText(salida);
    }
    
    //ordenas
    public void ordenamBurbuja(int arr[]){
        for (int pasada = 1; pasada < arr.length; pasada++) {
            for (int elemento = 0; elemento < arr.length-1; elemento++) {
                
                //comparar 
                if(arr[elemento] > arr[elemento+1]){
                    intercambiar(arr,elemento,elemento+1);
                }
            }
        }
    }
    
    public void intercambiar(int arr[],int primero,int segundo){
        int almacen;
        
        almacen = arr[primero];
        arr[primero] = arr[segundo];
        arr[segundo] = almacen;
    }
}
