/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap08.statics;

/**
 * Declaracion de clase empleado
 * @author JuanVaio
 */
public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private static int cuenta = 0;
    
    public Empleado(String nombre, String apellido){
        primerNombre = nombre;
        apellidoPaterno = apellido;
        
        ++cuenta;
        System.out.println("Constreuctor de empleado "+primerNombre  +" "+ apellidoPaterno);
    }
    
    protected void finalize(){
        --cuenta;
        System.out.println("Finalizador de empleado "+primerNombre+" "+apellidoPaterno+";cuenta "+cuenta);
    }
    
    public String obtenerPrimerNombre(){
        return primerNombre;
    }
    
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }
    
    public static int obtenerCuenta(){
        return cuenta;
    }
}
