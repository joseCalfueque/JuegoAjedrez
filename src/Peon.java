public class Peon extends Pieza {

    public Peon(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public boolean esMovimientoValido(int nuevaFila, int nuevaColumna, Pieza[][] tablero) {
        int direccion = color.equals("blanco") ? -1 : 1;

        if (columna == nuevaColumna) {
            if (nuevaFila == fila + direccion && tablero[nuevaFila][nuevaColumna] == null) {
                return true;
            }

            if ((color.equals("blanco") && fila == 6 || color.equals("negro") && fila == 1) &&
                    nuevaFila == fila + 2 * direccion &&
                    tablero[fila + direccion][columna] == null &&
                    tablero[nuevaFila][nuevaColumna] == null) {
                return true;
            }
        }

        if (Math.abs(columna - nuevaColumna) == 1 &&
                nuevaFila == fila + direccion &&
                tablero[nuevaFila][nuevaColumna] != null &&
                !tablero[nuevaFila][nuevaColumna].getColor().equals(color)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return color.equals("blanco") ? "Pb" : "Pn";
    }
}
