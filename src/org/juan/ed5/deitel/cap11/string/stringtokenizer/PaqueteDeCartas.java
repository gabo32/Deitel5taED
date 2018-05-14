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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author JuanGB
 */
public class PaqueteDeCartas extends JFrame{
    private Carta paquete[];
    private int cartaActual;
    private JButton repartirBoton, barajarBoton;
    private JTextField pantallaCampo;
    private JLabel estadoEtiqueta;
    
    public PaqueteDeCartas(){
        super("Programa para repartir cartas");
        
        String caras[] = {
            "As",
            "Dos",
            "Tres",
            "Cuatro",
            "Cinco",
            "Seis",
            "Siete",
            "Ocho",
            "Nueve",
            "Diez",
            "Joto",
            "Quina",
            "Rey"
        };
        
        String palos[] = {
            "Corazones",
            "Diamantes",
            "Treboles",
            "Espadas"
        };
        
        paquete = new Carta[25];
        cartaActual = -1;
        
        for (int cuenta = 0; cuenta < paquete.length; cuenta++) {
            paquete[cuenta] = new Carta(caras[cuenta%13],palos[cuenta/13]);
        }
        
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        repartirBoton = new JButton("Repartir carta");
        repartirBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Carta repartida = repartirCarta();
                if(repartida != null){
                    pantallaCampo.setText(repartida.toString());
                    estadoEtiqueta.setText("Carta #: "+cartaActual);
                }else{
                    pantallaCampo.setText("NO HAY MAS CARTAS PARA REPARTIR");
                    estadoEtiqueta.setText("Barajee las cartas para continuar");
                }
            }
        });
        
        contenedor.add(repartirBoton);
        
        barajarBoton = new JButton("Barajar cartas");
        barajarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantallaCampo.setText("BARANAJO....");
                barajar();
                pantallaCampo.setText("SE BARAJO EL PAQUETE");
            }
        });
        
        contenedor.add(barajarBoton);
        
        pantallaCampo = new JTextField(20);
        pantallaCampo.setEditable(false);
        contenedor.add(pantallaCampo);
        
        estadoEtiqueta = new JLabel();
        contenedor.add(estadoEtiqueta);
        
        setSize(275, 120);
        setVisible(true);
        
    }
    
    private void barajar(){
        cartaActual = -1;
        
        for (int primera = 0; primera < paquete.length; primera++) {
            int segunda = (int)(Math.random()*52);
            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
        }
        
        repartirBoton.setEnabled(true);
    }
    
    private Carta repartirCarta(){
        if(++cartaActual < paquete.length){
            return paquete[cartaActual];
        }else{
            repartirBoton.setEnabled(false);
            return null;
        }
    }
    
    public static void main(String[] args) {
        PaqueteDeCartas app = new PaqueteDeCartas();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

class Carta{
    private String carta;
    private String palo;
    
    public Carta(String carta, String palo){
        this.carta = carta;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "carta=" + carta + ", palo=" + palo + '}';
    }
    
    
}
