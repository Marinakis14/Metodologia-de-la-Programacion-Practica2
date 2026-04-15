package parte2.PersistenciaDeDatos.ej4.ejercicios.EJ4;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;

public class MainEj4 {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        Estudiante e1 = new Estudiante("Ventura", 18);
        Estudiante e2 = new Estudiante("Marino", 17);
        Estudiante e3 = new Estudiante("Marcos", 17);

        Estudiante[] lista = {e1, e2, e3};

        Asignatura asignatura = new Asignatura("Programacion", lista);

        try (FileWriter writer = new FileWriter("asignatura.json")) {
            gson.toJson(asignatura, writer);
        }

        Asignatura asignaturaLeida;
        try (FileReader reader = new FileReader("asignatura.json")) {
            asignaturaLeida = gson.fromJson(reader, Asignatura.class);
        }

        System.out.println("Asignatura leída:");
        System.out.println(asignaturaLeida.nombreAsignatura);

        for (Estudiante e : asignaturaLeida.estudiantes) {
            System.out.println(e.nombre + " - " + e.edad);
        }
    }
}

//El fichero resultante tiene un objeto principal de tipo Asignatura y dentro un array de objetos Estudiante.
//Sí, se pueden modificar los alumnos en el JSON y, al cargarlo otra vez, se obtienen nuevos objetos con los datos cambiados.