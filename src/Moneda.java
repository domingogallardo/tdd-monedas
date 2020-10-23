public class Moneda {
    protected int cantidad;

    static Dolar dolar(int cantidad) {
        return new Dolar(cantidad);
    }

    public boolean equals(Object object) {
        Moneda moneda = (Moneda) object;
        return cantidad == moneda.cantidad &&
                this.getClass() == moneda.getClass();
    }
}