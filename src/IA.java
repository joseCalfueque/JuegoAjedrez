import java.util.Random;

public class IA {

    private String color;
    private Random random;

    public IA(String color) {
        this.color = color;
        this.random = new Random();
    }

    public void jugar(Tablero tablero) {
        for (int f1 = 0; f1 < 8; f1++) {
            for (int c1 = 0; c1 < 8; c1++) {
                Pieza p = tablero.getPieza(f1, c1);
                if (p != null && p.getColor().equals(color)) {
                    for (int f2 = 0; f2 < 8; f2++) {
                        for (int c2 = 0; c2 < 8; c2++) {
                            if (p.esMovimientoValido(f2, c2, tablero.getTablero())) {
                                tablero.moverPieza(f1, c1, f2, c2);
                                System.out.println("IA mueve de " + f1 + "," + c1 + " a " + f2 + "," + c2);
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("IA no encontró movimientos válidos.");
    }
}
