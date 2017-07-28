/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap8;

import java.text.DecimalFormat;

/**
 *
 * @author JuanVaio
 */
public class Tiempo1 {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tiempo1(){
        establecerHora(0,0,0);
    }
    
    public void establecerHora(int h,int m,int s){
        hora = ((h>= 0 && h< 24)?h:0);
        minuto = ((m>= 0 && m< 60)?m:0);
        segundo = ((s>= 0 && s< 60)?s:0);
    }
    
    public String sTringUniversal(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        
        return dosDigitos.format(hora)+":"+dosDigitos.format(minuto)+":"+dosDigitos.format(segundo);
    }
    
    public String sStringEstandar(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        
        return ((hora == 12 || hora == 0)?12:hora%12)+":"+dosDigitos.format(minuto)+":"+dosDigitos.format(segundo)+(hora<12 ?"Am":"Pm");
    }
}
