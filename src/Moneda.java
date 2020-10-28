abstract public class Moneda {
    protected int cantidad;

    static public Dolar dolar(int cantidad) {
        return new Dolar(cantidad);
    }

    abstract Moneda multiplicadoPor(int multiplicador);

    public boolean equals(Object object) {
        Moneda moneda = (Moneda) object;
        return this.cantidad == moneda.cantidad &&
                this.getClass() == moneda.getClass();
    }
}
