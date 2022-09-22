
package DIN.model;

import java.util.ResourceBundle;
import DIN.model.ModeloImplementacion;

public class ModelFactory {
    private ResourceBundle data;
    private final String BD = "BD_type";
    private final String File = "file_type";
    
    public String getModel() {
      String data = ResourceBundle.getBundle("Utilidades.PropiedadSaludo").getString("BD_type");
        if(BD.equals(data)){
            ModeloImplementacion modeloBD = new ModeloImplementacion();
            return modeloBD.toString();
        }else if(File.equals(data)) {
            ModeloImplementacion modeloFile = new ModeloImplementacion();
            return modeloFile.toString();
        } 
    return getModel();
    }
}
