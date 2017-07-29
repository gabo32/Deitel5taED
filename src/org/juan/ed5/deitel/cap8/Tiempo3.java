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
public class Tiempo3 {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tiempo3(){
        this(0,0,0);
    }
    
    public Tiempo3(int h){
        this(h,0,0);
    }
    
    public Tiempo3(int h, int m){
        this(h,m,0);
    }
    
    public Tiempo3(int h, int m, int s){
        establecerHora(h,m,s);
    }
    
    public Tiempo3(Tiempo3 tiempo){
        this(tiempo.hora,tiempo.minuto,tiempo.segundo);
    }
    
    public void establecerHora(int h,int m,int s){
        setHora(h);
        setMinuto(m);
        setSegundo(s);
    } 

    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int h) {
        this.hora = ((h>= 0 && h<24 )?h:0);
    }

    /**
     * @return the minuto
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * @param m
     */
    public void setMinuto(int m) {
        this.minuto = ((m>= 0 && m<60 )?m:0);
    }

    /**
     * @return the segundo
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * @param segundo the segundo to set
     */
    public void setSegundo(int s) {
        this.segundo = ((s>= 0 && s<60 )?s:0);
    }
    
    public String aStringUniversal(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        
        return dosDigitos.format(getHora())+":"+dosDigitos.format(getMinuto())+":"+dosDigitos.format(getSegundo());
    }
    
    public String aStringEstandar(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        
        return ((getHora() == 12 || getHora() == 0)?12:getHora()%12)+":"+dosDigitos.format(getMinuto())+":"+dosDigitos.format(getSegundo())+(getHora()<12 ?"Am":"Pm");
    }
}
