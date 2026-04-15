package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ1.cuaderno2;

public class Author {
    //private instance variables
    private String name;
    private String email;
    private char gender;

    //Constructors
    /** Constructs an Author instance with the given name, email and gender */
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //Getter for instance variable name
    public String getName() {
        return name;
    }

    //Getter for instance variable email
    public String getEmail() {
        return email;
    }

    //Getter for instance variable gender
    public char getGender() {
        return gender;
    }

    //Setter for instance variable email
    public void setEmail(String email) {
        this.email = email;
    }

    /** Return a self-descriptive string of this instance in the form of Author[name=?,email=?,gender=?] */
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}
