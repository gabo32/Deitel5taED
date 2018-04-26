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
public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    
    public EmpleadoAsalariado(String nombre, String ap, String nss,double salario) {
        super(nombre, ap, nss);
        setSalarioSemanal(salario);
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ingresos() {
        return getSalarioSemanal();
    }

    @Override
    public String toString() {
        return "EmpleadoAsalariado{" + "salarioSemanal=" + super.toString() + '}';
    }
    
    
    
}
