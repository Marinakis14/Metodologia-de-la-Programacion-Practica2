package parte1.ManejoDeExcepcionesYErrores.ej7.ExcepcionesMasUsadas;

public class PruebaNumberFormatException {
    static void main(String[] args) {
        System.out.println("Entrando en main");
        try {
            methodA();
        } catch (NumberFormatException ex) {
            System.out.println("Error, no se puede pasar la cadena a un numero");
            ex.printStackTrace();
        }
        System.out.println("Saliendo de main");
    }

    public static void methodA() {
        // Cuando se intenta convertir una cadena en un numero pero la cadena no tiene el formato apropiado
        System.out.println("Entrando en methodA");
        System.out.println("Modificando la cadena...");
        Integer.parseInt("abc");
        System.out.println("Cadena modificada con exito"); // no va a llegar porque da error
        System.out.println("Saliendo de methodA");
    }
}
