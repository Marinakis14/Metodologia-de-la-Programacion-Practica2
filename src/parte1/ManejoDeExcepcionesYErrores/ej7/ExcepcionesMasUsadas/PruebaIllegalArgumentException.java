package parte1.ManejoDeExcepcionesYErrores.ej7.ExcepcionesMasUsadas;

public class PruebaIllegalArgumentException {
    static void main(String[] args) {
        System.out.println("Entrando en main");
        try {
            System.out.println("Probando con edad = 3:");
            methodA(3);
            System.out.println();
            System.out.println("Probando con edad = -4:");
            methodA(-4);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error, la edad no es valida");
            ex.printStackTrace();
        }
        System.out.println("Saliendo de main");
    }

    // El IllegalArgumentsException se usa para indicar que un metodo ha recibido argumentos no apropiados
    // La podemos usar nosotros para comprobar los parametros introducidos en nuestros metodos
    public static void methodA(int edad) {
        // En este caso no queremos que la edad sea negativa
        System.out.println("Comprobando la edad del niño");
        if (edad < 0 || edad > 18) {
            throw new IllegalArgumentException("la edad del niño no puede ser negativa ni superior a los 18 años");
        }
        System.out.println("la edad del niño es: " + edad);
    }
}
