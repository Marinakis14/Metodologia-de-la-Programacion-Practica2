package parte1.ManejoDeExcepcionesYErrores.ej8.CreandoNuestrasPropiasExcepciones;

public class Main8 {
    public static void main(String[] args) {
        System.out.println("Probando el ejemplo de excepcion dado...");
        MyMagicExceptionTest.main(new String[0]);
        System.out.println("\nProbando la excepcion que hemos creado...");
        ProbandoNuestraExcepcionEspecial.main(new String[0]);
    }
}
