package parte1.ManejoDeExcepcionesYErrores.ej4.DefinicionClasesDeExcepciones;

public class Main4 {
    public static void main(String[] args) {
        // por un lado tenemos todas las excepciones no verificadas que no son comprobadas por el compilador,
        // y por lo tanto, no necesitan ser capturadas o declaradas como lanzadas
        System.out.println("--Clase 1--");
        // necesitamos los String vacios para que funcione
        EjemploUncheckedExceptions.main(new String[0]);

        // por otro lado tenemos todas las demas excepciones que son excepciones verificadas, las cuales
        // son comprobadas por el compilador y deben ser capturadas o declaradas como lanzadas
        System.out.println("\n--Clase 2--");
        EjemploCheckedExceptions.main(new String[0]);
    }
}
