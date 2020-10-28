import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestMonedas {
    @Test
    public void testCrearMonedas() {
        assertEquals(new Dolar(5), new Dolar(5));
    }

    @Test
    public void testMultiplicacion() {
        Moneda cinco = Moneda.dolar(5);
        assertEquals(Moneda.dolar(10), cinco.multiplicadoPor(2));
        assertEquals(Moneda.dolar(15), cinco.multiplicadoPor(3));
    }

    @Test
    public void testIgualdad() {
        assertTrue(new Dolar(5).equals(new Dolar(5)));
        assertFalse(new Dolar(5).equals(new Dolar(6)));
        assertTrue(new Euro(5).equals(new Euro(5)));
        assertFalse(new Euro(5).equals(new Euro(6)));
        assertFalse(new Euro(5). equals(new Dolar(5)));
    }

    @Test
    public void testMultiplicacionEuro() {
        Euro cinco = new Euro(5);
        assertEquals(new Euro(10), cinco.multiplicadoPor(2));
        assertEquals(new Euro(15), cinco.multiplicadoPor(3));
    }

}
