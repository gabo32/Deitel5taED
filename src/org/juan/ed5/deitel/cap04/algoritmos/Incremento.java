/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap04.algoritmos;

/**
 * Los operadores de preincremento y postdecremento
 * @author JuanVaio
 */
public class Incremento {
    public static void main(String[] args) {
        int c;
        
        //demostrar el uso de postincremento
        c = 5;
        System.out.println(c);
        System.out.println(c++);
        System.out.println(c);
        
        System.out.println();
        
        //decremento
        c = 5;
        System.out.println(c);
        System.out.println(++c);
        System.out.println(c);
    }
}
