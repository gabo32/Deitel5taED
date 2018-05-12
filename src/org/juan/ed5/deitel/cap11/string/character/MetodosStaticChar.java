/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap11.string.character;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author JuanGB
 */
public class MetodosStaticChar extends JFrame {

    private char c;
    private JLabel indicardorEtiqueta;
    private JTextField entradaCampo;
    private JTextArea areaSalida;

    public MetodosStaticChar() {
        super("Metodos static de CHaracter");

        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        indicardorEtiqueta = new JLabel("Escriba un caracter y orpima intro");
        contenedor.add(indicardorEtiqueta);
        entradaCampo = new JTextField(5);

        entradaCampo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();
                c = s.charAt(0);
                crearSalida();
            }
        });

        contenedor.add(entradaCampo);
        areaSalida = new JTextArea(10, 20);
        contenedor.add(areaSalida);
        setSize(300, 200);
        setVisible(true);
    }

    private void crearSalida() {
        areaSalida.setText("Esta definido: " + Character.isDefined(c)
                + "\nes digito " + Character.isDigit(c)
                + "\nes primer caracter de un identificador java " + Character.isJavaIdentifierStart(c)
                + "\nes parte de un identificador java " + Character.isJavaIdentifierPart(c)
                + "\nes letra " + Character.isLetter(c)
                + "\nes letra o digito" + Character.isLetterOrDigit(c)
                + "\nes minuscula " + Character.isLowerCase(c)
                + "\nes mayuscula " + Character.isUpperCase(c)
                + "\na mayuscula " + Character.toUpperCase(c)
                + "\na mimuscula " + Character.toLowerCase(c)
        );
    }
    
    public static void main(String[] args) {
        MetodosStaticChar app = new MetodosStaticChar();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
