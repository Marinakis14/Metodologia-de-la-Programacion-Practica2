package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ2;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Mainprueba {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        //  Crear objetos
        Author autor = new Author("Cervantes", "mail@gmail.com", 'm');
        Book libro = new Book("Quijote", autor, 20.0);

        //  Guardar en JSON
        try (FileWriter writer = new FileWriter("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ2/book.json")) {
            gson.toJson(libro, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo");
        }

        //  Leer desde JSON
        try {
            Book libroLeido = gson.fromJson(new FileReader("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ2/book.json"), Book.class);
            //  Mostrar resultado
            if (libroLeido != null) {
                System.out.println("Nombre libro: " + libroLeido.name);
                System.out.println("Informacion autor: " + libroLeido.author.name + ", " + libroLeido.author.email + ", " + libroLeido.author.gender + ", ");
                System.out.println("Nombre libro: " + libroLeido.price);
            }

        } catch (JsonIOException e) {
            System.out.println("Error al leer el archivo");
        }

    }
    //Se han utilizado dos clases, Book y Author, donde Book contiene un objeto Author.
    //Al convertir el objeto a JSON se genera una estructura anidada.
    //Al leer el fichero, se reconstruyen correctamente ambos objetos.

    //Asi es como queda guardado en el json:
    //{"name":"Quijote","author":{"name":"Cervantes","email":"mail@gmail.com","gender":"m"},"price":20.0}

    //Y asi es como se ve por pantalla:
    //Nombre libro: Quijote
    //Informacion autor: Cervantes, mail@gmail.com, m,
    //Nombre libro: 20.0
}



