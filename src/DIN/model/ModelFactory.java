
package DIN.model;

import java.util.ResourceBundle;

/**
 * Esta es la la factoria de modelo
 */
public class ModelFactory {
    private ResourceBundle data;
    private final String File = "Fich";
    
/**
 * el metodo getModel  se usa para decidir si el saludo sale por base de datos o por ficheros, si el String data es igual que el String File, será por fichero, sino, por BD.
 */
    public Modelo getModel(){
        Modelo model = null;
        String data = ResourceBundle.getBundle("Utilidades.PropiedadSaludo").getString("modelo");
/**
 * Aquí hacemos la comparación
 */
        if(File.equals(data)){
            model = new ModeloImplementacionFich();
        }else{
            model = new ModeloImplementacionBD();
        }
        return model;
    }
    
}
