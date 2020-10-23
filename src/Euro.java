public class Euro extends Moneda {

    public Euro(int cantidad, String denominacion) {
        super(cantidad, denominacion);
    }

    public Moneda multiplicadoPor(int multiplicador) {
        return Moneda.euro(cantidad * multiplicador);
    }
}