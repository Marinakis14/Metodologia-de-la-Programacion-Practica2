package parte2.PersistenciaDeDatos.ej4.ejercicios.EJ1.cuaderno1;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        // Crear objetos
        Circle c = new Circle(5.0, "blue");
        InvoiceItem item = new InvoiceItem("A1", "Teclado", 2, 20.0);

        //  Guardar
        try (FileWriter writer = new FileWriter("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ1/cuaderno1/circle.json")) {
            gson.toJson(c, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo");
        }

        try (FileWriter writer = new FileWriter("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ1/cuaderno1/invoice.json")) {
            gson.toJson(item, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo");
        }

        //  Leer
        Circle cLeido = null;
        InvoiceItem itemLeido = null;
        try {
            cLeido = gson.fromJson(new FileReader("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ1/cuaderno1/circle.json"), Circle.class);
            itemLeido = gson.fromJson(new FileReader("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ1/cuaderno1/invoice.json"), InvoiceItem.class);
            if (itemLeido != null && cLeido != null) {
                // Mostrar
                System.out.println(cLeido);
                System.out.println(itemLeido);
            }
        } catch (JsonIOException e) {
            System.out.println("Error al leer el archivo");
        }

    }
}
