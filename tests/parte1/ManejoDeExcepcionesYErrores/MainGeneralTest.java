package parte1.ManejoDeExcepcionesYErrores;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

class MainGeneralTest {

    @Test
    void testMain() throws IOException {
        // 1. Preparación: Creamos el archivo que sabemos que pide el Apartado 1
        // para evitar que el flujo se detenga por un error de archivo no encontrado.
        File f1 = new File("ArchivoQueSePuedeAbrir");
        f1.createNewFile();

        // 2. Ejecución: Llamamos al main de la clase.
        // Al ser static, no necesitamos instanciar la clase.
        MainGeneral.main(new String[0]);

        // 3. Limpieza
        f1.delete();
    }
}