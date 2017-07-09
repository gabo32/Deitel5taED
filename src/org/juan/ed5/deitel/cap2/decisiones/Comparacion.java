/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap2.decisiones;

import javax.swing.JOptionPane;

/**
 * compra enteros utilizando instrucciones if, operadores relacionales y de igualdad
 * @author JuanVaio
 */
public class Comparacion {
    //el metodo main empieza la ejecucion de la aplicacion en java
    public static void main(String[] args) {
        String primerNumero;
        String segundoNumero;
        String resultado;
        
        int numero1;
        int numero2;
        
        //recibir el primer numero del usuario como una cadena
        primerNumero = JOptionPane.showInputDialog("Escriba el primer numero");
        
        //recibir el segundo numero del usuario como cadena
        segundoNumero = JOptionPane.showInputDialog("Escriba el segundo numero");
        
        //coinvertir los numeros de tipo String a int
        numero1 = Integer.parseInt(primerNumero);
        numero2 = Integer.parseInt(segundoNumero);
        
        //inicializar el resultado con cadena vacia
        resultado = "";
        
        if(numero1 == numero2){
            resultado = resultado+numero1 +"=="+numero2;
        }
        
        if(numero1 != numero2){
            resultado = resultado+numero1 +"!="+numero2;
        }
        
        if(numero1 < numero2){
            resultado = resultado+numero1 +"<"+numero2+"\n";
        }
        
        if(numero1 > numero2){
            resultado = resultado+numero1 +">"+numero2+"\n";
        }
        
        if(numero1 <= numero2){
            resultado = resultado+numero1 +"<="+numero2+"\n";
        }
        
        if(numero1 >= numero2){
            resultado = resultado+numero1 +">="+numero2+"\n";
        }
        
        //mostrar los resultado
        JOptionPane.showMessageDialog(null, resultado,"Resultado del aocmpracion",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);//terminar la aplicacion
    }//fin main
    
}//fin clase
