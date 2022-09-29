
package DIN.ui;
import DIN.ui.Ventana;
import java.util.ResourceBundle;
import javax.swing.text.View;

public class ViewFactory {

   
    private ResourceBundle data;
    private final String File = "file_type";
    private final String BD = "BD_type";
    
    public Vista getvista(){
        Vista vista = null;
        String data = ResourceBundle.getBundle("Utilidades.PropiedadSaludo").getString("file_type");
        if(File.equals(data)){
            vista = new VistaImplementacionFich();
        }else{
            vista =  new VistaImplementacionBD();
        }
        return vista;
    }
}
