package parte2.PersistenciaDeDatos.ej4.ejercicios.EJ4;

public class Asignatura {
    String nombreAsignatura;
    Estudiante[] estudiantes;

    public Asignatura() {
    }

    public Asignatura(String nombreAsignatura, Estudiante[] estudiantes) {
        this.nombreAsignatura = nombreAsignatura;
        this.estudiantes = estudiantes;
    }
}