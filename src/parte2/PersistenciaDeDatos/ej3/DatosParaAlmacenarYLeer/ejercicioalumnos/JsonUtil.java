package parte2.PersistenciaDeDatos.ej3.DatosParaAlmacenarYLeer.ejercicioalumnos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class JsonUtil {
        public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            try (FileWriter writer = new FileWriter(rutaArchivo)) {
                gson.toJson(objeto, writer);
            } catch (IOException e) {
                System.out.println("Error al guardar el archivo: " + e.getMessage());
            }
        }

        public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
            Gson gson = new Gson();

            try (FileReader reader = new FileReader(rutaArchivo)) {
                return gson.fromJson(reader, clase);
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
                return null;
            }
        }
    }
