package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ3.Student;
import parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ3.Classroom;

class ClassroomTest {

    @Test
    void defaultConstructor() {
        Classroom c = new Classroom();

        assertNull(c.className);
        assertNull(c.students);
    }

    @Test
    void constructorWithParams() {
        Student s1 = new Student("Ana", 17);
        Student s2 = new Student("Luis", 18);

        Student[] students = {s1, s2};

        Classroom c = new Classroom("1Bach", students);

        assertEquals("1Bach", c.className);
        assertArrayEquals(students, c.students);
    }
}