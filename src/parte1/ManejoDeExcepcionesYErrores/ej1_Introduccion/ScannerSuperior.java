package parte1.ManejoDeExcepcionesYErrores.ej1_Introduccion;

public class ScannerSuperior { // Para manejar la excepcion que lanza ScannerFromFileWithThrow
    public static void main(String[] args) {

        try {
            System.out.println("Intentando ejecutar el lector de archivos...");

            // Llamada al main de tu otra clase
            // Pasamos un array vacío porque el main lo necesita
            ScannerFromFileWithThrow.main(new String[0]);

            System.out.println("Lectura completada con éxito.");

        } catch (FileNotFoundException e) {
            // AQUÍ es donde manejas el error que lanzó la otra clase
            System.err.println("¡ERROR DETECTADO! El archivo 'test.in' no existe.");
            System.err.println("Detalles técnicos: " + e.getMessage());
        }

    }
}
