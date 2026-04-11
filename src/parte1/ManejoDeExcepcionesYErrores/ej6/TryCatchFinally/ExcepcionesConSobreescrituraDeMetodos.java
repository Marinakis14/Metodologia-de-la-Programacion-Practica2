package parte1.ManejoDeExcepcionesYErrores.ej6.TryCatchFinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExcepcionesConSobreescrituraDeMetodos extends ClaseParaExtender {
    @Override
    public void metodoParaSobreescribir() throws FileNotFoundException {
        // Como es un metodo sobreescrito podemos manejar las mismas excepciones que el metodo que sobreescribe o
        // sus subclases pero no podemos manejar mas excepciones

        System.out.println("Vamos a manejar una FileNotFoundException que es una subclase de IOException");
        System.out.println("Abriendo archivo");
        Scanner in = new Scanner(new File("text.in"));
        System.out.println(1 / 0);

        /**
         * Lo que no se puede hacer con las clases sobreescritas es lanzar mas excepciones que la clase que sobreescribe
         * pero si que podemos manejar las excepciones que queramos dentro de la clase:
         */
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException ex) { // Esta si la podemos manejar porque usamos la estructura try-catch
            System.out.println("Error, no se puede dividir por 0");
        }
    }

    /**
     * Lo que no se podria haber hecho es lo siguiente:
     */
//  @Override
//  public void metodoParaSobreescribir() throws Exception {}
    /**
     * Porque Excepcion esta por encima de IOException que lanza el metodo que eredamos
     */
//  @Override
//  public void metodoParaSobreescribir() throws ArithmeticException {}
    /**
     * De nuevo porque ArithmeticException esta a un nivel distinto de la IOException que lanza el metodo
     */
}