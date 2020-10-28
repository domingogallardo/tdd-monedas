public class Euro extends Moneda {

    public Euro(int cantidad) {
        this.cantidad = cantidad;
    }

    public Moneda multiplicadoPor(int factor) {
        return new Euro(cantidad * factor);
    }
}
