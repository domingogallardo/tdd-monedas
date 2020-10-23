public class Dolar extends Moneda {

    public Dolar(int cantidad, String denominacion) {
        super(cantidad, denominacion);
    }

    public Moneda multiplicadoPor(int multiplicador) {
        return Moneda.dolar(cantidad * multiplicador);
    }
}
