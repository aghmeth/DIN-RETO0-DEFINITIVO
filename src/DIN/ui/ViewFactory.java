
package DIN.ui;
import DIN.ui.Ventana;
import java.util.ResourceBundle;
import javax.swing.text.View;
import DIN.ui.Ventana;

public class ViewFactory {

/**
 * Esta es la factoría de vista, aquí decidimos si en la ventana saldrá el mensaje que recojamos desde el archivo de propiedades o desde la BD
 * Como en el Modelo Factoria, comparamos el valor de data y Ejecucion para decidir si sale o no por fichero o por BD
 */   
    private ResourceBundle data;
    private final String Ejecucion = "Texto";

    
    public Vista getvista(){
        Vista vista = null;
        String data = ResourceBundle.getBundle("Utilidades.PropiedadSaludo").getString("visual");
 /**
 * Aquí se hace la comparación
 */
        if(Ejecucion.equals(data)){
            vista = new VistaImplementacionFich();
        }else{
            vista =  new VistaImplementacionVentana() {};
        }
        return vista;
    }
}
