package parte1.ManejoDeExcepcionesYErrores.ej2_ExplorandoPilaDeLlamadas;

public class ClaseConErrorManejadoConThrow3 {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        try {
            methodA();
            System.out.println("methodC se ha ejecutado correctamente");
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido un error en methodC() manejado desde main()");
        }
        System.out.println("Exit main()");
    }

    public static void methodA() throws ArithmeticException {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }

    public static void methodB() throws ArithmeticException {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }

    public static void methodC() throws ArithmeticException {
        // declaramos la excepcion y la manejamos en el programa "superior" -> methodB
        System.out.println("Enter methodC()");
        System.out.println(1 / 0);  // divide-by-0 triggers an ArithmeticException
        System.out.println("Exit methodC()");
    }
}
