/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap11.string.patternymatcher;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author JuanGB
 */
public class ValidarFrame extends JFrame {

    private JTextField telefonoCampoTexto,
            codigoPostalCampoTexto,
            estadoCampoTexto,
            ciudadCampoTexto,
            direccionCampoTexto,
            nombreCampoTexto,
            apellidoCampoTexto;

    public ValidarFrame() {
        super("Validacion");

        JLabel telefonoEtiqueta = new JLabel("Telefono");
        JLabel codigoPostalEtiqueta = new JLabel("C.P.");
        JLabel estadoEtiqueta = new JLabel("Estado");
        JLabel ciudadEtiqueta = new JLabel("Ciudad");
        JLabel direccionEtiqueta = new JLabel("Direccion");
        JLabel nombreEtiqueta = new JLabel("Primer Nombre");
        JLabel apellidoPaternoEtiqueta = new JLabel("Apellido paterno");

        JButton aceptarBoton = new JButton("Aceptar");
        aceptarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarFecha();
            }
        });

        telefonoCampoTexto = new JTextField(15);
        codigoPostalCampoTexto = new JTextField(5);
        estadoCampoTexto = new JTextField(2);
        ciudadCampoTexto = new JTextField(12);
        direccionCampoTexto = new JTextField(20);
        nombreCampoTexto = new JTextField(20);
        apellidoCampoTexto = new JTextField(20);

        JPanel primerNombre = new JPanel();
        primerNombre.add(nombreEtiqueta);
        primerNombre.add(nombreCampoTexto);
        
        JPanel apellidoPaterno = new JPanel();
        apellidoPaterno.add(apellidoPaternoEtiqueta);
        apellidoPaterno.add(apellidoCampoTexto);
        
        JPanel direccion1 = new JPanel();
        direccion1.add(direccionEtiqueta);
        direccion1.add(direccionCampoTexto);
        
        JPanel direccion2 = new JPanel();
        direccion2.add(ciudadEtiqueta);
        direccion2.add(ciudadCampoTexto);
        direccion2.add(estadoEtiqueta);
        direccion2.add(estadoCampoTexto);
        direccion2.add(codigoPostalEtiqueta);
        direccion2.add(codigoPostalCampoTexto);
        
        JPanel telefono = new JPanel();
        telefono.add(telefonoEtiqueta);
        telefono.add(telefonoCampoTexto);
        
        JPanel aceptar = new JPanel();
        aceptar.add(aceptarBoton);
        
        Container contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(6, 1));
        
        contenedor.add(primerNombre);
        contenedor.add(apellidoPaterno);
        contenedor.add(direccion1);
        contenedor.add(direccion2);
        contenedor.add(telefono);
        contenedor.add(aceptar);
        
        setSize(400, 225);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ValidarFrame app = new ValidarFrame();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void validarFecha(){
        if(apellidoCampoTexto.getText().equals("")||
                nombreCampoTexto.getText().equals("")||
                direccionCampoTexto.getText().equals("")||
                ciudadCampoTexto.getText().equals("")||
                estadoCampoTexto.getText().equals("")||
                codigoPostalCampoTexto.getText().equals("")||
                telefonoCampoTexto.getText().equals("")
                ){
            JOptionPane.showMessageDialog(this,"Por favor llene todos los campos");
        }else if(!nombreCampoTexto.getText().matches("[A-Z][a-zA-Z]*")){
            JOptionPane.showMessageDialog(this,"primer nombre invalido");
        }else if(!apellidoCampoTexto.getText().matches("[A-Z][a-zA-Z]*")){
            JOptionPane.showMessageDialog(this,"apellido invalido");
        }else if(!direccionCampoTexto.getText().matches("\\d+\\s+([a-zA-Z]+\\s[a-zA-Z]+)")){
            JOptionPane.showMessageDialog(this,"direccion invalida");
        }else if(!ciudadCampoTexto.getText().matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")){
            JOptionPane.showMessageDialog(this,"ciudad invalida");
        }else if(!estadoCampoTexto.getText().matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")){
            JOptionPane.showMessageDialog(this,"estado invalido");
        }else if(!codigoPostalCampoTexto.getText().matches("\\d{5}")){
            JOptionPane.showMessageDialog(this,"codigo postal invlaido");
        }else if(!telefonoCampoTexto.getText().matches("[1-9]\\d{2}-[1-9]\\d-\\d{4}")){
            JOptionPane.showMessageDialog(this,"numero telefonico invalido");
        }else{
            JOptionPane.showMessageDialog(this,"Gracias");
        }
    }
}
