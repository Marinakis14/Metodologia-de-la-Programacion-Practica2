package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ4.Estudiante;
import parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ4.Asignatura;

class AsignaturaTest {

    @Test
    void defaultConstructor() {
        Asignatura a = new Asignatura();

        assertNull(a.nombreAsignatura);
        assertNull(a.estudiantes);
    }

    @Test
    void constructorWithParams() {
        Estudiante e1 = new Estudiante("Ana", 17);
        Estudiante e2 = new Estudiante("Luis", 18);

        Estudiante[] estudiantes = {e1, e2};

        Asignatura a = new Asignatura("Matematicas", estudiantes);

        assertEquals("Matematicas", a.nombreAsignatura);
        assertArrayEquals(estudiantes, a.estudiantes);
    }
}