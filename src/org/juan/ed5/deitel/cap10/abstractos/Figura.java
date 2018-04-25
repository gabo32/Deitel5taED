/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap10.abstractos;

/**
 *
 * @author JuanGB
 */
public abstract class Figura extends Object{
    public double getArea(){
        return 0.0;
    }
    
    public double getVolumen(){
        return 0.0;
    }
    
    public abstract String getNombre();
}
