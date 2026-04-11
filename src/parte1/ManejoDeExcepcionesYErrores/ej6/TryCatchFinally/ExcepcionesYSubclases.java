package parte1.ManejoDeExcepcionesYErrores.ej6.TryCatchFinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExcepcionesYSubclases {
    static void main(String[] args) {
        System.out.println("Entrando en main");
        System.out.println("Probando las distintas excepciones que pueden ocurrir");
        methodA("text.in",3);
        System.out.println("");
        methodA("ArchivoQueSePuedeAbrir",0);
        System.out.println("");
        methodB();
        System.out.println("Saliendo de main");
    }

    static void methodA(String archivo, int numero) {
        System.out.println("Entrando a methodA");
        // Las subclases de excepciones deben ser manejadas antes
        System.out.println("Aqui manejamos las excepciones en el orden correcto");

        try {
            System.out.println("Abriendo archivo");
            Scanner in = new Scanner(new File(archivo));
            // Esto lanza una excepcion porque el archivo no existe
            System.out.println(3/numero);
            // Esto lanza otra excepcion porque no se puede dividir entre 0
        } catch (FileNotFoundException ex) {
            System.out.println("Erro, el archivo no se puede leer");
            System.out.println("Hemos atrapado la subclase mas pequeña");
        } catch (ArithmeticException ex) {
            System.out.println("Error, no se puede dividir entre 0");
            System.out.println("Hemos atrapado la otra excepcion con la subclase ArithmeticException");
        } catch (Exception ex) {
            System.out.println(("Resto de excepciones atrapadas"));
        }
        System.out.println("Saliendo de methodA");
    }

    static void methodB() {
        System.out.println("Entrando a methodB");
        // Ejemplo de metodo donde las subclases no se manejan antes
        System.out.println("Aqui manejamos las excepciones en el orden que no es");

        try {
            System.out.println("Abriendo archivo");
            Scanner in = new Scanner(new File("text.in"));
            // Esto lanza una excepcion porque el archivo no existe
        } catch (Exception ex) {
            System.out.println("Hemos atrapado la clase Exception que contiene a las demas subclases");
            System.out.println("Ya no podemos atrapar las subclases de excepciones");
        }
        /**
         * Esto ya no se puede hacer y da error porque ya hemos manejado todas las excepciones con la clase Exception
          */

//        catch (FileNotFoundException ex) {
//        } catch (ArithmeticException ex) {}
        System.out.println("Saliendo de methodB");
    }
}
