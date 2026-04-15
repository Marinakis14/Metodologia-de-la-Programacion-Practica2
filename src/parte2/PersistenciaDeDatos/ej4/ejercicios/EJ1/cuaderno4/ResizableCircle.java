package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ1.cuaderno4;

public class ResizableCircle extends Circle {
    // Constructor that initializes the radius of the resizable circle
    public ResizableCircle(double radius) {
        super(radius);
    }

    // Method to give the text description of the resizable circle
    public String toString(){
        return "ResizableCircle[radius=" + radius + "]";
    }

    // Method to resize the circle by a given percentage
    public void resize(double percent){
        radius *= (1 + percent / 100);
    }
}
