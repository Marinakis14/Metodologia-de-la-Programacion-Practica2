package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ1.cuaderno3;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        MovablePoint p = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);

        //  Guardar
        try (FileWriter writer = new FileWriter("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ1/cuaderno3/movable.json")) {
            gson.toJson(p, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo");
        }

        //  Leer
        MovablePoint pLeido = null;
        try {
            pLeido = gson.fromJson(
                    new FileReader("src/parte2/PersistenciaDeDatos/ej4/Ejercicios/EJ1/cuaderno3/movable.json"),
                    MovablePoint.class
            );
            if (pLeido != null) {
                // Mostrar
                System.out.println(pLeido);
            }
        } catch (JsonIOException e) {
            System.out.println("Error al leer el archivo");
        }

    }
}