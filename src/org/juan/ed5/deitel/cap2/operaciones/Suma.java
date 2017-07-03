/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap2.operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanVaio
 */
public class Suma {
    
    //el metodo main empieza la ejeccion de la aplicacion en java
    public static void main(String[] args) {
        String primerNumero;
        String segundoNumero;
        
        int numero1;
        int numero2;
        int suma;
        
        //leer el primer numero del usuario como cadena
        primerNumero = JOptionPane.showInputDialog("Escriba el primer entero");
        
        //leer el segundo numero del usuario como una cadena
        segundoNumero = JOptionPane.showInputDialog("Escriba el segundo numero");
        
        //convertir los numeros de tipo String a in
        numero1 = Integer.parseInt(primerNumero);
        numero2 = Integer.parseInt(segundoNumero);
        
        //sumar los numeros
        suma = numero1+numero2;
        
        //mostrar el resultado
        JOptionPane.showMessageDialog(null, "La suma es "+suma,"Resultados",JOptionPane.PLAIN_MESSAGE);
        
        System.exit(0); //terminar aplicacion con la ventana
    }//fin metodo main
}//fin clase suma
