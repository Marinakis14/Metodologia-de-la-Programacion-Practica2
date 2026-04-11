package parte1.ManejoDeExcepcionesYErrores.ej1_Introduccion;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("--Clase 1--");

        // necesitamos los String vacios para que funcione
        ScannerFromFileWithCatch.main(new String[0]);

        System.out.println("\n--Clase 2 y su clase superior--");
        ScannerSuperior.main(new String[0]); // a su vez llama a ScannerFromFileWithThrow

        System.out.println("\n--Clase 3--");
        EjemploPrograma.main(new String[0]);

    }
}
