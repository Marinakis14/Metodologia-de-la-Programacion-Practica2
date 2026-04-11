package parte1.ManejoDeExcepcionesYErrores.ej6.TryCatchFinally;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClaseParaExtender {
    // Vamos a crear un metodo para sobreescribirlo en otra clase
    public void metodoParaSobreescribir() throws IOException {
        System.out.println("Entrando al metodo");
        System.out.println("Vamos a manejar una IOException");
        System.out.println("Abriendo archivo...");
        Scanner in = new Scanner(new File("text.in"));
        System.out.println("Saliendo del metodo");
    }
}
