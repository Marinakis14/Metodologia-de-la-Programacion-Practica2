package parte1.ManejoDeExcepcionesYErrores.ej7.ExcepcionesMasUsadas;

public class PruebaNullPointerException {
    static void main(String[] args) {
        System.out.println("Entrando en main");
        try {
            methodA();
        } catch (NullPointerException ex) {
            System.out.println("Error, el objeto al que intentas acceder es nulo");
            ex.printStackTrace();
        }
        System.out.println("Saliendo de main");
    }

    public static void methodA() {
        // Cuando se intenta usar una referencia a un objeto que en realidad es nula
        System.out.println("Entrando en methodA");
        String[] strs = new String[3];
        System.out.println("Leyendo la cadena...");
        System.out.println(strs[0].length());
        System.out.println("Cadena leida con exito"); // no va a llegar porque da error
        System.out.println("Saliendo de methodA");
    }
}
