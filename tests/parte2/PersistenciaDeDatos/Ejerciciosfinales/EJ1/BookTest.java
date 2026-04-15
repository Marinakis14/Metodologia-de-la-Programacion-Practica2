package parte2.PersistenciaDeDatos.Ejerciciosfinales.EJ1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import parte1.ManejoDeExcepcionesYErrores.EJ1.cuaderno2.Author;
import parte1.ManejoDeExcepcionesYErrores.EJ1.cuaderno2.Book;

class BookTest {

    @Test
    void constructorAndGetters() {
        Author author = new Author("Marcos", "marcos@email.com", 'M');
        Book book = new Book("Java", author, 20.0);

        assertEquals("Java", book.getName());
        assertEquals(author, book.getAuthor());
        assertEquals(20.0, book.getPrice());
        assertEquals(0, book.getQty());
    }

    @Test
    void constructorWithQty() {
        Author author = new Author("Ana", "ana@email.com", 'F');
        Book book = new Book("Python", author, 30.0, 5);

        assertEquals(5, book.getQty());
    }

    @Test
    void setPrice() {
        Author author = new Author("Luis", "luis@email.com", 'M');
        Book book = new Book("C++", author, 15.0);

        book.setPrice(25.0);

        assertEquals(25.0, book.getPrice());
    }

    @Test
    void setQty() {
        Author author = new Author("Luis", "luis@email.com", 'M');
        Book book = new Book("C++", author, 15.0);

        book.setQty(10);

        assertEquals(10, book.getQty());
    }

    @Test
    void authorMethods() {
        Author author = new Author("Eva", "eva@email.com", 'F');
        Book book = new Book("JS", author, 12.0);

        assertEquals("Eva", book.getAuthorName());
        assertEquals("eva@email.com", book.getAuthorEmail());
        assertEquals('F', book.getAuthorGender());
    }

    @Test
    void testToString() {
        Author author = new Author("Carlos", "carlos@email.com", 'M');
        Book book = new Book("HTML", author, 10.0, 2);

        assertEquals(
                "Book[name=HTML,Author[name=Carlos,email=carlos@email.com,gender=M],price=10.0,qty=2]",
                book.toString()
        );
    }
}