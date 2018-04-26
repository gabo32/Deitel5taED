/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap10.salarios;

/**
 *
 * @author JuanGB
 */
public class EmpleadoPorHoras extends Empleado{
    private double sueldo;
    private double horas;
    
    public EmpleadoPorHoras(String nombre, String ap, String nss,double sueldoPorHora,double horasTrabajadas) {
        super(nombre, ap, nss);
        setHoras(horasTrabajadas);
        setSueldo(sueldoPorHora);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    

    @Override
    public double ingresos() {
        if(horas <= 40){
            return sueldo*horas;
        }else{
            return sueldo*40 +(horas-40)*sueldo*1.5;
        }
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{" + "sueldo=" + super.toString()+ '}';
    }
    
    
    
}
