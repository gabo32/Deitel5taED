/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap10.internas;

import java.text.DecimalFormat;

/**
 *
 * @author JuanVaio
 */
public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;
    
    private static DecimalFormat dosDigitos = new DecimalFormat("00");
    
    public Tiempo(){
        this(0,0,0);
    }
    
    public Tiempo(int h){
        this(h,0,0);
    }
    
    public Tiempo(int h, int m){
        this(h,m,0);
    }
    
    public Tiempo(int h, int m, int s){
        setTiempo(h,m,s);
    }
    
    public Tiempo(Tiempo tiempo){
        this(tiempo.getHora(),tiempo.getMinuto(),tiempo.getSegundo());
    }
    
    public void setTiempo(int h,int m, int s){
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
     * @param h
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
        this.minuto = m;
    }

    /**
     * @return the segundo
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * @param s
     */
    public void setSegundo(int s) {
        this.segundo = ((s>= 0 && s<60 )?s:0);
    }
    
    public String aStringUniversal(){
        return dosDigitos.format(getHora())+":"+
                dosDigitos.format(getMinuto())+":"+
                dosDigitos.format(getSegundo());
    }
    
    @Override
    public String toString(){
        return ((getHora() == 12 || getHora() == 0)?
                12:getHora()%12)+":"+dosDigitos.format(getMinuto())+
                ":"+dosDigitos.format(getSegundo())+
                (getHora()<12 ?"Am":"Pm");
    }
}
