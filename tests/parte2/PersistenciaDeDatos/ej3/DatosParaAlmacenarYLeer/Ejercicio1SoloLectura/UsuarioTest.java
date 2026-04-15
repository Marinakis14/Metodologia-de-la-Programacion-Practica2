package parte2.PersistenciaDeDatos.ej3.DatosParaAlmacenarYLeer.Ejercicio1SoloLectura;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UsuarioTest {

    @Test
    public void testConstructorVacio() {
        Usuario usuario = new Usuario();

        assertNotNull(usuario);
    }

    @Test
    public void testConstructorConParametros() {
        Usuario usuario = new Usuario("Ana", 21, "ana@gmail.com");

        assertEquals("Ana", usuario.getNombre());
        assertEquals(21, usuario.getEdad());
        assertEquals("ana@gmail.com", usuario.getCorreo());
    }

    @Test
    public void testSetNombre() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Carlos");

        assertEquals("Carlos", usuario.getNombre());
    }

    @Test
    public void testSetEdad() {
        Usuario usuario = new Usuario();
        usuario.setEdad(30);

        assertEquals(30, usuario.getEdad());
    }

    @Test
    public void testSetCorreo() {
        Usuario usuario = new Usuario();
        usuario.setCorreo("carlos@hotmail.com");

        assertEquals("carlos@hotmail.com", usuario.getCorreo());
    }

    @Test
    public void testModificarTodosLosCampos() {
        Usuario usuario = new Usuario();

        usuario.setNombre("Lucia");
        usuario.setEdad(19);
        usuario.setCorreo("lucia@yahoo.com");

        assertEquals("Lucia", usuario.getNombre());
        assertEquals(19, usuario.getEdad());
        assertEquals("lucia@yahoo.com", usuario.getCorreo());
    }
}