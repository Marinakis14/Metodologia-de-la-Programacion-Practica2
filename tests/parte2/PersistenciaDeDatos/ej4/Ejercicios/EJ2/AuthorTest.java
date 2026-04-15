package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ2;

import org.junit.jupiter.api.Test;
import parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ1.cuaderno2.Author;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorTest {

    @Test
    void constructorAndGetters() {
        Author author = new Author("Marcos", "marcos@email.com", 'M');

        assertEquals("Marcos", author.getName());
        assertEquals("marcos@email.com", author.getEmail());
        assertEquals('M', author.getGender());
    }

    @Test
    void setEmail() {
        Author author = new Author("Ana", "ana@email.com", 'F');
        author.setEmail("nuevo@email.com");

        assertEquals("nuevo@email.com", author.getEmail());
    }

    @Test
    void testToString() {
        Author author = new Author("Luis", "luis@email.com", 'M');

        assertEquals(
                "Author[name=Luis,email=luis@email.com,gender=M]",
                author.toString()
        );
    }
}