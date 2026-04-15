package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ1.cuaderno2;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        Author autor = new Author("Cervantes", "mail@gmail.com", 'm');
        Book libro = new Book("Don Quijote", autor, 20.0);

        //  Guardar
        try (FileWriter writer = new FileWriter("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ1/cuaderno2/book.json")) {
            gson.toJson(libro, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo");
        }

        //  Leer
        Book libroLeido = null;
        try {
            libroLeido = gson.fromJson(
                    new FileReader("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ1/cuaderno2/book.json"),
                    Book.class
            );
            // Mostrar
            if (libroLeido != null) {
                System.out.println(libroLeido);
            }
        } catch (JsonIOException e) {
            System.out.println("Error al leer el archivo");
        }

    }
}