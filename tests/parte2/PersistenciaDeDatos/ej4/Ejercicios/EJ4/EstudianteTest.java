package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ4.Estudiante;

class EstudianteTest {

    @Test
    void defaultConstructor() {
        Estudiante e = new Estudiante();

        assertNull(e.getNombre());
        assertEquals(0, e.getEdad());
    }

    @Test
    void constructorWithParams() {
        Estudiante e = new Estudiante("Marcos", 18);

        assertEquals("Marcos", e.getNombre());
        assertEquals(18, e.getEdad());
    }
}
