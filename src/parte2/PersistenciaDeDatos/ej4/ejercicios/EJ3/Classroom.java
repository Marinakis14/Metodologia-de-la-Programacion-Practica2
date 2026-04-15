package parte2.PersistenciaDeDatos.ej4.ejercicios.EJ3;

public class Classroom {
    String className;
    Student[] students;

    public Classroom() {
    }

    public Classroom(String className, Student[] students) {
        this.className = className;
        this.students = students;
    }
}