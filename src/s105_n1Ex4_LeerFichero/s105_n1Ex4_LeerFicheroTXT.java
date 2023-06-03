package s105_n1Ex4_LeerFichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class s105_n1Ex4_LeerFicheroTXT {

	public static void main(String[] args) throws IOException { //Se define el método main que establece la ruta del archivo a leer
		 String fileName = "C:\\Users\\NATALIA\\eclipse-workspace\\s105_n1Ex3_GuardarResultado\\resultado.txt";
		//Se llama al método leerArchivo dentro del bloque try,se maneja la excepción IOException en caso de que ocurra un error al leer el archivo
		 try {
	        leerArchivo(fileName);
		 }catch(IOException error) {
			 System.out.println ("Error al leer el archivo: " +  error.getMessage());
		 }
	 }//Se define el método leerArchivo que recibe la ruta del archivo como parámetro 
     private static void leerArchivo(String fileName) throws IOException {
	        File file = new File(fileName);//y crea un objeto File
	        FileReader libro = new FileReader(file);//se crea un obj FileReader llamado libro para leer el contenido del archivo.
	        BufferedReader blog = new BufferedReader(libro);//Se crea un obj BufferedReader llamado blog usando el obj FileReader creado anteriormente.
	        String line;//Se inicializa una variable line para almacenar cada línea del archivo
	        System.out.println("Leyendo archivo " + fileName + " usando BufferedReader");//Se imprime un mensaje indicando que se está leyendo el archivo utilizando BufferedReader
           
	        try {//Dentro de un bloque try, se lee el archivo línea por línea utilizando blog.readLine() y se almacena en la variable line.
		       while ((line = blog.readLine()) != null) {//Si la línea no es la última (line no es null), se imprime en la consola
	            System.out.println(line);
	            }
            /*En el bloque finally, se cierran los recursos BufferedReader y FileReader utilizando blog.close() y libro.close(),
		    respectivamente. Esto garantiza que los recursos se cerrarán incluso si ocurre una excepción durante la lectura del archivo*/ 
            }finally {
            blog.close();
	        libro.close();
	    }
	}
}
