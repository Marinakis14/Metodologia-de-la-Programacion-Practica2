package parte1.ManejoDeExcepcionesYErrores.ej6.TryCatchFinally;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main6 {
    public static void main(String[] args) {
        // Vemos la primera clase que daba error y hemos modificado
        System.out.println("--Clase 1--");
        System.out.println("Clase modificada para que no se produzcan errores");
        MethodCallStackDemo.main(new String[0]);
        // Comprobamos las dos salidas distintas de la clase TryCatchFinally
        System.out.println("--Clase 2--");
        System.out.println("--No se producen excepciones--");
        TryCatchFinally.main("ArchivoQueSePuedeAbrir");

        System.out.println("\n--Se produce una excepcion--");
        TryCatchFinally.main("test.in");

        // Comprobamos las dos salidas distintas de la clase StackTrace
        System.out.println("\n--Clase 3--");
        System.out.println("--No se producen excepciones--");
        StackTrace.main("ArchivoQueSePuedeAbrir");

        System.out.println("\n--Se produce una excepcion--");
        StackTrace.main("test.in");

        // Probando la clase EjemploExceptionesYSubclases
        System.out.println("\n--Clase 4--");
        System.out.println("-Aqui vemos la importancia de mantener el orden al manejar sublases de excepciones");
        ExcepcionesYSubclases.main(new String[0]);

        // Probando la clase ExcepcionesConSobrecargaDeMetodos
        System.out.println("\n--Clase 5--");
        System.out.println("-Aqui vemos como funcionan las excepciones con clases sobrecargadas");
        ExcepcionesConSobrecargaDeMetodos.main(new String[0]);

        // Probando la clase ExcepcionesConSobreescrituraDeMetodos
        System.out.println("\n--Clase 6--");
        System.out.println("-Aqui vemos como funcionan las excepciones con clases sobreescritas");
        System.out.println("Probando metodo 'normal' primero...");

        // Como estos metodos lanzan excepciones tenemos que manejarlas aqui
        try {
            ClaseParaExtender objeto = new ClaseParaExtender();
            objeto.metodoParaSobreescribir();
        } catch (IOException ex) {
            System.out.println("El archivo no se ha encontrado");
            System.out.println("Excepcion atrapada");
        }

        System.out.println("Probando ahora el metodo sobreescrito...");

        try {
            ExcepcionesConSobreescrituraDeMetodos objeto = new ExcepcionesConSobreescrituraDeMetodos();
            objeto.metodoParaSobreescribir();
        } catch(FileNotFoundException ex) { // Es una subclase de IOException asi que la podemos manejar
            System.out.println("No hemos encontrado el archivo");
            System.out.println("Excepcion manejada con exito");
        }
        System.out.println("\n--Programa terminado--");

    }
}
