package parte1.ManejoDeExcepcionesYErrores.ej6.TryCatchFinally;

public class MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }

    public static void methodA() {
        System.out.println("Enter methodA()");
        try {
            System.out.println("Se va ha producir un error...");
            System.out.println(1 / 0);
            // A divide-by-0 triggers an ArithmeticException - an unchecked exception
            // This method does not catch ArithmeticException
            // It runs the "finally" and popped off the call stack

            /**
             * Cambiamos el metodo para que si que atrape la excepcion y funcione correctamente
             */

        } catch (ArithmeticException ex) {
            System.out.println("Ahora si que capturamos el error");
        } finally {
            System.out.println("finally in methodA()");
        }
        System.out.println("Exit methodA()");
    }
}
