/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap4.algoritmos;

import javax.swing.JOptionPane;

/**
 * Analisis de los resultados de un examen
 * @author JuanVaio
 */
public class Analisis {
    public static void main(String[] args) {
        //inicializar variables en las declaraciones
        int aprobados =0;
        int reprobados=0;
        int contadorEstudiantes = 1;
        int resultado;
        
        String entrada;
        String salida;
        
        //procesar 10 estudiantes utilizando un ciclo controlado por contador
        while( contadorEstudiantes <= 10){
            
            //pedir al usuario la entrada y obtener el valor del usuario
            entrada = JOptionPane.showInputDialog("Escriba el resultado (1= aprobado, 2= reprobado)");
            
            //convertir resultado en int
            resultado = Integer.parseInt(entrada);
            
            //si el resultado es 1 incrementa aprobador
            if(resultado == 1){
                aprobados = aprobados+1;
            }else{
                reprobados = reprobados +1;
            }
            
            //incrementar el contrador estuaniantes 
            contadorEstudiantes++;
        }
        
        //fase de terminacion y preparar y mostrar resultados
        salida = "Aprobados: "+aprobados +"\nReprobado: "+reprobados;
        
        //determinar si aprobaron mas de 8
        if(aprobados >8){
            salida = salida +"\nAumentar colegiatura";
        }
        
        JOptionPane.showMessageDialog(null, salida,"Analisis de resultados",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
    
    
}
