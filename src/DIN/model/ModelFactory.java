
package DIN.model;

import java.util.ResourceBundle;


public class ModelFactory {
    private ResourceBundle data;
    private final String BD = "BD_type";
    private final String File = "file_type";
    
    
    public Modelo getModel(){
        Modelo model = null;
        String data = ResourceBundle.getBundle("Utilidades.PropiedadSaludo").getString("file_type");
        if(File.equals(data)){
            model = new ModeloImplementacionFich();
        }else{
            model = new ModeloImplementacionBD();
        }
        return model;
    }
    
}
