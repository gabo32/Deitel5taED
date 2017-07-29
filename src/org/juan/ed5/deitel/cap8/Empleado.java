/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap8;

/**
 *
 * @author JuanVaio
 */
public class Empleado {
    
    private String primerNombre;
    private String apellidoPaterno;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;
    
    public Empleado(String nombre,String ap,Fecha fechaNacimiento,Fecha fechaContratacion){
        this.primerNombre = nombre;
        this.apellidoPaterno = ap;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
    }
    
    public String aStringEmpleado(){
        return apellidoPaterno+", "+primerNombre+" Contratado "+fechaContratacion.aStringFecha() + " Fecha nacimiento "+fechaNacimiento.aStringFecha();
    }
}
