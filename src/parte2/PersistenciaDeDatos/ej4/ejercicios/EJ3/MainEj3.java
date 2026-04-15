package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ3;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class MainEj3 {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        // PRUEBA 1: array solo
        int[] numbers = {1, 2, 3, 4, 5};

        try (FileWriter writer = new FileWriter("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ3/numbers.json")) {
            gson.toJson(numbers, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo");
        }

        int[] numbersRead;
        try (FileReader reader = new FileReader("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ3/numbers.json")) {
            numbersRead = gson.fromJson(reader, int[].class);
        }

        System.out.println("Array leído:");
        for (int n : numbersRead) {
            System.out.print(n + " ");
        }
        System.out.println();


        // PRUEBA 2: array dentro de objeto
        Student s1 = new Student("Ana", 18);
        Student s2 = new Student("Luis", 17);
        Student s3 = new Student("Marcos", 17);

        Student[] lista = {s1, s2, s3};

        Classroom clase = new Classroom("1 Bach A", lista);

        try (FileWriter writer = new FileWriter("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ3/classroom.json")) {
            gson.toJson(clase, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo");
        }

        Classroom claseLeida;
        try (FileReader reader = new FileReader("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ3/classroom.json")) {
            claseLeida = gson.fromJson(reader, Classroom.class);
        }

        System.out.println("\nClase leída:");
        System.out.println(claseLeida.className);

        for (Student s : claseLeida.students) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}

//Cuando se guarda un array directamente, el JSON resultante es una lista de valores.
//Si el array está dentro de un objeto, aparece como un atributo del objeto y se reconstruye correctamente al leerlo.
//Es decir