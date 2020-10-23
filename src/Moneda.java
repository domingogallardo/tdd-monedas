abstract public class Moneda {
    protected int cantidad;
    protected String denominacion;

    public Moneda(int cantidad, String denominacion) {
        this.cantidad = cantidad;
        this.denominacion = denominacion;
    }

    static Moneda dolar(int cantidad) {
        return new Dolar(cantidad, "USD");
    }

    static Moneda euro(int cantidad) {
        return new Euro(cantidad, "EUR");
    }

    public abstract Moneda multiplicadoPor(int multiplicador);

    public String denominacion() {
        return denominacion;
    }

    public boolean equals(Object object) {
        Moneda moneda = (Moneda) object;
        return cantidad == moneda.cantidad &&
                this.getClass() == moneda.getClass();
    }
}