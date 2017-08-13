/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap8.statics;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanVaio
 */
public class PruebaEmpleado {
    public static void main(String[] args) {
        String salida = "Empleados antes de instanciar "+Empleado.obtenerCuenta();
        
        Empleado e1 = new Empleado("Maria", "Flores");
        Empleado e2 = new Empleado("Juan ", "perez");
        
        salida += "\n\nEmpleados despues de instancias" +
                "\nvia e1"+e1.obtenerCuenta() +
                "\nvia e2"+e2.obtenerCuenta() +
                "\nvia empleado"+Empleado.obtenerCuenta();
        
        //oibtener nombre sde empleados
        salida += "\nEmpleado 1:"+ e1.obtenerPrimerNombre() +""
                + "\n "+e2.obtenerPrimerNombre();
        
        e1 = null;
        e2 = null;
        
        System.gc();
        
        salida += "\n\nEmpleados depues de gc "+Empleado.obtenerCuenta();
        
        JOptionPane.showMessageDialog(null, salida,"Miebros estaticos ",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
