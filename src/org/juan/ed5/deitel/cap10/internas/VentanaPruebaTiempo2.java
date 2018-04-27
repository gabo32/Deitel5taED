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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author JuanGB
 */
public class VentanaPruebaTiempo2  extends JFrame{
    private Tiempo tiempo;
    private JLabel horaEtiqueta,minutoEtiqueta,segundoEtiqueta;
    private JTextField horaCampo,minutoCampo, segundoCampo, pantallaCampo;
    
    public VentanaPruebaTiempo2(){
        //llamar al contrsuto para establecer cadadena de barra de titulo
        super("Demostracion de clase interna2 ");
        
        tiempo = new Tiempo();
        
        crearGUI();
        registrarManejadoresDeEventos();
    }
    
    private void crearGUI(){
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
        
    }
    
    private void registrarManejadoresDeEventos(){
        
        horaCampo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiempo.setHora(Integer.parseInt(e.getActionCommand()));
                horaCampo.setText("");
                mostrarTiempo();
            }
        });
        minutoCampo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiempo.setMinuto(Integer.parseInt(e.getActionCommand()));
                minutoCampo.setText("");
                mostrarTiempo();
            }
        });
        segundoCampo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiempo.setSegundo(Integer.parseInt(e.getActionCommand()));
                segundoCampo.setText("");
                mostrarTiempo();
            }
        });
        
    }
    
    public void mostrarTiempo(){
        pantallaCampo.setText("La hora es: "+tiempo);
    }
    
    public static void main(String[] args) {
        VentanaPruebaTiempo2 ventana = new VentanaPruebaTiempo2();
        ventana.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        ventana.setSize(400, 140);
        ventana.setVisible(true);
    }
}
