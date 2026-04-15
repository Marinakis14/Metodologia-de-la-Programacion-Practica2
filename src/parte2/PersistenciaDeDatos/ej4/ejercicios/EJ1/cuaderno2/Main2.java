package parte2.PersistenciaDeDatos.ej4.ejercicios.EJ1.cuaderno2;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;

public class Main2 {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        Author autor = new Author("Cervantes", "mail@gmail.com", 'm');
        Book libro = new Book("Don Quijote", autor, 20.0);

        //  Guardar
        try (FileWriter writer = new FileWriter("book.json")) {
            gson.toJson(libro, writer);
        }

        //  Leer
        Book libroLeido = gson.fromJson(
                new FileReader("book.json"),
                Book.class
        );

        // Mostrar
        System.out.println(libroLeido);
    }
}