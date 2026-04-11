package parte1.ManejoDeExcepcionesYErrores.ej2_ExplorandoPilaDeLlamadas;

public class Main {
    public static void main(String[] args) throws ArithmeticException {

        System.out.println("--Clase 1--");
        // necesitamos los String vacios para que funcione
        MethodCallStackDemo.main(new String[0]);

        System.out.println("\n--Clase 2--");
        ClaseConErrorManejadoConCatch.main(new String[0]);

        System.out.println("\n--Clases para manejar la excepcion desde los distintos niveles");
        System.out.println("\n--Clase 3--");
        ClaseConErrorManejadoConThrow1.main(new String[0]);

        System.out.println("\n--Clase 4--");
        ClaseConErrorManejadoConThrow2.main(new String[0]);

        System.out.println("\n--Clase 5--");
        ClaseConErrorManejadoConThrow3.main(new String[0]);

    }
}
