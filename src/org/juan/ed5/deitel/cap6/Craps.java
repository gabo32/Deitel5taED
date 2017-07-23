/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * craps
 *
 * @author JuanVaio
 */
public class Craps extends JApplet implements ActionListener {

    //variables constantes para el estado del juego
    final int GANADO = 0;
    final int PERDIDOS = 1;
    final int CONTINUAR = 2;

    boolean primerTiro = true;
    int sumaDeDados = 0;
    int miPunto = 0;

    int estadoJuego = CONTINUAR;

    //componenetes de interfaz grafica
    JLabel dado1Etiqueta;
    JLabel dado2Etiqueta;
    JLabel sumaEtiqueta;
    JLabel puntoEtiqueta;

    JTextField dado1Campo;
    JTextField dado2Campo;
    JTextField sumaCampo;
    JTextField puntoCampo;

    JButton tirarBoton;

    @Override
    public void init() {
        //obtener el panel de contenido y cambiar su esquema a flowlayout
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        //crear etiqueta y campo de texto para el dado 1
        dado1Etiqueta = new JLabel("Dado 1");
        contenedor.add(dado1Etiqueta);
        dado1Campo = new JTextField(10);
        dado1Campo.setEditable(false);
        contenedor.add(dado1Campo);

        //crear etiqueta y campo de texto para el dado 2
        dado2Etiqueta = new JLabel("Dado 2");
        contenedor.add(dado2Etiqueta);
        dado2Campo = new JTextField(10);
        dado2Campo.setEditable(false);
        contenedor.add(dado2Campo);

        //crear etiqueta y campo para suma
        sumaEtiqueta = new JLabel("La suma es");
        contenedor.add(sumaEtiqueta);
        sumaCampo = new JTextField(10);
        sumaCampo.setEditable(false);
        contenedor.add(sumaCampo);

        //crear etiqueta y campo para punto
        puntoEtiqueta = new JLabel("El punto es");
        contenedor.add(puntoEtiqueta);
        puntoCampo = new JTextField(10);
        puntoCampo.setEditable(false);
        contenedor.add(puntoCampo);

        //crear el boton que el usuario oprime
        tirarBoton = new JButton("Tirar dados");
        tirarBoton.addActionListener(this);
        contenedor.add(tirarBoton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        sumaDeDados = tirarDados();

        //primer tiro
        if (primerTiro) {
            switch (sumaDeDados) {
                //gana el primer tiro
                case 7:
                case 11:
                    estadoJuego = GANADO;
                    puntoCampo.setText("");
                    break;
                //pierde en primer tiro
                case 2:
                case 3:
                case 12:
                    estadoJuego = PERDIDOS;
                    puntoCampo.setText("");
                    break;

                //recuerda el punto
                default:
                    estadoJuego = CONTINUAR;
                    miPunto = sumaDeDados;
                    puntoCampo.setText(Integer.toString(miPunto));
                    primerTiro = false;
                    break;
            }
        } else {
            //determinar estado del jeugo
            if (sumaDeDados == miPunto) {
                estadoJuego = GANADO;
            } else {
                if (sumaDeDados == 7) {
                    estadoJuego = PERDIDOS;
                }
            }
        }

        mostrarMensaje();
    }

    public int tirarDados() {
        //elegir valores aleatorios par also dados
        int dado1 = 1 + (int) (Math.random() * 6);
        int dado2 = 1 + (int) (Math.random() * 6);

        int suma = dado1 + dado2;

        dado1Campo.setText(Integer.toString(dado1));
        dado2Campo.setText(Integer.toString(dado2));
        sumaCampo.setText(Integer.toString(suma));
        
        return suma;

    }
    
    public void mostrarMensaje(){
        if(estadoJuego == CONTINUAR){
            showStatus("Tirar de nuevo");
        }else{
            if(estadoJuego == GANADO){
                showStatus("El jugador gana");
            }else{
                showStatus("El jugador pierde");
            }
            
            primerTiro = true;
        }
    }

}
