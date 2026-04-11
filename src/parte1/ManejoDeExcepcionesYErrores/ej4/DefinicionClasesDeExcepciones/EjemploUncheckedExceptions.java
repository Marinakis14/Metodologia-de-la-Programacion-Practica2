package parte1.ManejoDeExcepcionesYErrores.ej4.DefinicionClasesDeExcepciones;

public class EjemploUncheckedExceptions {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }

    public static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }

    public static void methodB() {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }

    public static void methodC() throws ArithmeticException { // declaramos la excepcion que se puede dar
        try {
            System.out.println("Enter methodC()");
            System.out.println(1 / 0);  // divide-by-0 triggers an ArithmeticException
            System.out.println("Exit methodC()");
        } catch (ArithmeticException ex) {
            // Maneja el error especifico de dividir entre 0
            System.out.println("Error de division entre 0");
            System.out.println("Exit methodC()");
        }
    }
}
