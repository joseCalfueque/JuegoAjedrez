public class Tablero {
    private Pieza[][] tablero;

    public Tablero() {
        tablero = new Pieza[8][8];
        inicializarPiezas();
    }

    public void inicializarPiezas() {
        for (int i = 0; i < 8; i++) {
            tablero[1][i] = new Peon(1, i, "negro");
            tablero[6][i] = new Peon(6, i, "blanco");
        }

        tablero[0][0] = new Torre(0, 0, "negro");
        tablero[0][7] = new Torre(0, 7, "negro");
        tablero[7][0] = new Torre(7, 0, "blanco");
        tablero[7][7] = new Torre(7, 7, "blanco");

        tablero[0][4] = new Rey(0, 4, "negro");
        tablero[7][4] = new Rey(7, 4, "blanco");
    }

    public boolean moverPieza(int f1, int c1, int f2, int c2) {
        Pieza pieza = tablero[f1][c1];
        if (pieza != null && pieza.esMovimientoValido(f2, c2, tablero)) {
            tablero[f2][c2] = pieza;
            tablero[f1][c1] = null;
            pieza.setPosicion(f2, c2);
            return true;
        }
        return false;
    }

    public void imprimirTablero() {
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] != null) {
                    System.out.print(tablero[i][j] + " ");
                } else {
                    System.out.print("-- ");
                }
            }
            System.out.println();
        }
        System.out.println("   a  b  c  d  e  f  g  h");
    }

    public Pieza getPieza(int fila, int col) {
        return tablero[fila][col];
    }

    public Pieza[][] getTablero() {
        return tablero;
    }
}
