public class Dolar extends Moneda {

    public Dolar(int cantidad, String denominacion) {
        this.cantidad = cantidad;
        this.denominacion = denominacion;
    }

    public Moneda multiplicadoPor(int multiplicador) {
        return Moneda.dolar(cantidad * multiplicador);
    }
}
