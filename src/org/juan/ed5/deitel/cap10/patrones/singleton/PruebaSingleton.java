/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap10.patrones.singleton;

/**
 *
 * @author JuanGB
 */
public class PruebaSingleton {
    public static void main(String[] args) {
        Singleton primerSingleton;
        Singleton segundoSingleton;
        
        primerSingleton = Singleton.getInstanceSingleton();
        segundoSingleton = Singleton.getInstanceSingleton();
        
        if(primerSingleton == segundoSingleton){
            System.out.println("son iguales por que es la misma referencia");
        }
    }
}
