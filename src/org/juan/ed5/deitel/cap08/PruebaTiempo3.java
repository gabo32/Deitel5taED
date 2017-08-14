/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap08;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanVaio
 */
public class PruebaTiempo3 {
    public static void main(String[] args) {
        Tiempo2 t1 = new Tiempo2();
        Tiempo2 t2 = new Tiempo2(2);
        Tiempo2 t3 = new Tiempo2(21,34);
        Tiempo2 t4 = new Tiempo2(12,25,42);
        Tiempo2 t5 = new Tiempo2(27,74,99);
        Tiempo2 t6 = new Tiempo2(t4);
        
        String salida = "Se construyo con "+
                "\nt1:todos prederterminados "+
                "\n         "+t1.aStringUniversal()+
                "\n         "+t1.aStringEstandar();
        
        salida += "\n\nt2Se construyo con "+
                "\nt1:todos prederterminados "+
                "\n         "+t2.aStringUniversal()+
                "\n         "+t2.aStringEstandar();
        
        salida += "\n\nt3Se construyo con "+
                "\nt1:todos prederterminados "+
                "\n         "+t3.aStringUniversal()+
                "\n         "+t3.aStringEstandar();
        
        salida += "\n\nt4Se construyo con "+
                "\nt1:todos prederterminados "+
                "\n         "+t4.aStringUniversal()+
                "\n         "+t4.aStringEstandar();
        
        salida += "\n\nt5Se construyo con "+
                "\nt1:todos prederterminados "+
                "\n         "+t5.aStringUniversal()+
                "\n         "+t5.aStringEstandar();
        
        salida += "\n\nt6Se construyo con "+
                "\nt1:todos prederterminados "+
                "\n         "+t6.aStringUniversal()+
                "\n         "+t6.aStringEstandar();
        
        JOptionPane.showMessageDialog(null, salida,"sobrecarga de constructor",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
