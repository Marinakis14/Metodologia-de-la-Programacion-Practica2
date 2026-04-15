package parte2.PersistenciaDeDatos.ej4.ejercicios.EJ1.cuaderno1;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;

public class Main1 {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        // Crear objetos
        Circle c = new Circle(5.0, "blue");
        InvoiceItem item = new InvoiceItem("A1", "Teclado", 2, 20.0);

        //  Guardar
        try (FileWriter writer = new FileWriter("circle.json")) {
            gson.toJson(c, writer);
        }

        try (FileWriter writer = new FileWriter("invoice.json")) {
            gson.toJson(item, writer);
        }

        //  Leer
        Circle cLeido = gson.fromJson(new FileReader("circle.json"), Circle.class);
        InvoiceItem itemLeido = gson.fromJson(new FileReader("invoice.json"), InvoiceItem.class);

        // Mostrar
        System.out.println(cLeido);
        System.out.println(itemLeido);
    }
}
