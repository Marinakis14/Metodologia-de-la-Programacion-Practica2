package parte1.ManejoDeExcepcionesYErrores.ej5.OperacionesManejoDeExcepciones;

import java.io.File;
import java.io.FileNotFoundException;

public class ErrorManejadoConThrow {
    public static void main(String[] args) {
        System.out.println("Iniciando main()");
        try {
            // uses methodC() which declares FileNotFoundException & ArithmeticException
            System.out.println("Entrando en methodC");
            methodC();
            System.out.println("Saliendo de methodC sin errores");
        } catch (FileNotFoundException ex) {
            // Exception handler for FileNotFoundException
            System.out.println("Error, no se ha encontrado el archivo");
        } catch (ArithmeticException ex) {
            // Exception handler for ArithmeticException
            System.out.println("Error, no se puede dividir entre 0");
        } finally {   // optional
            // These codes always run, used for cleaning up
            System.out.println("Estamos ordenando y terminando todo");
            System.out.println("Metodo terminado");
        }
    }

    // El método declara que puede lanzar dos excepciones distintas
    public static void methodD(String nombreArchivo, int dato) throws FileNotFoundException, ArithmeticException {

        // 1. Simulación de FileNotFoundException (FileNotFoundException -> Checked Exception)
        File archivo = new File(nombreArchivo);
        if (archivo == null) {
            // Lanzamos la excepción
            throw new FileNotFoundException("El archivo no existe en el sistema");
        }
        System.out.println("El archivo se leyo correctamente");

        // 2. Simulación de ArithmeticException (ArithmeticException - Unchecked Exception)
        if (dato == 0) {
            // "Lanzamos" la excepción con un mensaje personalizado
            throw new ArithmeticException("No se puede dividir por 0");
            // puede ser necesario si por ejemplo dividimos algo entre el dato
        }
        System.out.println("El dato es valido");

        // Si no hay errores
        System.out.println("Todo se ha ejecutado correctamente");
    }

    public static void methodC() throws FileNotFoundException, ArithmeticException {
        // for next higher-level method to handle
        // uses methodD() which declares "throws FileNotFoundException, ArithmeticException"
        System.out.println("Entrando en methodD");
        methodD("ArchivoQueSePuedeAbrir", 0);   // no need for try-catch
        System.out.println("saliendo de methodD con exito");
    }
}
