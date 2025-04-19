public class Torre extends Pieza {

    public Torre(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public boolean esMovimientoValido(int nuevaFila, int nuevaColumna, Pieza[][] tablero) {
        if (fila != nuevaFila && columna != nuevaColumna) {
            return false;
        }

        int pasoFila = Integer.compare(nuevaFila, fila);
        int pasoCol = Integer.compare(nuevaColumna, columna);

        int f = fila + pasoFila;
        int c = columna + pasoCol;

        while (f != nuevaFila || c != nuevaColumna) {
            if (tablero[f][c] != null) return false;
            f += pasoFila;
            c += pasoCol;
        }

        Pieza destino = tablero[nuevaFila][nuevaColumna];
        return destino == null || !destino.getColor().equals(color);
    }

    @Override
    public String toString() {
        return color.equals("blanco") ? "Tb" : "Tn";
    }
}
