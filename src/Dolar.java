public class Dolar extends Moneda {
    private String denominacion;

    public Dolar(int cantidad) {
        this.cantidad = cantidad;
        this.denominacion = "USD";
    }

    public String denominacion() {
        return denominacion;
    }

    public Moneda multiplicadoPor(int multiplicador) {
        return new Dolar(cantidad * multiplicador);
    }
}
