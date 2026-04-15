package parte1.ManejoDeExcepcionesYErrores;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

class MainGeneralTest {

    @Test
    void testMain() throws IOException {
        // Ejecutamos nuestro MainGeneral que llama a todos los demás mains que a su vez llaman a todas las clases
        MainGeneral.main(new String[0]);
    }
}