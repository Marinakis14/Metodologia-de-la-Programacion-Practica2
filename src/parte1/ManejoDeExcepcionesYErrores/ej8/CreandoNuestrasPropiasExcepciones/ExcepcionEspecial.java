package parte1.ManejoDeExcepcionesYErrores.ej8.CreandoNuestrasPropiasExcepciones;

public class ExcepcionEspecial extends RuntimeException {
    public ExcepcionEspecial(String message) {
        super(message);
    }
}
