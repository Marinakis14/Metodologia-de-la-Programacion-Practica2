package parte2.PersistenciaDeDatos.ej3.DatosParaAlmacenarYLeer.EjemploCompactoDeAlmacenamientoYCarga;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GsonUtilEjemplo {
    // Metodo para guardar un objeto en un archivo JSON
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Metodo para cargar un objeto desde un archivo JSON
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        // Crear una instancia del objeto Usuario
        Usuario usuario = new Usuario("Juan", 30, "juan@example.com");
        // Ruta del archivo donde se guardará el objeto
        String rutaArchivo = "src/parte2/PersistenciaDeDatos/ej3/DatosParaAlmacenarYLeer/EjemploCompactoDeAlmacenamientoYCarga/Usuario1.json";
        // Guardar el objeto Usuario en un archivo JSON
        guardarObjetoEnArchivo(rutaArchivo, usuario);
        // Cargar el objeto Usuario desde el archivo JSON
        Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);
        if (usuarioCargado != null) {
            System.out.println("Usuario cargado: " + usuarioCargado.nombre);
        }
    }
    // Clase Usuario para los ejemplos
    static class Usuario {
        String nombre;
        int edad;
        String correo;
        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
        // Getters y setters no incluidos por brevedad
    }
}

/**
 * ¿Porque se usa tanto el modificador 'static' y porque hace cosas extrañas? :
 *
 * En este caso usamos static en todos los metodos porque asi podemos hacer referencia a ellos facilmente en el main
 * si  no pusieramos, el modificador 'static' para utilizar guardarObjetoEnArchivo o cargarObjetoDesdeArchivo
 * habria que hacer:
 * GsonUtilEjemplo util = new GsonUtilEjemplo();
 * util.guardarObjetoEnArchivo(...);
 * para usar los metodos
 */

/**
 * ¿Donde se guarda el fichero de datos?
 *
 * El fichero de datos se guarda en la carpeta raiz del proyecto, al mismo nivel que src.
 */
