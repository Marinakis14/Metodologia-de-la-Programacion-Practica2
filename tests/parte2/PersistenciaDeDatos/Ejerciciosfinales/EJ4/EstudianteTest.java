package parte2.PersistenciaDeDatos.Ejerciciosfinales.EJ4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import parte2.PersistenciaDeDatos.ej4.ejercicios.EJ4.Estudiante;

class EstudianteTest {

    @Test
    void defaultConstructor() {
        Estudiante e = new Estudiante();

        assertNull(e.nombre);
        assertEquals(0, e.edad);
    }

    @Test
    void constructorWithParams() {
        Estudiante e = new Estudiante("Marcos", 18);

        assertEquals("Marcos", e.nombre);
        assertEquals(18, e.edad);
    }
}
