package parte1.ManejoDeExcepcionesYErrores.ej6.TryCatchFinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExcepcionesConSobrecargaDeMetodos {
    static void main(String[] args) {
        System.out.println("Entrando en main");
        try {
            metodo1();
        } catch (FileNotFoundException ex) {
            System.out.println("Excepcion atrapada");
        }
        System.out.println("");
        try {
            metodo1(5);
        } catch (ArithmeticException ex) {
            System.out.println("Excepcion distinta manejada con exito");
        }
        System.out.println("Saliendo de main");
    }

    public static void metodo1() throws FileNotFoundException {
        System.out.println("Entrando a metodo1");
        System.out.println("Vamos a manejar una FileNotFoundException");
        System.out.println("Abriendo archivo...");
        Scanner in = new Scanner(new File("text.in"));
        System.out.println("Saliendo de metodo1");
    }

    // Solo se puede crear un metodo sobrecargado con los parametros que recibe no con las excepciones que maneja
    // Por ejemplo esto no se podria hacer:
//  public static void metodo1() throws ArithmeticException {}

    public static void metodo1(int numero) throws ArithmeticException { // metodo sobrecargado
        // Como esta sobrecargado aqui si que podemos manejar las excepciones que queramos
        System.out.println("Probando metodo sobrecargado");
        System.out.println("Vamos a manejar una ArithmeticExcepction");
        System.out.println(numero / 0);
        // se produce un error completamente distinto al de la otra clase que podemos manejar
        System.out.println("Saliendo de metodo sobrecargado");
    }
}
