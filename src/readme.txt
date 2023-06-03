
Paso ejecutar os ejercicios S105_n1Ex1 / S105_N2Ex1 desde la linea de comandos. 
Primero paso:
Instalamos el JDK 17 de Java en el ordenador, lo configuramos.

Segundo paso:
Buscamos en el ordenador la tecla con el pictorama de Windows, seleccionamos este + la letra R, aparece un cuadro. 

Tercer paso: 
En el cuadro de busqueda ponemos las sigleas "cmd", damos a aceptar y este nos lleva hasta la pantalla de comandos donde
aparecen una linea con la ruta, en mi caso: 
C:\NATALIA> 

Cuarto paso:
En el programa editor Eclipse, buscamos el ejercicio s01_n1Ex1 abrimos "src" y vamos a el ejercicio y con el boton secundario 
sobre ListaDirectorio.java,aparece un listado de opciones,clicamos en Propiedades, copiamos la ruta localización

Quinto paso: 
En la carpeta donde se encuentra el archivo ListaDelDirectorio .java ejecutamos usando el comando "cd" + la ruta de la carpeta:
  S105_n1Ex1 = cd C:eclipse-workspace\S105_n1Ex1_ListaAlfabetica\src\s105_n1Ex1_ListaAlfabetica\ListaDirectorio.java
  S105_n2Ex1 = cd eclipse-workspace\s105_n2Ex1_ParametizarMetodosM1_Ex3\src\s105_n2Ex1_ParametizarMetodosM1_Ex3\S105_n2Ex1_ParametizarMetodosM1_Ex3.java

Sesto paso: 
Para compilar el archivo.java usamos el comando javac + el nombre del archivo: 
  S105_n1Ex1 = javac ListaDirectorio.java
  S105_n2Ex1 = javac S105_n2Ex1_ParametizarMetodosM1_Ex3.java

Septimo paso:
Si compila bien se genera un archivo.class con el mismo nombre que mi archivo original 

Octavo paso: 
Para ejecuta el programa usamos el comando "java" + el nombre de la clase que contienen el metodo main(sin el .class):

   S105_n1Ex1 = java ListaDirectorio
   S105_n2Ex1 = java S105_n2Ex1_ParametizarMetodosM1_Ex3 

El programa luego muestra la salida en la línea de comandos. 

