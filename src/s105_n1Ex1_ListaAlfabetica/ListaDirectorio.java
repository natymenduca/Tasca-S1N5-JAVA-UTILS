package s105_n1Ex1_ListaAlfabetica;

import java.io.File; 
import java.util.Arrays;

public class ListaDirectorio { 
    
	public static void main(String[] args) { 
		     
		   File directorio = new File("."); 
		   File[] files = directorio.listFiles();
           
		   Arrays.sort(files); 
          
		   for (File file : files) { 
		      if(file.isFile()) {
		    	  System.out.println(file.getName()); 
		      }
			}
	}
}

