package parte2.PersistenciaDeDatos.ej3.DatosParaAlmacenarYLeer;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Persona p = new Persona("Antonio Moratilla", 97);
        String json = gson.toJson(p);
        // Ahora podemos guardar y cargar nuestro objeto 'p' en el archivo json que hemos creado
        // podemos usar los metodos de GsonUtilEjemplo:
        GsonUtilEjemplo.guardarObjetoEnArchivo("Fichero.json", json);
        System.out.println(json);
    }
}

