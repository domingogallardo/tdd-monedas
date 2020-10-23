abstract public class Moneda {
    protected int cantidad;

    static Moneda dolar(int cantidad) {
        return new Dolar(cantidad);
    }

    static Moneda euro(int cantidad) {
        return new Euro(cantidad);
    }

    public abstract Moneda multiplicadoPor(int multiplicador);

    public boolean equals(Object object) {
        Moneda moneda = (Moneda) object;
        return cantidad == moneda.cantidad &&
                this.getClass() == moneda.getClass();
    }
}