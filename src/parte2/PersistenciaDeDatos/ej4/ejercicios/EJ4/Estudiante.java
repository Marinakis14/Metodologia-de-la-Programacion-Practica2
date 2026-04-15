package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ4;

public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}