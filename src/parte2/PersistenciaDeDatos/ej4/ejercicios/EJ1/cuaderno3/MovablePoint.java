package parte2.PersistenciaDeDatos.ej4.ejercicios.EJ1.cuaderno3;

public class MovablePoint extends Point {

    //private instance variables
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    //Constructors

    /**
     * Constructs a MovablePoint instance with the given x, y , xSpeed and ySpeed
     */
    MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Constructs a MovablePoint instance with the given x, y , xSpeed and ySpeed
     */
    MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Constructs a MovablePoint instance with the given x, y , xSpeed and ySpeed
     */
    MovablePoint() {
        super();
    }

    //Getter for instance variable xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    //Getter for instance variable ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    //Setter for instance variable xSpeed
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    //Setter for instance variable ySpeed
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    //Getter for instance variables xSpeed and ySpeed
    public float[] getSpeed() {
        return new float[]{this.xSpeed,this.ySpeed};
    }

    //Setter for instance variables xSpeed and ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /** Returns a self-descriptive string of this instance in the form of (x,y) */
    @Override
    public String toString() {
        return super.toString() + ",speed=(" + xSpeed + "," + ySpeed + ")";
    }

    //Adds the values of xSpeed and ySpeed to this x and y
    public MovablePoint move() {
        this.setX(this.getX() + xSpeed);
        this.setY(this.getY() + ySpeed);
        return this;
    }

}
