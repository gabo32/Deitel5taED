/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap10.internas;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.shape.FillRule;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author JuanGB
 */
public class VentanaPruebaTiempo extends JFrame{
    private Tiempo tiempo;
    private JLabel horaEtiqueta,minutoEtiqueta,segundoEtiqueta;
    private JTextField horaCampo,minutoCampo, segundoCampo, pantallaCampo;
    private JButton salirBoton;
    
    public VentanaPruebaTiempo(){
        //llamar al contrsuto para establecer cadadena de barra de titulo
        super("Demostracion de clase interna");
        
        tiempo = new Tiempo();
        
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        horaEtiqueta = new JLabel("ajutes de hora");
        horaCampo = new JTextField(10);
        contenedor.add(horaEtiqueta);
        contenedor.add(horaCampo);
        
        minutoEtiqueta = new JLabel("Ajuste minuto");
        minutoCampo = new JTextField(10);
        contenedor.add(minutoEtiqueta);
        contenedor.add(minutoCampo);
        
        segundoEtiqueta = new JLabel("Ajuste segundo");
        segundoCampo = new JTextField(10);
        contenedor.add(segundoEtiqueta);
        contenedor.add(segundoCampo);
        
        pantallaCampo = new JTextField(30);
        pantallaCampo.setEditable(false);
        contenedor.add(pantallaCampo);
        
        salirBoton = new JButton("Salir");
        contenedor.add(salirBoton);
        
        ActionEventHandler manejador = new ActionEventHandler();
        
        horaCampo.addActionListener(manejador);
        minutoCampo.addActionListener(manejador);
        segundoCampo.addActionListener(manejador);
        salirBoton.addActionListener(manejador);
    }
    
    public void mostrarTiempo(){
        pantallaCampo.setText("La hora es: "+tiempo);
    }
    
    public static void main(String[] args) {
        VentanaPruebaTiempo ventana = new VentanaPruebaTiempo();
        ventana.setSize(400, 140);
        ventana.setVisible(true);
    }
    
    private class ActionEventHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == salirBoton){
                System.exit(0);
            }else if(e.getSource() == horaCampo){
                tiempo.setHora(Integer.parseInt(e.getActionCommand()));
                horaCampo.setText("");
            }else if(e.getSource() == minutoCampo){
                tiempo.setMinuto(Integer.parseInt(e.getActionCommand()));
                minutoCampo.setText("");
            }else if(e.getSource() == segundoCampo){
                tiempo.setSegundo(Integer.parseInt(e.getActionCommand()));
                segundoCampo.setText("");
            }
            
            mostrarTiempo();
        }
        
    }
}
