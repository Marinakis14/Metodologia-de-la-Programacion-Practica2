package parte1.ManejoDeExcepcionesYErrores.ej7.ExcepcionesMasUsadas;

public class PruebaArrayIndexOutOfBoundsException {
    static void main(String[] args) {
        System.out.println("Entrando en main");
        try {
            methodA();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error, estas fuera del rango del array");
            ex.printStackTrace();
        }
        System.out.println("Saliendo de main");
    }

    public static void methodA() {
        // Cuando se intenta acceder a una posicion de un array fuera del rango
        System.out.println("Entrando en methodA");
        int[] anArray = new int[3];
        System.out.println("Bucando en el array...");
        System.out.println(anArray[3]);
        System.out.println("Array leido con exito"); // no va a llegar porque da error
        System.out.println("Saliendo de methodA");
    }
}
