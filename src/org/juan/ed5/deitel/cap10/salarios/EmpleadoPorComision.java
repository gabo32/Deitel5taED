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
public class EmpleadoPorComision extends Empleado{
    private double ventasTotales;
    private double tasaComision;

    public EmpleadoPorComision(String nombre, String ap, String nss, double ventasTotalesSemana, double porcentaje) {
        super(nombre, ap, nss);
        setVentasTotales(ventasTotalesSemana);
        setTasaComision(porcentaje);
        
    }

    public double getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(double ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    public double getTasaComision() {
        return tasaComision;
    }

    public void setTasaComision(double tasaComision) {
        this.tasaComision = tasaComision;
    }
    
    

    @Override
    public double ingresos() {
        return getTasaComision()*getVentasTotales();
    }

    @Override
    public String toString() {
        return "EmpleadoPorComision{" + "ventasTotales=" + super.toString() + ", =" +  + '}';
    }
    
    
    
}
