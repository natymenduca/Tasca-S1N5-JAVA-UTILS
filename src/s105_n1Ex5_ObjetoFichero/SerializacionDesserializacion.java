package s105_n1Ex5_ObjetoFichero;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializacionDesserializacion {
	
	public static void serializacionObjeto(MiObjeto objeto, String nombreArchivo) throws IOException {
		FileOutputStream file = new FileOutputStream(nombreArchivo);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(objeto);
		out.close();
		file.close();
	}
	//desserializar
	
	public static MiObjeto deserializarObjeto(String nombreArchivo) throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream(nombreArchivo);
		ObjectInputStream in = new ObjectInputStream(file);
		return (MiObjeto) in.readObject();
		
	}
}

