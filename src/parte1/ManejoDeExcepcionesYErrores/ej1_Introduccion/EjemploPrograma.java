package parte1.ManejoDeExcepcionesYErrores.ej1_Introduccion;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploPrograma {
    public static void main(String[] args) {

        /**
         * Si añadimos las excepciones de la siguiente manera el codigo se vuelve dificil de leer
         */

        //    if (file exists) {
        //        open file;
        //        while (there is more records to be processed) {
        //            if (no IO errors) {
        //                process the file record
        //            } else {
        //                handle the errors
        //            }
        //        }
        //        if (file is opened) close the file;
        //    } else {
        //        report the file does not exist;
        //    }

        /**
         * La manera correcta de hacerlo es la siguiente:
         */

        // Declaramos el Scanner fuera para que sea accesible en 'finally'
        Scanner lector = null;

        try {
            // Main logic here
            // 1. Open file (Abrir el archivo)
            File miArchivo = new File("ArchivoQueSePuedeAbrir"); // aqui no da erro porque el archivo existe
            System.out.println("Abriendo archivo...");

            // Aquí usamos la firma: public Scanner(File source)
            lector = new Scanner(miArchivo);

            // 2. Process file (Procesar el archivo)
            System.out.println("Leyendo contenido del archivo...");

            // Hacemos lo mismo pero en este caso con un archivo que no existe
            miArchivo = new File("test.in");
            System.out.println("Abriendo siguiente archivo...");

            lector = new Scanner(miArchivo);
            // Aqui ya da error y no sigue
            System.out.println("Hemos intentado abrir el archivo pero no hemos podido");
            System.out.println("Estos mensajes no se van a leer");

        } catch (FileNotFoundException ex) {    // Exception handlers below
            // Exception handler for "file not found"
            System.out.println("Error: No hemos encontrado el archivo");

        } catch (IOException ex) {
            // Exception handler for "IO errors"
            System.out.println("Error de lectura/escritura: ");

        } finally {
            // always try to close the file
            if (lector != null) { // si es null no se ejecuta nada
                lector.close();
                System.out.println("Archivos cerrados correctamente.");
            }

        }
    }

}
