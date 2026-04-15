package parte2.PersistenciaDeDatos.ej3.DatosParaAlmacenarYLeer.Ejercicio2RecibirParametrosDesdeLaLineaDeComandos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlumnoTest {

    @Test
    public void testConstructorYGetNombre() {
        Alumno alumno = new Alumno("Lucia", 20, "Programacion", 8.5);

        assertEquals("Lucia", alumno.getNombre());
    }

    @Test
    public void testGetEdad() {
        Alumno alumno = new Alumno("Lucia", 20, "Programacion", 8.5);

        assertEquals(20, alumno.getEdad());
    }

    @Test
    public void testGetCurso() {
        Alumno alumno = new Alumno("Lucia", 20, "Programacion", 8.5);

        assertEquals("Programacion", alumno.getCurso());
    }

    @Test
    public void testGetNotaMedia() {
        Alumno alumno = new Alumno("Lucia", 20, "Programacion", 8.5);

        assertEquals(8.5, alumno.getNotaMedia());
    }

    @Test
    public void testTodosLosDatosDelAlumno() {
        Alumno alumno = new Alumno("Lucia", 20, "Programacion", 8.5);

        assertEquals("Lucia", alumno.getNombre());
        assertEquals(20, alumno.getEdad());
        assertEquals("Programacion", alumno.getCurso());
        assertEquals(8.5, alumno.getNotaMedia());
    }
}