package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ1.cuaderno3;

public class Point {

    //private instance variables
    private float x = 0.0f;
    private float y = 0.0f;

    //Constructors

    /**
     * Constructs a Point instance with the given x and y
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructs a Point instance
     */
    public Point() {
    }

    //Getter for instance variable x
    public float getX() {
        return x;
    }

    //Getter for instance variable y
    public float getY() {
        return y;
    }

    //Setter for instance variable x
    public void setX(float x) {
        this.x = x;
    }

    //Setter for instance variable y
    public void setY(float y) {
        this.y = y;
    }

    //Getter for instance variables x and y
    public float[] getXY() {
        return new float[]{this.x,this.y};
    }

    //Setter for instance variables x and y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /** Returns a self-descriptive string of this instance in the form of (x,y) */
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
