/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap08;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Uso de this
 * @author JuanVaio
 */
public class PruebaThis {
    public static void main(String[] args) {
        HoraSimple hora = new HoraSimple(12,30,19);
        
        JOptionPane.showMessageDialog(null, hora.crearCadena(),"This",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}

class HoraSimple{
    private int hora;
    private int minuto;
    private int segundo;
    
    public HoraSimple(int hora,int minuto,int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public String crearCadena(){
        return "this.aStringEsntadar(): "+this.aStringEstandar()+"\naStringEstandar()"+aStringEstandar();
    }
    
    public String aStringEstandar(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        
        return dosDigitos.format(this.hora)+":"+dosDigitos.format(this.minuto)+":"+dosDigitos.format(segundo);
    }
}
