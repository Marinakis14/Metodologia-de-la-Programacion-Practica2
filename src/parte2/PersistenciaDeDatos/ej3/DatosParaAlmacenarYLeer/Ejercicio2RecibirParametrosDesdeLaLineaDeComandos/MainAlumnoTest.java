package parte2.PersistenciaDeDatos.ej3.DatosParaAlmacenarYLeer.Ejercicio2RecibirParametrosDesdeLaLineaDeComandos;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class MainAlumnoTest {

    @Test
    public void testGuardarObjetoEnArchivo() throws Exception {
        String rutaArchivo = "src/parte2/PersistenciaDeDatos/ej3/DatosParaAlmacenarYLeer/Ejercicio2RecibirParametrosDesdeLaLineaDeComandos/test_alumno.json";

        Alumno alumno = new Alumno("Lucia Perez", 20, "Ingenieria Informatica", 8.5);

        MainAlumno.guardarObjetoEnArchivo(rutaArchivo, alumno);

        File archivo = new File(rutaArchivo);
        assertTrue(archivo.exists());

        String contenido = Files.readString(Paths.get(rutaArchivo));
        assertTrue(contenido.contains("Lucia Perez"));
        assertTrue(contenido.contains("20"));
        assertTrue(contenido.contains("Ingenieria Informatica"));
        assertTrue(contenido.contains("8.5"));
    }

    @Test
    public void testCargarObjetoDesdeArchivo() throws Exception {
        String rutaArchivo = "src/parte2/PersistenciaDeDatos/ej3/DatosParaAlmacenarYLeer/Ejercicio2RecibirParametrosDesdeLaLineaDeComandos/test_alumno.json";

        String json = "{ \"nombre\": \"Lucia Perez\", \"edad\": 20, \"curso\": \"Ingenieria Informatica\", \"notaMedia\": 8.5 }";
        Files.writeString(Paths.get(rutaArchivo), json);

        Alumno alumnoCargado = MainAlumno.cargarObjetoDesdeArchivo(rutaArchivo, Alumno.class);

        assertNotNull(alumnoCargado);
        assertEquals("Lucia Perez", alumnoCargado.getNombre());
        assertEquals(20, alumnoCargado.getEdad());
        assertEquals("Ingenieria Informatica", alumnoCargado.getCurso());
        assertEquals(8.5, alumnoCargado.getNotaMedia(), 0.001);
    }

    @Test
    public void testMostrarAlumno() {
        Alumno alumno = new Alumno("Lucia Perez", 20, "Ingenieria Informatica", 8.5);

        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        PrintStream salidaOriginal = System.out;
        System.setOut(new PrintStream(salida));

        MainAlumno.mostrarAlumno(alumno);

        System.setOut(salidaOriginal);

        String textoSalida = salida.toString();

        assertTrue(textoSalida.contains("Nombre: Lucia Perez"));
        assertTrue(textoSalida.contains("Edad: 20"));
        assertTrue(textoSalida.contains("Titulacion: Ingenieria Informatica"));
        assertTrue(textoSalida.contains("Nota media: 8.5"));
    }
}