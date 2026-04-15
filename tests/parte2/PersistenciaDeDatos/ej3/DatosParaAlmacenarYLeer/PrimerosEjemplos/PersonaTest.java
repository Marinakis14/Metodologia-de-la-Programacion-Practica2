package parte2.PersistenciaDeDatos.ej3.DatosParaAlmacenarYLeer.PrimerosEjemplos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {

    @Test
    public void testConstructorYGetters() {
        Persona persona = new Persona("Lucia", 20);

        assertEquals("Lucia", persona.getNombre());
        assertEquals(20, persona.getEdad());
    }

    @Test
    public void testSetNombre() {
        Persona persona = new Persona("John Doe", 18);

        persona.setNombre("Carlos");

        assertEquals("Carlos", persona.getNombre());
    }

    @Test
    public void testSetEdad() {
        Persona persona = new Persona("John Doe", 18);

        persona.setEdad(25);

        assertEquals(25, persona.getEdad());
    }

    @Test
    public void testModificarTodosLosCampos() {
        Persona persona = new Persona("John Doe", 18);

        persona.setNombre("Ana");
        persona.setEdad(30);

        assertEquals("Ana", persona.getNombre());
        assertEquals(30, persona.getEdad());
    }
}