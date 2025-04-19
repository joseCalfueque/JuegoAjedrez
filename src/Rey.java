public class Rey extends Pieza {

    public Rey(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public boolean esMovimientoValido(int nuevaFila, int nuevaColumna, Pieza[][] tablero) {
        int deltaFila = Math.abs(nuevaFila - fila);
        int deltaCol = Math.abs(nuevaColumna - columna);

        if (deltaFila <= 1 && deltaCol <= 1) {
            Pieza destino = tablero[nuevaFila][nuevaColumna];
            return destino == null || !destino.getColor().equals(color);
        }

        return false;
    }

    @Override
    public String toString() {
        return color.equals("blanco") ? "Kb" : "Kn";
    }
}
