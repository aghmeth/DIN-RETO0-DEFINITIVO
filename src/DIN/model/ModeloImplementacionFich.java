/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIN.model;

import java.util.ResourceBundle;

/**
 *
 * @author Diego
 * En ModeloImplementacionFich imprimimos el mensaje por terminal, recogido desde el archivo de propiedades
 */
public class ModeloImplementacionFich implements Modelo {

    @Override
    public String getGreeting() {
        String mensaje;
        mensaje = ResourceBundle.getBundle("Utilidades.PropiedadSaludo").getString("saludo");   
        System.out.println(mensaje);
        return mensaje;
    }
}
