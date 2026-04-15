package parte2.PersistenciaDeDatos.ej3.DatosParaAlmacenarYLeer.EjemploCompactoDeAlmacenamientoYCarga;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class GsonUtilEjemploTest {

    @Test
    public void testGuardarObjetoEnArchivo() throws Exception {
        String rutaArchivo = "src/parte2/PersistenciaDeDatos/ej3/DatosParaAlmacenarYLeer/EjemploCompactoDeAlmacenamientoYCarga/test_usuario.json";

        GsonUtilEjemplo.Usuario usuario =
                new GsonUtilEjemplo.Usuario("Juan", 30, "juan@example.com");

        GsonUtilEjemplo.guardarObjetoEnArchivo(rutaArchivo, usuario);

        File archivo = new File(rutaArchivo);
        assertTrue(archivo.exists());

        String contenido = Files.readString(Paths.get(rutaArchivo));
        assertTrue(contenido.contains("Juan"));
        assertTrue(contenido.contains("30"));
        assertTrue(contenido.contains("juan@example.com"));
    }

    @Test
    public void testCargarObjetoDesdeArchivo() throws Exception {
        String rutaArchivo = "src/parte2/PersistenciaDeDatos/ej3/DatosParaAlmacenarYLeer/EjemploCompactoDeAlmacenamientoYCarga/test_usuario.json";

        String json = "{ \"nombre\": \"Juan\", \"edad\": 30, \"correo\": \"juan@example.com\" }";
        Files.writeString(Paths.get(rutaArchivo), json);

        GsonUtilEjemplo.Usuario usuarioCargado =
                GsonUtilEjemplo.cargarObjetoDesdeArchivo(rutaArchivo, GsonUtilEjemplo.Usuario.class);

        assertNotNull(usuarioCargado);
        assertEquals("Juan", usuarioCargado.nombre);
        assertEquals(30, usuarioCargado.edad);
        assertEquals("juan@example.com", usuarioCargado.correo);
    }

    @Test
    public void testGuardarObjetoEnArchivo_Error() {
        String rutaArchivo = "carpeta_que_no_existe/test_usuario.json";

        GsonUtilEjemplo.Usuario usuario =
                new GsonUtilEjemplo.Usuario("Juan", 30, "juan@example.com");

        assertDoesNotThrow(() ->
                GsonUtilEjemplo.guardarObjetoEnArchivo(rutaArchivo, usuario)
        );
    }

    @Test
    public void testCargarObjetoDesdeArchivo_Error() {
        String rutaArchivo = "carpeta_que_no_existe/test_usuario.json";

        GsonUtilEjemplo.Usuario usuarioCargado =
                GsonUtilEjemplo.cargarObjetoDesdeArchivo(rutaArchivo, GsonUtilEjemplo.Usuario.class);

        assertNull(usuarioCargado);
    }
}