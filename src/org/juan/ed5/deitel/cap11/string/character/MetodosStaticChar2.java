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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author JuanGB
 */
public class MetodosStaticChar2 extends JFrame{
    private char c;
    private int digito, raiz;
    private JLabel indicador1,indicador2;
    private JTextField entrada,raizCampo;
    private JButton enChar, enInt;
    
    public MetodosStaticChar2(){
        
        super("Metodos de conversion de Character");
        
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        indicador1 = new JLabel("Escriba un digito o caracter");
        entrada = new JTextField(5);
        contenedor.add(indicador1);
        contenedor.add(entrada);
        
        indicador2 = new JLabel("Escriba una raiz");
        raizCampo = new JTextField(5);
        contenedor.add(indicador2);
        contenedor.add(raizCampo);
        
        enChar= new JButton("Convertir digito en caracter");
        enChar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digito =  Integer.parseInt(entrada.getText());
                raiz = Integer.parseInt(raizCampo.getText());
                JOptionPane.showMessageDialog(null, "COnveriri digito a caracter "+Character.forDigit(digito, raiz));
            }
        });
        
        enInt = new JButton("Convertir caracter en digito");
        enInt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = entrada.getText();
                c = s.charAt(0);
                raiz = Integer.parseInt(raizCampo.getText());
                JOptionPane.showMessageDialog(null, "Convertir caracter en digito "+Character.digit(c, raiz));
            }
        });
        
        contenedor.add(enChar);
        contenedor.add(enInt);
        setSize(275,150);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MetodosStaticChar2 app = new MetodosStaticChar2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
