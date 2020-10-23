public class Euro extends Moneda {

    public Euro(int cantidad) {
        this.cantidad = cantidad;
        this.denominacion = "EUR";
    }

    public Moneda multiplicadoPor(int multiplicador) {
        return new Euro(cantidad * multiplicador);
    }
}