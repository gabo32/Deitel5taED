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
public class Cilindro extends Circulo{
    private double altura;
    
    public Cilindro(){
        
    }
    
    public Cilindro(int x,int y, double radio, double altura){
        super(x,y,radio);
        setAltura(altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = (altura <0.0 ? 0.0:altura);
    }
    
    @Override
    public double getArea(){
        return 2*super.getArea()+getCircunferencia()*getAltura();
    }
    
    @Override
    public double getVolumen(){
        return super.getArea()*getAltura();
    }
    
    @Override
    public String getNombre(){
        return "Cilindro";
    }

    @Override
    public String toString() {
        return "Cilindro{" + "altura=" + altura + '}';
    }
    
    
    
    
}
