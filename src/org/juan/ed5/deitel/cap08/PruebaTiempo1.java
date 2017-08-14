/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap08;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanVaio
 */
public class PruebaTiempo1 {
    public static void main(String[] args) {
        Tiempo1 tiempo = new Tiempo1();
        
        String salida = "La hora universal inicial es "+tiempo.sTringUniversal()+"\nla hora estandar es "+tiempo.sStringEstandar();
        
        tiempo.establecerHora(13, 27, 6);
        
        salida += "\nLa hora universal despues de cambiar la hora es "+tiempo.sTringUniversal()+"\nLa hora esntanda es "+tiempo.sStringEstandar();
        
        tiempo.establecerHora(99, 99, 99);
        salida +="\nDespues de poner datos invalidos\nuniversal "+tiempo.sTringUniversal()+"\nestandar"+tiempo.sStringEstandar();
        
        JOptionPane.showMessageDialog(null, salida,"Prueba tiempo",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
