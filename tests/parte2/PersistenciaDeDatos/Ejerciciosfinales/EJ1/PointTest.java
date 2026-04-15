package parte2.PersistenciaDeDatos.Ejerciciosfinales.EJ1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import parte1.ManejoDeExcepcionesYErrores.EJ1.cuaderno3.Point;

class PointTest {

    @Test
    void constructorAndGetters() {
        Point p = new Point(2.0f, 3.0f);

        assertEquals(2.0f, p.getX());
        assertEquals(3.0f, p.getY());
    }

    @Test
    void defaultConstructor() {
        Point p = new Point();

        assertEquals(0.0f, p.getX());
        assertEquals(0.0f, p.getY());
    }

    @Test
    void setters() {
        Point p = new Point();

        p.setX(5.0f);
        p.setY(7.0f);

        assertEquals(5.0f, p.getX());
        assertEquals(7.0f, p.getY());
    }

    @Test
    void getXY() {
        Point p = new Point(1.0f, 2.0f);

        float[] xy = p.getXY();

        assertEquals(1.0f, xy[0]);
        assertEquals(2.0f, xy[1]);
    }

    @Test
    void setXY() {
        Point p = new Point();

        p.setXY(9.0f, 8.0f);

        assertEquals(9.0f, p.getX());
        assertEquals(8.0f, p.getY());
    }

    @Test
    void testToString() {
        Point p = new Point(4.0f, 6.0f);

        assertEquals("(4.0,6.0)", p.toString());
    }
}