public class Euro extends Moneda {
    private String denominacion;

    public Euro(int cantidad) {
        this.cantidad = cantidad;
        this.denominacion = "EUR";
    }

    public String denominacion() {
        return denominacion;
    }

    public Moneda multiplicadoPor(int multiplicador) {
        return new Euro(cantidad * multiplicador);
    }
}