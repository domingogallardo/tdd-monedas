public class Euro extends Moneda {

    public Euro(int cantidad, String denominacion) {
        this.cantidad = cantidad;
        this.denominacion = denominacion;
    }

    public Moneda multiplicadoPor(int multiplicador) {
        return Moneda.euro(cantidad * multiplicador);
    }
}