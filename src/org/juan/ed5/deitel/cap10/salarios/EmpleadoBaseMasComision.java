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
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String ap, String nss, double ventasTotalesSemana, double porcentaje,double cantidadSalarioBase) {
        super(nombre, ap, nss, ventasTotalesSemana, porcentaje);
        setSalarioBase(cantidadSalarioBase);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    
    

    @Override
    public double ingresos() {
        return getSalarioBase()+super.ingresos();
    }

    @Override
    public String toString() {
        return "EmpleadoBaseMasComision{" + "salarioBase=" + super.toString() + '}';
    }
    
    
    
}
