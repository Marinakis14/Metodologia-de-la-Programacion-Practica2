package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ3.Student;

class StudentTest {

    @Test
    void defaultConstructor() {
        Student s = new Student();

        assertNull(s.getName());
        assertEquals(0, s.getAge());
    }

    @Test
    void constructorWithParams() {
        Student s = new Student("Marcos", 18);

        assertEquals("Marcos", s.getName());
        assertEquals(18, s.getAge());
    }
}
