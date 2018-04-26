/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap10.salarios;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanGB
 */
public class PruebaSistemaNomina {
    public static void main(String[] args) {
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        Empleado empleados[] = new Empleado[4];
        
        empleados[0] = new EmpleadoAsalariado("juan", "perez", "111-111-111", 800.00);
        empleados[1] = new EmpleadoPorComision("arlen", "razon", "222-222-222", 1000, 0.6);
        empleados[2] = new EmpleadoBaseMasComision("alfonso", "romero", "333-333-333", 5000, 0.4, 300);
        empleados[3] = new EmpleadoPorHoras("isable", "romero", "444-444-444", 16.75, 40);
        
        String salida = "";
        for (Empleado empleado : empleados) {
            salida += empleado.toString();
            
            if(empleado instanceof EmpleadoBaseMasComision){
                EmpleadoBaseMasComision empleadoActual = (EmpleadoBaseMasComision) empleado;
                
                double salarioBaseAnterior = empleadoActual.getSalarioBase();
                salida+= "\nsalario base anterior : "+salarioBaseAnterior;
                
                empleadoActual.setSalarioBase(1.10*salarioBaseAnterior);
                salida+= "\n el nuevo salario es "+empleadoActual.getSalarioBase();
            }
            
            salida += "\ngano "+empleado.ingresos()+"\n";
        }
        
        JOptionPane.showMessageDialog(null, salida);
        System.exit(0);
        
    }
}
