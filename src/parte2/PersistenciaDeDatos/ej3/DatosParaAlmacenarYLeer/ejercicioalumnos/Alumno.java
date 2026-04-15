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

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        public double getNotaMedia() {
            return notaMedia;
        }

        public void setNotaMedia(double notaMedia) {
            this.notaMedia = notaMedia;
        }
    }

