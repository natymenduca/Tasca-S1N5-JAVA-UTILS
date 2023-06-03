package s105_n1Ex2_OrdenAlfabetico;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class FuncionRecursiva  {

	public static void main(String[] args) {
		
		File directorio = new File(".");
		        listarDirectorioRecursivamente(directorio);
		    }
            private static void listarDirectorioRecursivamente(File directorio) {
		        File[] files = directorio.listFiles();
		        Arrays.sort(files);
		        for (File file : files) { 
		            if (file.isFile()) { 
		            	System.out.println("F " + file.getName() + " " + formatDate(file.lastModified())); 
		            } else if (file.isDirectory()) { 
		            	System.out.println("D " + file.getName() + " " + formatDate(file.lastModified()));
		                listarDirectorioRecursivamente(file);
		            }
		        }
		    }
            private static String formatDate(long lastModified) {
		    	SimpleDateFormat formaDato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		        Date date = new Date(lastModified);  
		        return formaDato.format(date); 
			}
}
