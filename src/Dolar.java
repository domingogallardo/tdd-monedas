public class Dolar extends Moneda {

    public Dolar(int cantidad) {
        this.cantidad = cantidad;
    }

    public Moneda multiplicadoPor(int multiplicador) {
        return new Dolar(cantidad * multiplicador);
    }
}
