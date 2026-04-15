package parte2.PersistenciaDeDatos.ej3.DatosParaAlmacenarYLeer.ejercicioalumnos;


import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MainAlumno {

    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void mostrarAlumno(Alumno alumno) {
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Edad: " + alumno.getEdad());
        System.out.println("Titulacion: " + alumno.getCurso());
        System.out.println("Nota media: " + alumno.getNotaMedia());
    }

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Uso: java -jar NombreDeTuProyecto.jar <operacion> <fichero>");
            System.out.println("Operaciones permitidas: init o show");
            return;
        }

        String operacion = args[0];
        String rutaArchivo = args[1];

        if (operacion.equals("init")) {
            Alumno alumno = new Alumno("Lucia Perez", 20, "Ingenieria Informatica", 8.5);
            guardarObjetoEnArchivo(rutaArchivo, alumno);
            System.out.println("Fichero creado correctamente en: " + rutaArchivo);

        } else if (operacion.equals("show")) {
            Alumno alumnoCargado = cargarObjetoDesdeArchivo(rutaArchivo, Alumno.class);

            if (alumnoCargado != null) {
                mostrarAlumno(alumnoCargado);
            } else {
                System.out.println("No se pudo leer el fichero.");
            }

        } else {
            System.out.println("Operacion no valida. Usa init o show.");
        }
    }
}
