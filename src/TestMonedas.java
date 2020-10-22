import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMonedas {
    @Test
    public void testCrearMoneda() {
        Dolar cinco = new Dolar(5);
        assertEquals(5, cinco.cantidad);
    }

    @Test
    public void testMultiplicacion() {
        Dolar cinco = new Dolar(5);
        cinco.multiplicadoPor(2);
        assertEquals(10, cinco.cantidad);
    }

}
