package parte2.PersistenciaDeDatos.ej3.DatosParaAlmacenarYLeer.ejercicioalumnos;

public class Alumno {
    private String nombre;
    private int edad;
    private String curso;
    private double notaMedia;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, String curso, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.notaMedia = notaMedia;
    }
}

