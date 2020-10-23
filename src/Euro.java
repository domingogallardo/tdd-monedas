public class Euro extends Moneda {

    public Euro(int cantidad) {
        this.cantidad = cantidad;
    }

    public Euro multiplicadoPor(int multiplicador) {
        return new Euro(cantidad * multiplicador);
    }
}