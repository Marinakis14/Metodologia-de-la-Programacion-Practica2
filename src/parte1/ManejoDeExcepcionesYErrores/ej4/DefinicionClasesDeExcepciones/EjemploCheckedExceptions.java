package parte1.ManejoDeExcepcionesYErrores.ej4.DefinicionClasesDeExcepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploCheckedExceptions {
    static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("ArchivoQueSePuedeAbrir")); // archivo que si existe
            System.out.println("El archivo se ha leido correctamente");

            System.out.println("Pasando al siguiente archivo");
            in = new Scanner(new File("test.in")); // este archivo no existe asi que da error
            // do something if no exception ...
            System.out.println("No se han producido errores"); // no va ha llegar hasta aqui porque el anterior da error
            // you main logic here in the try-block
        } catch (FileNotFoundException ex) { // error handling separated from the main logic
            System.out.println("Se ha producido un error");
        }
    }
}
