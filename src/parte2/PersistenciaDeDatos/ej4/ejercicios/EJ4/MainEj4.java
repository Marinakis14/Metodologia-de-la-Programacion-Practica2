package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ4;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class MainEj4 {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        Estudiante e1 = new Estudiante("Ventura", 18);
        Estudiante e2 = new Estudiante("Marino", 17);
        Estudiante e3 = new Estudiante("Marcos", 17);

        Estudiante[] lista = {e1, e2, e3};

        Asignatura asignatura = new Asignatura("Programacion", lista);

        try (FileWriter writer = new FileWriter("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ4/asignatura.json")) {
            gson.toJson(asignatura, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo");
        }

        Asignatura asignaturaLeida;
        try (FileReader reader = new FileReader("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ4/asignatura.json")) {
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
//Es decir java es capaz de guardar los datos en json en formato de array y de array dentro de un objeto:
//[1,2,3,4,5]
//{"className":"1 Bach A","students":[{"name":"Ana","age":18},{"name":"Luis","age":17},{"name":"Marcos","age":17}]}