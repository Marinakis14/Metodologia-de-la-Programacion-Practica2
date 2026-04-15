package parte2.PersistenciaDeDatos.ej4.Ejercicios.EJ1.cuaderno1;

public class InvoiceItem {
    //private instance variable
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    /** Constructs a InvoiceItem instance with the given id, desc qty and unitPrice */
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getter for instance variable id
    public String getId() {
        return id;
    }

    // Getter for instance variable desc
    public String getDesc() {
        return desc;
    }

    // Getter for instance variable qty
    public int getQty() {
        return qty;
    }

    // Setter for instance variable qty
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Getter for instance variable unitPrice
    public double getUnitPrice() {
        return unitPrice;
    }

    // Setter for instance variable unitPrice
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Returns unitPrice*qty
    public double getTotal() {
        return unitPrice*qty;
    }

    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc='" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + ']';
    }
}
