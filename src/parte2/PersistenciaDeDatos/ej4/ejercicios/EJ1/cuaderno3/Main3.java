package parte2.PersistenciaDeDatos.ej4.ejercicios.EJ1.cuaderno3;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;

public class Main3 {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        MovablePoint p = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);

        //  Guardar
        try (FileWriter writer = new FileWriter("movable.json")) {
            gson.toJson(p, writer);
        }

        //  Leer
        MovablePoint pLeido = gson.fromJson(
                new FileReader("movable.json"),
                MovablePoint.class
        );

        // Mostrar
        System.out.println(pLeido);
    }
}