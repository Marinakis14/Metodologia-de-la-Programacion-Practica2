package parte1.ManejoDeExcepcionesYErrores.ej3.ExcepcionesYPilasDeLLamadas;

public class ProcesoIlustradoEnLaPractica {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }

    public static void methodA() {
        System.out.println("Enter methodA()");
        try {
            methodB();
            System.out.println("methodC se ha ejecutado correctamente");
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido un error en methodC() manejado desde methodA()");
        }
        System.out.println("Exit methodA()");
    }

    public static void methodB() throws ArithmeticException {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }

    public static void methodC() throws ArithmeticException {
        System.out.println("Enter methodB()");
        methodD();
        System.out.println("Exit methodB()");
    }

    public static void methodD() throws ArithmeticException {
        // declaramos la excepcion y la manejamos en el programa "superior" -> methodB
        System.out.println("Enter methodC()");
        System.out.println(1 / 0);  // divide-by-0 triggers an ArithmeticException
        System.out.println("Exit methodC()");
    }
}
