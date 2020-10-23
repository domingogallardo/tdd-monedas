public class Euro extends Moneda {

    public Euro(int cantidad) {
        this.cantidad = cantidad;
    }

    public String denominacion() {
        return "EUR";
    }

    public Moneda multiplicadoPor(int multiplicador) {
        return new Euro(cantidad * multiplicador);
    }
}