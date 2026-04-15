package parte2.PersistenciaDeDatos.Ejerciciosfinales.EJ1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import parte2.PersistenciaDeDatos.ej4.ejercicios.EJ1.cuaderno1.InvoiceItem;

class InvoiceItemTest {

    @Test
    void constructorAndGetters() {
        InvoiceItem item = new InvoiceItem("A101", "Pen", 10, 1.5);

        assertEquals("A101", item.getId());
        assertEquals("Pen", item.getDesc());
        assertEquals(10, item.getQty());
        assertEquals(1.5, item.getUnitPrice());
    }

    @Test
    void setQty() {
        InvoiceItem item = new InvoiceItem("A102", "BookTest", 5, 10.0);

        item.setQty(20);
        assertEquals(20, item.getQty());
    }

    @Test
    void setUnitPrice() {
        InvoiceItem item = new InvoiceItem("A103", "Pencil", 3, 2.0);

        item.setUnitPrice(5.0);
        assertEquals(5.0, item.getUnitPrice());
    }

    @Test
    void getTotal() {
        InvoiceItem item = new InvoiceItem("A104", "Notebook", 4, 2.5);

        assertEquals(10.0, item.getTotal());
    }

    @Test
    void testToString() {
        InvoiceItem item = new InvoiceItem("A105", "Marker", 2, 3.0);

        assertEquals("InvoiceItem[id=A105,desc='Marker,qty=2,unitPrice=3.0]", item.toString());
    }
}