package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ3;

public class Classroom {
    public String className;
    public Student[] students;

    public Classroom() {
    }

    public Classroom(String className, Student[] students) {
        this.className = className;
        this.students = students;
    }
}