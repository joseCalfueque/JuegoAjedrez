public abstract class Pieza {
    protected int fila, columna;
    protected String color;

    public Pieza(int fila, int columna, String color) {
        this.fila = fila;
        this.columna = columna;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPosicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public abstract boolean esMovimientoValido(int nuevaFila, int nuevaColumna, Pieza[][] tablero);
    public abstract String toString();
}
