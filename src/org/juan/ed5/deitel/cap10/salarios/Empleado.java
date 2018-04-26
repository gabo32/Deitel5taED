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
public abstract class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    public Empleado(String nombre, String ap, String nss){
        this.primerNombre = nombre;
        this.apellidoPaterno = ap;
        this.numeroSeguroSocial = nss;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    
    public abstract double ingresos();

    @Override
    public String toString() {
        return "Empleado{" + "primerNombre=" + primerNombre + ", apellidoPaterno=" + apellidoPaterno + ", numeroSeguroSocial=" + numeroSeguroSocial + '}';
    }
    
   
}
