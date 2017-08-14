/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap08;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author JuanVaio
 */
public class PruebaTiempo4 extends JApplet implements ActionListener{
    
    private Tiempo3 tiempo;
    private JLabel horaEtiqueta;
    private JLabel minutoEtiqueta;
    private JLabel segundoEtiqueta;
    
    private JTextField horaCampo;
    private JTextField minutoCampo;
    private JTextField segundoCampo;
    private JTextField pantallaCampo;
    
    private JButton ticBoton;
    
    public void init(){
        tiempo = new Tiempo3();
        
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        horaEtiqueta = new JLabel("Establecer hora");
        horaCampo = new JTextField(10);
        contenedor.add(horaEtiqueta);
        contenedor.add(horaCampo);
        
        minutoEtiqueta = new JLabel("Establecer minuto");
        minutoCampo = new JTextField(10);
        contenedor.add(minutoEtiqueta);
        contenedor.add(minutoCampo);
        
        segundoEtiqueta = new JLabel("Establecer segundo");
        segundoCampo = new JTextField(10);
        contenedor.add(segundoEtiqueta);
        contenedor.add(segundoCampo);
        
        pantallaCampo = new JTextField(30);
        pantallaCampo.setEditable(false);
        contenedor.add(pantallaCampo);
        
        ticBoton = new JButton("Agregar 1 a segundo");
        contenedor.add(ticBoton);
        
        horaCampo.addActionListener(this);
        minutoCampo.addActionListener(this);
        segundoCampo.addActionListener(this);
        ticBoton.addActionListener(this);
        
        mostrarHora();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ticBoton){
            tic();
        }else if(e.getSource() == horaCampo){
            tiempo.setHora(Integer.parseInt(e.getActionCommand()));
            horaCampo.setText("");
        }else if(e.getSource() ==minutoCampo){
            tiempo.setMinuto(Integer.parseInt(e.getActionCommand()));
            minutoCampo.setText("");
        }else if(e.getSource() == segundoCampo){
            tiempo.setSegundo(Integer.parseInt(e.getActionCommand()));
            segundoCampo.setText("");
        }
        
        mostrarHora();
    }
    
    public void mostrarHora(){
        pantallaCampo.setText("Hora: "+tiempo.getHora()+":minuto:"+tiempo.getMinuto()+":segundo"+tiempo.getSegundo());
        
        showStatus("La hora es "+tiempo.aStringEstandar()+" la hora universal es "+tiempo.aStringUniversal());
    }
    
    public void tic(){
        tiempo.setSegundo((tiempo.getSegundo()+1)%60);
        
        if(tiempo.getSegundo() == 0){
            tiempo.setMinuto((tiempo.getMinuto()+1)%60);
            if(tiempo.getMinuto()== 0){
                tiempo.setHora((tiempo.getHora()+1)%24);
            }
        }
                ;
    }
    
}
