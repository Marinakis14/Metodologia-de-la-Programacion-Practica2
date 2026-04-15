package parte2.PersistenciaDeDatos.Ejerciciosfinales.EJ1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import parte1.ManejoDeExcepcionesYErrores.EJ1.cuaderno4.Circle;

class Circle2Test {

    @Test
    void constructorAndToString() {
        Circle c = new Circle(5.0);

        assertEquals("Circle[radius=5.0]", c.toString());
    }

    @Test
    void getPerimeter() {
        Circle c = new Circle(2.0);

        assertEquals(2 * Math.PI * 2.0, c.getPerimeter(), 0.0001);
    }

    @Test
    void getArea() {
        Circle c = new Circle(3.0);

        assertEquals(Math.PI * 9, c.getArea(), 0.0001);
    }
}