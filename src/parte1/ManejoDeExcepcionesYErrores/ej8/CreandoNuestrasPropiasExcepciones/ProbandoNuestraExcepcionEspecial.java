package parte1.ManejoDeExcepcionesYErrores.ej8.CreandoNuestrasPropiasExcepciones;

public class ProbandoNuestraExcepcionEspecial {
    public static void basket(String nombre) throws ExcepcionEspecial {
        if (nombre == "Curry") {
            throw (new ExcepcionEspecial("Has encontrado al jugador especial"));
        }
        // si no encuentra al jugador
        System.out.println("No te pierdas el proximo partido donde juega " + nombre);
    }

    public static void main(String[] args) {
        try {
            basket("Lebron");   // does not trigger exception
            basket("Curry");   // trigger exception
        } catch (ExcepcionEspecial ex) {   // exception handler
            ex.printStackTrace();
        }
    }
}
