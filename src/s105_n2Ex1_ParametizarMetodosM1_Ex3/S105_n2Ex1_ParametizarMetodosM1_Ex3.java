package s105_n2Ex1_ParametizarMetodosM1_Ex3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.nio.file.Files;

public class S105_n2Ex1_ParametizarMetodosM1_Ex3 {

public static void main(String[] args) throws IOException {
		
	    String directorio = "ruta/del/directorio"; //guardamos el directorio en un String
        String rutaFicheroSalida = "ruta/del/directorio_final";//guardamos la ruta del directorio final

        File carpeta = new File(directorio);
        File ficheroDatos = new File(rutaFicheroSalida);
        if(!ficheroDatos.exists()) {
        	ficheroDatos.createNewFile();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(ficheroDatos));

        mostrarDirectorio(carpeta, writer);
        leerFichero(ficheroDatos);

        writer.close();
    }

    public static void mostrarDirectorio(File carpeta, BufferedWriter writer) throws IOException {
    	
    	Date data;
    	SimpleDateFormat formatoDia = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        File[] cont = carpeta.listFiles();

        if (cont != null) {
            for (File elemento : cont) {
            	BasicFileAttributes attr = Files.readAttributes(elemento.toPath(), BasicFileAttributes.class);
                data = new Date(attr.lastModifiedTime().toMillis());

                if (elemento.isDirectory()) {
                    writer.write("F" + elemento.getName() + " " + formatoDia.format(data) + "\n");
                    mostrarDirectorio(elemento, writer);
                } else {
                    writer.write("D" + elemento.getName() + " " + formatoDia.format(data) + "\n");
                }
            }
        }
    }

    public static void leerFichero(File ficheroDatos) throws IOException {
       
    	Scanner scanner = new Scanner(ficheroDatos);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
    
}
