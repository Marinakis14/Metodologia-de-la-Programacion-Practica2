package parte2.PersistenciaDeDatos.Ejerciciosfinales.EJ3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import parte2.PersistenciaDeDatos.ej4.ejercicios.EJ3.Student;

class StudentTest {

    @Test
    void defaultConstructor() {
        Student s = new Student();

        assertNull(s.name);
        assertEquals(0, s.age);
    }

    @Test
    void constructorWithParams() {
        Student s = new Student("Marcos", 18);

        assertEquals("Marcos", s.name);
        assertEquals(18, s.age);
    }
}
