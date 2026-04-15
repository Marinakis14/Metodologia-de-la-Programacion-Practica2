package parte1.ManejoDeExcepcionesYErrores;

import parte1.ManejoDeExcepcionesYErrores.Introduccion.Main1;
import parte1.ManejoDeExcepcionesYErrores.ej2.ExplorandoPilaDeLlamadas.Main2;
import parte1.ManejoDeExcepcionesYErrores.ej3.ExcepcionesYPilasDeLLamadas.ProcesoIlustradoEnLaPractica;
import parte1.ManejoDeExcepcionesYErrores.ej4.DefinicionClasesDeExcepciones.Main4;
import parte1.ManejoDeExcepcionesYErrores.ej5.OperacionesManejoDeExcepciones.Main5;
import parte1.ManejoDeExcepcionesYErrores.ej6.TryCatchFinally.Main6;
import parte1.ManejoDeExcepcionesYErrores.ej7.ExcepcionesMasUsadas.Main7;
import parte1.ManejoDeExcepcionesYErrores.ej8.CreandoNuestrasPropiasExcepciones.Main8;


// Programa principal para ejecutar todos los mains de la primera parte de la practica
public class MainGeneral {
    static void main(String[] args) {
        // Como cada main de cada apartado ya esta correctamente estructurado solamente tenemos que llamarlos
        System.out.println("-------PROGRAMA PRINCIPAL DE LA PRIMERA PARTE-------\n");
        System.out.println("----Apartado 1-----");
        System.out.println("Nos explica los conceptos basicos de como se manejan los errores de forma limpia y a utilizar el bloque try-catch\n");
        Main1.main(new String[0]);
        System.out.println("\n----Apartado 2-----");
        System.out.println("Nos enseña como se pueden gestionar las excepciones en una pila de llamadas con varios metodos involucrados\n");
        Main2.main(new String[0]);
        System.out.println("\n----Apartado 3-----");
        System.out.println("Nos explica como manejar varias excepciones a la vez\n");
        ProcesoIlustradoEnLaPractica.main(new String[0]);
        System.out.println("\n----Apartado 4-----");
        System.out.println("En este apartado vemos la diferencia entre unchecked exceptions y checked excepctions\n");
        Main4.main(new String[0]);
        System.out.println("\n----Apartado 5-----");
        System.out.println("Aqui aprendemos la diferencia entre el throw y el throws\n");
        Main5.main(new String[0]);
        System.out.println("\n----Apartado 6-----");
        System.out.println("Nos explica la estructura del try-catch-finnaly y la funcion del finnaly\n");
        Main6.main(new String[0]);
        System.out.println("\n----Apartado 7-----");
        System.out.println("Vemos las clases de excepciones mas utilizadas\n");
        Main7.main(new String[0]);
        System.out.println("\n----Apartado 8-----");
        System.out.println("Por ultimo aprendemos a crear nuestras propias excepciones para usar en nuestros programas\n");
        Main8.main(new String[0]);
        System.out.println("\n-------FINAL DE LA PRIMERA PARTE-------");
    }
}
