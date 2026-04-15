package parte1.ManejoDeExcepcionesYErrores.ej5.OperacionesManejoDeExcepciones;

public class Main5 {
    public static void main(String[] args) {
        // Ejemplo con la estructura try-catch-finally en el methodC directamente
        // Ademas en este caso no se produce ningun error
        System.out.println("--Clase 1--");
        ErrorManejadoConCatch.main(new String[0]);

        // Ejemplo donde methodC no maneja las excepciones y se las deja al metodo superior -> main
        // En este caso si que se produce una excepcion que es capturada por el programa
        System.out.println("\n--Clase 2--");
        ErrorManejadoConThrow.main(new String[0]);
    }
}
