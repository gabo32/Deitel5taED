/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap08;

/**
 *
 * @author JuanVaio
 */
public class Fecha {

    private int mes;
    private int dia;
    private int anio;

    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;

        System.out.println("COnstructor de objeto fecha para fecha " + aStringFecha());
    }

    private int comprobarMes(int mesPrueba) {
        if (mesPrueba > 0 && mesPrueba <= 12) {
            return mesPrueba;
        } else {
            System.out.println("Mes invalido");
            return 1;
        }
    }

    private int comprobarDia(int diaPrueba) {
        int diasPorMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (diaPrueba > 0 && diaPrueba <= diasPorMes[mes]) {
            return diaPrueba;
        }
        if (mes == 2 && diaPrueba == 29 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
            return diaPrueba;
        }

        System.out.println("Dia invalido");
        return 1;
    }
    
    public String aStringFecha(){
        return mes+"/"+dia+"/"+anio;
    }
}
