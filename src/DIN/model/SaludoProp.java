/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIN.model;
import java.util.Enumeration;
import java.util.ResourceBundle;
/**
 *
 * @author Ale
 */
public class SaludoProp {
    
    public void getGreeting(){
        ResourceBundle rb = ResourceBundle.getBundle("Utilidades.PropiedadSaludo");
            Enumeration <String> keys = rb.getKeys();
            while (keys.hasMoreElements()){
                String key = keys.nextElement();
                String value = rb.getString(key);
                System.out.println(value);
            }
    }
}
    
