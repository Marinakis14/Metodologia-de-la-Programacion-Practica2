package parte1.ManejoDeExcepcionesYErrores.ej1_Introduccion;

import java.io.FileNotFoundException;

public class ScannerSuperior { // Para manejar la excepcion que lanza ScannerFromFileWithThrow
    public static void main(String[] args) {

        try {
            System.out.println("Leyendo texto...");
            // Llamamos al main de ScannerFromFileWithThrow
            ScannerFromFileWithThrow.main(new String[0]); // necesitamos el String vacio para que funcione

            System.out.println("Lectura completada con éxito.");

        } catch (FileNotFoundException e) {
            // Manejamos el error que lanza la clase ScannerFromFileWithThrow
            System.out.println("Error, el archivo no existe");
        }

    }
}
