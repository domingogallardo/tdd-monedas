import org.junit.Test;

import static org.junit.Assert.*;

public class TestMonedas {
    @Test
    public void testCrearMoneda() {
        assertEquals(new Dolar(5), new Dolar(5));
    }

    @Test
    public void testMultiplicacion() {
        Dolar cinco = new Dolar(5);
        assertEquals(new Dolar(10), cinco.multiplicadoPor(2));
        assertEquals(new Dolar(15), cinco.multiplicadoPor(3));
    }

    @Test
    public void testEquals() {
        assertTrue(new Dolar(5).equals(new Dolar(5)));
        assertFalse(new Dolar(5).equals(new Dolar(6)));
        assertTrue(new Euro(5).equals(new Euro(5)));
        assertFalse(new Euro(5).equals(new Euro(6)));
    }

    @Test
    public void testMultiplicacionEuro() {
        Euro cinco = new Euro(5);
        assertEquals(new Euro(10), cinco.multiplicadoPor(2));
        assertEquals(new Euro(15), cinco.multiplicadoPor(3));
    }
}
