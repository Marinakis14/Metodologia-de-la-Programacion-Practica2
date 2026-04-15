package parte2.PersistenciaDeDatos.ej4.ejercicios.EJ2;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;

public class Mainprueba {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        //  Crear objetos
        Author autor = new Author("Cervantes", "mail@gmail.com", 'm');
        Book libro = new Book("Quijote", autor, 20.0);

        //  Guardar en JSON
        gson.toJson(libro, new FileWriter("book.json"));

        //  Leer desde JSON
        Book libroLeido = gson.fromJson(new FileReader("book.json"), Book.class);

        //  Mostrar resultado
        System.out.println(libroLeido.name);
        System.out.println(libroLeido.author.name);
    }
    //Se han utilizado dos clases, Book y Author, donde Book contiene un objeto Author.
    //Al convertir el objeto a JSON se genera una estructura anidada.
    //Al leer el fichero, se reconstruyen correctamente ambos objetos.
}



