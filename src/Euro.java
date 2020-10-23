public class Euro {
    private int cantidad;

    public Euro(int cantidad) {
        this.cantidad = cantidad;
    }

    public Euro multiplicadoPor(int multiplicador) {
        return new Euro(cantidad * multiplicador);
    }

    public boolean equals(Object object) {
        Euro euro = (Euro) object;
        return cantidad == euro.cantidad;
    }
}