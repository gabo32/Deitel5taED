/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap8.paquetes;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanVaio
 */
public class PruebaDaosPaquete {
    public static void main(String[] args) {
        DatosPaquete datosPaquete = new DatosPaquete();
        
        String salida = "Despues de instanciar:\n"+
                datosPaquete.toStringPaquete();
        
        datosPaquete.numero = 77;
        datosPaquete.cadena = "Adios";
        
        salida += "\nDespues de cambiar los valores\n"+
                datosPaquete.toStringPaquete();
        
        JOptionPane.showMessageDialog(null, salida,"Nivel de paquete",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}

class DatosPaquete{
    int numero;
    String cadena;
    
    public DatosPaquete(){
        numero = 0;
        cadena = "Hola";
    }
    
    public String toStringPaquete(){
        return "Numero: "+numero+" cadena: "+cadena;
    }
}
