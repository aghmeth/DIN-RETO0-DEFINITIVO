/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIN.ui;

/**
 *
 * @author 2dam
 */
public class VistaImplementacionFich implements Vista {

    
    public void showGreeting(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public String showGreeting() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
