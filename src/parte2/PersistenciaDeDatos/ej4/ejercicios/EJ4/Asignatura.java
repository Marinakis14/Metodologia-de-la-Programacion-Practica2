package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ4;

public class Asignatura {
    public String nombreAsignatura;
    public Estudiante[] estudiantes;

    public Asignatura() {
    }

    public Asignatura(String nombreAsignatura, Estudiante[] estudiantes) {
        this.nombreAsignatura = nombreAsignatura;
        this.estudiantes = estudiantes;
    }
}