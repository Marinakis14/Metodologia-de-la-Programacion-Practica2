package parte2.PersistenciaDeDatos.ej4.ejercicios.EJ1.cuaderno4;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;

public class Main4 {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        Circle c = new Circle(5.0);
        ResizableCircle rc = new ResizableCircle(10.0);

        // Guardar
        gson.toJson(c, new FileWriter("circle2.json"));
        gson.toJson(rc, new FileWriter("resizable.json"));

        // Leer
        Circle cLeido = gson.fromJson(new FileReader("circle2.json"), Circle.class);
        ResizableCircle rcLeido = gson.fromJson(new FileReader("resizable.json"), ResizableCircle.class);

        // Mostrar
        System.out.println(cLeido);
        System.out.println(rcLeido);
    }
}