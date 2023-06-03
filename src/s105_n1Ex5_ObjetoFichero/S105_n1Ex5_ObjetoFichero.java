package s105_n1Ex5_ObjetoFichero;

import java.io.IOException;

public class S105_n1Ex5_ObjetoFichero {

	public static void main(String[] args) {
		//creamos un objeto MiObjeto, lo serializamos en un archivo llamado miObjeto.ser y luego lo deserializamos y mostramos su contenido en la consola
         MiObjeto objeto = new MiObjeto("Dia", 27);

	        try {
	            SerializacionDesserializacion.serializacionObjeto(objeto, "miObjeto.ser");
	            MiObjeto objetoDeserializado = SerializacionDesserializacion.deserializarObjeto("miObjeto.ser");
	            System.out.println("Objeto deserializado: " + objetoDeserializado.getSol() + ", " + objetoDeserializado.getLuna());
	        } catch (IOException | ClassNotFoundException error) {
	            error.printStackTrace();
	        }
	}

}

