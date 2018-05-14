/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap11.string.stringtokenizer;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author JuanGB
 */
public class PruebaToken extends JFrame{
    private JLabel indicadorEtiqueta;
    private JTextField entradaCampo;
    private JTextArea areaSalida;
    
    public PruebaToken(){
        super("Prueba de la calse stringtokenizer");
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        indicadorEtiqueta = new JLabel("Escriba una oracion y oprima intro");
        contenedor.add(indicadorEtiqueta);
        
        entradaCampo = new JTextField(20);
        entradaCampo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringTokenizer tokens = new StringTokenizer(e.getActionCommand());
                
                areaSalida.setText("Numero de elementos "+tokens.countTokens()+"\nLos tokens son\n");
                while(tokens.hasMoreTokens()){
                    areaSalida.append(tokens.nextToken()+"\n");
                }
            }
        });
        
        contenedor.add(entradaCampo);
        
        areaSalida = new JTextArea(10, 20);
        areaSalida.setEditable(false);
        contenedor.add(new JScrollPane(areaSalida));
        setSize(275,240);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        PruebaToken app = new PruebaToken();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
