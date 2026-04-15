package parte2.PersistenciaDeDatos.ej4.ejercicios.EJ1.cuaderno4;

public class Circle implements GeometricObject{
    protected double radius;
    // Constructor that initializes the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }
    // Method to give the text description of the circle
    public String toString(){
        return "Circle[radius=" + radius + "]";
    }

    // Method to give the perimeter of the circle
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to give the area of the circle
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
}

