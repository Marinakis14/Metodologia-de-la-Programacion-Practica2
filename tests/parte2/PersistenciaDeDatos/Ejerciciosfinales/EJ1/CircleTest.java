package parte2.PersistenciaDeDatos.Ejerciciosfinales.EJ1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import parte1.ManejoDeExcepcionesYErrores.EJ1.cuaderno1.Circle;

class CircleTest {

    @Test
    void getRadius() {
        Circle c1 = new Circle();
        assertEquals(1.0, c1.getRadius());

        Circle c2 = new Circle(5.0);
        assertEquals(5.0, c2.getRadius());

        Circle c3 = new Circle(3.0, "blue");
        assertEquals(3.0, c3.getRadius());
    }

    @Test
    void getColor() {
        Circle c1 = new Circle();
        assertEquals("red", c1.getColor());

        Circle c2 = new Circle(4.0);
        assertEquals("red", c2.getColor());

        Circle c3 = new Circle(2.0, "green");
        assertEquals("green", c3.getColor());
    }

    @Test
    void setRadius() {
        Circle c = new Circle();
        c.setRadius(10.0);
        assertEquals(10.0, c.getRadius());
    }

    @Test
    void setColor() {
        Circle c = new Circle();
        c.setColor("yellow");
        assertEquals("yellow", c.getColor());
    }

    @Test
    void testToString() {
        Circle c = new Circle(2.0, "pink");
        assertEquals("Circle[radius=2.0 color=pink]", c.toString());
    }

    @Test
    void getArea() {
        Circle c = new Circle(2.0);
        assertEquals(Math.PI * 4, c.getArea(), 0.0001);
    }
}