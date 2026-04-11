package parte1.ManejoDeExcepcionesYErrores.ej7.ExcepcionesMasUsadas;

public class Main {
    static void main(String[] args) {
        System.out.println("--Vamos a ver las excepciones mas usadas--");
        System.out.println("1. ArrayIndexOutOfBoundsException");
        PruebaArrayIndexOutOfBoundsException.main(new String[0]);
        System.out.println();

        System.out.println("2. NullPointerException");
        PruebaNullPointerException.main(new String[0]);
        System.out.println();

        System.out.println("3. NumberFormatException");
        PruebaNumberFormatException.main(new String[0]);
        System.out.println();

        System.out.println("4. ClassCastException");
        PruebaClassCastException.main(new String[0]);
        System.out.println();

        System.out.println("5. IllegalArgumentException");
        PruebaIllegalArgumentException.main(new String[0]);
        System.out.println();

        System.out.println("6. IllegalStateException");
        PruebaIllegalStateException.main(new String[0]);
        System.out.println();

        System.out.println("7. NoClassDefFoundError");
        System.out.println("Este es mas dificil de hacer, se da cuando no se puede encontrar una clase");
    }
}
