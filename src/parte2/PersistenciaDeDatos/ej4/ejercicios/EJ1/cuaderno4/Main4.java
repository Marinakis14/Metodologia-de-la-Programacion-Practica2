package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ1.cuaderno4;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        Circle c = new Circle(5.0);
        ResizableCircle rc = new ResizableCircle(10.0);

        // Guardar
        try (FileWriter writer = new FileWriter("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ1/cuaderno4/circle2.json")) {
            gson.toJson(c, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo");
        }

        try (FileWriter writer = new FileWriter("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ1/cuaderno4/resizable.json")) {
            gson.toJson(rc, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo");
        }

        // Leer
        Circle cLeido = gson.fromJson(
                new FileReader("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ1/cuaderno4/circle2.json"),
                Circle.class
        );

        ResizableCircle rcLeido = gson.fromJson(
                new FileReader("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ1/cuaderno4/resizable.json"),
                ResizableCircle.class
        );

        // Mostrar
        System.out.println(cLeido);
        System.out.println(rcLeido);
    }
}