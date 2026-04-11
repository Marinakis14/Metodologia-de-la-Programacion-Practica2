package parte1.ManejoDeExcepcionesYErrores.ej7.ExcepcionesMasUsadas;

public class PruebaIllegalStateException {
    static int horaActual = 9;

    static void main(String[] args) {
        System.out.println("Entrando en main");
        try {
            System.out.println("Probando a una hora buena:");
            methodA();
            System.out.println();
            horaActual = 3;
            System.out.println("Probando a una hora mala:");
            methodA();
        } catch (IllegalStateException ex) {
            System.out.println("Error, no puedes llamar a este metodo en este momento");
            ex.printStackTrace();
        }
        System.out.println("Saliendo de main");
    }

    // El IllegalStateException se usa para indicar que un metodo ha sido invocado en un momento inapropiado
    public static void methodA() {
        // En este caso no queremos que el despertador suene muy pronto
        System.out.println("Comprobando la hora que es");
        if (horaActual > 0 && horaActual < 8) {
            throw new IllegalStateException("El despertador no puede sonar tan pronto");
        }
        System.out.println("RIIIIIING");
        System.out.println("El despertador a sonado con exito");
    }
}
