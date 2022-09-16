/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Ale
 */
public class MiObjectOutputStream extends ObjectOutputStream{
	
	//Sobrescribimos el método que crea la cabecera 
		protected void writeStreamHeader() throws IOException {
			// No hacer nada. 
			reset();
		}

		//Constructores
		public MiObjectOutputStream () throws IOException{ 
			super();
		}
		
		public MiObjectOutputStream(OutputStream out) throws IOException{
			super(out);
		}
}
