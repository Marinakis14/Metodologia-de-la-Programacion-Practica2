package parte2.PersistenciaDeDatos.ej3.DatosParaAlmacenarYLeer;


import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class MainLeerSolo {
        public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
            Gson gson = new Gson();

            try (FileReader reader = new FileReader(rutaArchivo)) {
                return gson.fromJson(reader, clase);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        public static void main(String[] args) {
            String rutaArchivo = "C:\\Users\\UAH\\IdeaProjects\\Metodologia-de-la-Programacion-Practica2\\src\\parte2\\PersistenciaDeDatos\\ej3\\DatosParaAlmacenarYLeer\\Usuario.json";
            Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);

            if (usuarioCargado != null) {
                System.out.println("Nombre: " + usuarioCargado.nombre);
                System.out.println("Edad: " + usuarioCargado.edad);
                System.out.println("Correo: " + usuarioCargado.correo);
            } else {
                System.out.println("No se pudo cargar el archivo.");
            }
        }
    }

