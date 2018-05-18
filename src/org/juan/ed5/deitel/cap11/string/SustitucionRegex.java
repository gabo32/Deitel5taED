/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juan.ed5.deitel.cap11.string;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanGB
 */
public class SustitucionRegex {
    public static void main(String[] args) {
        String primerString = "Este enunciado termina con 5 estrellas *****";
        String segundoString = "1, 2, 3, 4, 5, 6, 7, 8";
        String salida  = "String original 1: "+primerString;
        
        primerString = primerString.replaceAll("\\*", "^");
        
        salida +="\n^ reemplazo a *: "+primerString;
        
        primerString = primerString.replaceAll("estrellas", "intercaladores");
        
        salida+= "\n\"intercaladores\" reemplazan a \"estrellas\": "+primerString;
        
        salida+= "\nCada palabra reemplazada por \"palabrea\": "+ primerString.replaceAll("\\w+", "palabra");
        
        salida += "\n\nString original 2 :" +segundoString;
        
        for (int i = 0; i < 3; i++) {
            segundoString = segundoString.replaceFirst("\\d", "digito");
        }
        
        salida += "\nPrimero 3 digitos reemplazados por \"digito\" : "+segundoString;
        
        salida +="\nString dividido en las comas [";
        String[] resultados = segundoString.split(",\\s*");
        
        for (String resultado : resultados) {
            salida += "\""+resultado +"\", ";
        }
        
        salida += salida.substring(0,salida.length()-2)+"]";
        
        JOptionPane.showMessageDialog(null, salida);
        System.exit(0);
    }
}
