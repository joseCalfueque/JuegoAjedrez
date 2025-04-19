import java.util.Scanner;

public class Ajedrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tablero tablero = new Tablero();

        Jugador jugador1 = new Jugador("Humano", "blanco");
        IA ia = new IA("negro");

        int turno = 0;

        while (true) {
            tablero.imprimirTablero();

            if (turno % 2 == 0) {
                System.out.println("Turno del jugador " + jugador1.getNombre());
                System.out.print("Ingrese movimiento (ej: 6 0 5 0): ");
                int f1 = sc.nextInt();
                int c1 = sc.nextInt();
                int f2 = sc.nextInt();
                int c2 = sc.nextInt();

                if (!tablero.moverPieza(f1, c1, f2, c2)) {
                    System.out.println("Movimiento inválido.");
                    continue;
                }
            } else {
                System.out.println("Turno de la IA...");
                ia.jugar(tablero);
            }

            turno++;
        }
    }
}
