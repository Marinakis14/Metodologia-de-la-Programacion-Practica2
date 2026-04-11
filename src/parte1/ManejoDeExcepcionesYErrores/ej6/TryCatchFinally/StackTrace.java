package parte1.ManejoDeExcepcionesYErrores.ej6.TryCatchFinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StackTrace {
    public static void main(String archivo) {
        System.out.println("Entrando a main()");
        methodA(archivo);
        System.out.println("Saliendo de main()");
    }

    public static void methodA(String archivo) {
        System.out.println("Entrando a methodA()");
        try {
            System.out.println("Abriendo archivo...");
            Scanner in = new Scanner(new File(archivo));
            System.out.println("Archivo leido correctamente");

        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe");
            System.out.println("Probando el printStackTrace (que va a aparecer al final de todo en rojo)");
            ex.printStackTrace();
        } finally {
            System.out.println("Bloque finally...");
        }
        System.out.println("Saliendo de methodA()");
    }
}
