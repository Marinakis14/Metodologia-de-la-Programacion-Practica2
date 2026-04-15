package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ1.cuaderno3.MovablePoint;

class MovablePointTest {

    @Test
    void constructorAndGetters() {
        MovablePoint p = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);

        assertEquals(1.0f, p.getX());
        assertEquals(2.0f, p.getY());
        assertEquals(3.0f, p.getXSpeed());
        assertEquals(4.0f, p.getYSpeed());
    }

    @Test
    void defaultConstructor() {
        MovablePoint p = new MovablePoint();

        assertEquals(0.0f, p.getX());
        assertEquals(0.0f, p.getY());
        assertEquals(0.0f, p.getXSpeed());
        assertEquals(0.0f, p.getYSpeed());
    }

    @Test
    void setters() {
        MovablePoint p = new MovablePoint();

        p.setXSpeed(5.0f);
        p.setYSpeed(6.0f);

        assertEquals(5.0f, p.getXSpeed());
        assertEquals(6.0f, p.getYSpeed());
    }

    @Test
    void getSpeed() {
        MovablePoint p = new MovablePoint(0.0f, 0.0f, 7.0f, 8.0f);

        float[] speed = p.getSpeed();

        assertEquals(7.0f, speed[0]);
        assertEquals(8.0f, speed[1]);
    }

    @Test
    void setSpeed() {
        MovablePoint p = new MovablePoint();

        p.setSpeed(9.0f, 10.0f);

        assertEquals(9.0f, p.getXSpeed());
        assertEquals(10.0f, p.getYSpeed());
    }

    @Test
    void move() {
        MovablePoint p = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);

        p.move();

        assertEquals(4.0f, p.getX());
        assertEquals(6.0f, p.getY());
    }

    @Test
    void testToString() {
        MovablePoint p = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);

        assertEquals("(1.0,2.0),speed=(3.0,4.0)", p.toString());
    }
}