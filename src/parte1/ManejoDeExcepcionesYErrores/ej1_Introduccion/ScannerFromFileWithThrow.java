package parte1.ManejoDeExcepcionesYErrores.ej1_Introduccion;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ScannerFromFileWithThrow {
    public static void main(String[] args) throws FileNotFoundException {
        // to be handled by next higher-level method
        Scanner in = new Scanner(new File("ArchivoQueSePuedeAbrir")); // archivo que si existe
        System.out.println("El archivo se ha leido correctamente");

        System.out.println("Pasando al siguiente archivo");
        in = new Scanner(new File("test.in")); // este archivo no existe asi que da error
        // this method may throw FileNotFoundException
        // main logic here ...
        // Como da error ya se para el programa y todo lo demas no se ejecuta
        System.out.println("Esto no lo vas a leer porque el segundo archivo no existe");
    }
}
