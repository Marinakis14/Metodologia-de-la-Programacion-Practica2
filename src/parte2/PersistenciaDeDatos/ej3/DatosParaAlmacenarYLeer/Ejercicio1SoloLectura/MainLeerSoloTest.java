package parte2.PersistenciaDeDatos.ej3.DatosParaAlmacenarYLeer.Ejercicio1SoloLectura;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainLeerSoloTest {

    @Test
    public void testCargarObjetoDesdeArchivo_Correcto() {
        String rutaArchivo = "src/parte2/PersistenciaDeDatos/ej3/DatosParaAlmacenarYLeer/Ejercicio1SoloLectura/Usuario2.json";

        Usuario usuario = MainLeerSolo.cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);

        assertNotNull(usuario);
    }

    @Test
    public void testCargarObjetoDesdeArchivo_ArchivoNoExiste() {
        String rutaArchivo = "archivo_que_no_existe.json";

        Usuario usuario = MainLeerSolo.cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);

        assertNull(usuario);
    }
}