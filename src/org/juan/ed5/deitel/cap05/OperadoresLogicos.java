/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap05;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author JuanVaio
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        //crrear jtextarea par amostrar esultados
        JTextArea areaSalida = new JTextArea(17, 20);

        //adjuntar jtexarea a un jscrollpane para dezplazarse
        JScrollPane desplazador = new JScrollPane(areaSalida);

        //crear la tabla de versad para el operador &/
        String salida = "AND condicional (&&) "
                + "\nfalse && false: " + (false && false)
                + "\nfalse && true: " + (false && true)
                + "\ntrue && false: " + (true && false)
                + "\ntrue && true: " + (true && true);

        //carear la tabla de versdad para or
        salida += "\n\nOR condicional (||) "
                + "\nfalse || false: " + (false || false)
                + "\nfalse || true: " + (false || true)
                + "\ntrue || false: " + (true || false)
                + "\ntrue || true: " + (true || true);

        //and logico
        salida += "\n\nand logico condicional (&) "
                + "\nfalse & false: " + (false & false)
                + "\nfalse & true: " + (false & true)
                + "\ntrue & false: " + (true & false)
                + "\ntrue & true: " + (true & true);

        //or logico
        salida += "\n\nor logico condicional (|) "
                + "\nfalse | false: " + (false | false)
                + "\nfalse | true: " + (false | true)
                + "\ntrue | false: " + (true | false)
                + "\ntrue | true: " + (true | true);

        //xor
        salida += "\n\nor exclusivo condicional (^) "
                + "\nfalse ^ false: " + (false ^ false)
                + "\nfalse ^ true: " + (false ^ true)
                + "\ntrue ^ false: " + (true ^ false)
                + "\ntrue ^ true: " + (true ^ true);
        //not
        salida += "\n\nnot condicional (!) "
                + "\n!false: " + (!false)
                + "\n!true: " + (!true);
        
        areaSalida.setText(salida);
        JOptionPane.showMessageDialog(null, desplazador,"Tablas",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);

    }
}
