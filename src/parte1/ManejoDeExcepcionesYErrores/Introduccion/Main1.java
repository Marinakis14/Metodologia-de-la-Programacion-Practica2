package parte1.ManejoDeExcepcionesYErrores.Introduccion;

public class Main1 {
    public static void main(String[] args) {

        System.out.println("--Clase 1--");

        // necesitamos los String vacios para que funcione
        ScannerFromFileWithCatch.main(new String[0]);

        System.out.println("\n--Clase 2 y su clase superior--");
        ScannerSuperior.main(new String[0]); // a su vez llama a ScannerFromFileWithThrow

        System.out.println("\n--Clase 3--");
        EjemploPrograma.main(new String[0]);

    }
}
