public class Dolar extends Moneda {

    public Dolar(int cantidad) {
        this.cantidad = cantidad;
    }

    public Moneda multiplicadoPor(int factor) {
        return new Dolar(cantidad * factor);
    }
}
