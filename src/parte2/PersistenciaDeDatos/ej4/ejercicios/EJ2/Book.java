package parte2.PersistenciaDeDatos.ej4.ejercicios.EJ2;

public class Book {
    String name;
    Author author;
    double price;

    public Book() {
    }

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}