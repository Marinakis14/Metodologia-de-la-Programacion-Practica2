package parte2.PersistenciaDeDatos.ej3.DatosParaAlmacenarYLeer.EjemploCompactoDeAlmacenamientoYCarga;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

class GsonUtilEjemploTest {

    @Test
    void testFlujoCompletoYMain() {
        GsonUtilEjemplo.main(new String[]{"Arg1", "Arg2"});

        new GsonUtilEjemplo();
        new GsonUtilEjemplo.Usuario("Test", 20, "test@test.com");
    }

    @Test
    void testGuardarYCargarExito() {
        String ruta = "test_usuario.json";
        GsonUtilEjemplo.Usuario user = new GsonUtilEjemplo.Usuario("Pepe", 25, "pepe@mail.com");

        // Probar guardado
        GsonUtilEjemplo.guardarObjetoEnArchivo(ruta, user);

        // Probar carga
        GsonUtilEjemplo.Usuario cargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo(ruta, GsonUtilEjemplo.Usuario.class);

        assertNotNull(cargado);
        assertEquals("Pepe", cargado.nombre);

        // Limpieza
        new File(ruta).delete();
    }

    @Test
    void testErroresArchivo() {
        // Forzar IOException en guardado (usando una ruta inválida como una carpeta que no existe)
        GsonUtilEjemplo.guardarObjetoEnArchivo("/ruta/fantasma/no/existe.json", new Object());

        // Forzar IOException en carga (archivo que no existe)
        Object resultado = GsonUtilEjemplo.cargarObjetoDesdeArchivo("archivo_que_no_existe.json", Object.class);

        assertNull(resultado, "Debería retornar null al fallar la carga");
    }
}