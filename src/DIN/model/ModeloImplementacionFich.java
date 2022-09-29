/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIN.model;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ModeloImplementacionFich implements Modelo {

    @Override
    public String getGreeeting() {
        String mensaje;
        ResourceBundle file_type;
        file_type = ResourceBundle.getBundle("Utilidades.PropiedadSaludo");
        mensaje = file_type.getString("file_type");
        
        return mensaje;
    }
    
}
