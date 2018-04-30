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
public class Singleton {
    private static final Singleton SINGLETON = new Singleton();
    
    private Singleton(){
        System.out.println("Objeto singleton creado");
    }
    
    public static Singleton getInstanceSingleton(){
        return SINGLETON;
    }
}
