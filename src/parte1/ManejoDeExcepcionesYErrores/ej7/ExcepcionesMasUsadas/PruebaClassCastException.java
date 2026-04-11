package parte1.ManejoDeExcepcionesYErrores.ej7.ExcepcionesMasUsadas;

public class PruebaClassCastException {
    static void main(String[] args) {
        System.out.println("Entrando en main");
        try {
            methodA();
        } catch (ClassCastException ex) {
            System.out.println("Error, los objetos no son compatibles");
            ex.printStackTrace();
        }
        System.out.println("Saliendo de main");
    }

    public static void methodA() {
        // Cuando se intenta cambiar el tipo de un objeto a otro pero no son compatibles
        System.out.println("Entrando en methodA");
        String[] strs = new String[3];
        Object o = new Object();
        System.out.println("Modificando objeto...");
        Integer i = (Integer)o;
        System.out.println(strs[0].length());
        System.out.println("Objetos modificados con exito"); // no va a llegar porque da error
        System.out.println("Saliendo de methodA");
    }
}
