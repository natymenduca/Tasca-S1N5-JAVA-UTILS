package s105_n1Ex3_GuardarResultado;

import java.io.BufferedWriter;//clase para escribir el texto del archivo hereda de la clase writer 
import java.io.File;// para trabajar con archivos y directorios
import java.io.FileWriter;//para escribir en un archivo de texto
import java.io.IOException;
import java.text.SimpleDateFormat;//para formatear las fechas de los archivos
import java.util.Arrays;//para ordenar los archivos y directorios alfabéticamente
import java.util.Date;// para trabajar con fechas

public class GuardaFitxerTXT {
    
	public static void main (String[] args) {
    	
		    File directorio = new File(".");
	        String nombreArchivo = "resultado.txt";
	        
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
	            listarDirectorioRecursivamente(directorio, writer);
	            System.out.println("El fichero se ha creado");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static void listarDirectorioRecursivamente(File directorio, BufferedWriter writer) throws IOException {
	        File[] files = directorio.listFiles();
	        Arrays.sort(files);
	        for (File file : files) {
	            if (file.isFile()) {
	                writer.write("F " + file.getName() + " " + formatDate(file.lastModified()) + "\n");
	            } else if (file.isDirectory()) {
	                writer.write("D " + file.getName() + " " + formatDate(file.lastModified()) + "\n");
	                listarDirectorioRecursivamente(file, writer);
	            }
	        }
	    }

	    private static String formatDate(long lastModified) {
	        SimpleDateFormat formaDato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        Date date = new Date(lastModified);
	        return formaDato.format(date);
	    }

    
}


