package parte1.ManejoDeExcepcionesYErrores.ej8.CreandoNuestrasPropiasExcepciones;

// Create our own exception class by subclassing Exception. This is a checked exception
public class MyMagicException extends Exception {
    public MyMagicException(String message) {  //constructor
        super(message);
    }
}