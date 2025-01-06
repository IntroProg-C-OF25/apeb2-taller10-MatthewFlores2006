/***
 * Crea un juego de tres en raya utilizando una matriz bidimensional 
 * de _**3x3**_. Permita a dos jugadores marcar sus movimientos alternativamente. 
 * El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 * @author Matthew Flores
 */
import java.util.Scanner;
public class ejercicio6_TresEnRaya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] tab = new char[3][3];
        int fila, col;
        boolean cicloJuego = true, ganador, empate;
        char jugAct = 'X';
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = '-';
            }
        }
        while (cicloJuego) {
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab[i].length; j++) {
                    System.out.print(tab[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Turno del jugador " + jugAct);
            System.out.print("Ingrese una fila (0-2): ");
            fila = in.nextInt();
            System.out.print("Ingrese una columna (0-2): ");
            col = in.nextInt();
            if (fila >= 0 && fila < tab.length && col >= 0 && col < tab.length && tab[fila][col] == '-') {
                tab[fila][col] = jugAct;
                ganador = false;
                for (int i = 0; i < 3; i++) {
                    if (tab[i][0] == jugAct && tab[i][1] == jugAct && tab[i][2] == jugAct) {
                        ganador = true;
                        break;
                    }
                }
                for (int j = 0; j < 3; j++) {
                    if (tab[0][j] == jugAct && tab[1][j] == jugAct && tab[2][j] == jugAct) {
                        ganador = true;
                        break;
                    }
                }
                if (tab[0][0] == jugAct && tab[1][1] == jugAct && tab[2][2] == jugAct) {
                    ganador = true;
                }
                if (tab[0][2] == jugAct && tab[1][1] == jugAct && tab[2][0] == jugAct) {
                    ganador = true;
                }
                if (ganador) {
                    for (int i = 0; i < tab.length; i++) {
                        for (int j = 0; j < tab[i].length; j++) {
                            System.out.print(tab[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println(" ¡" +jugAct + " gano!");
                    cicloJuego = false;
                } else {
                    empate = true;
                    for (int i = 0; i < tab.length; i++) {
                        for (int j = 0; j < tab[i].length; j++) {
                            if (tab[i][j] == '-') {
                                empate = false;
                                break;
                            }
                        }
                    }
                    if (empate) {
                        for (int i = 0; i < tab.length; i++) {
                            for (int j = 0; j < tab[i].length; j++) {
                                System.out.print(tab[i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("Empate");
                        cicloJuego = false;
                    } else {
                        jugAct = (jugAct == 'X') ? 'O' : 'X';
                    }
                }
            } else {
                System.out.println("Movimiento invalido");
            }
        }
    }
}
/***run:
- - - 
- - - 
- - - 
Turno del jugador X
Ingrese una fila (0-2): 2
Ingrese una columna (0-2): 1
- - - 
- - - 
- X - 
Turno del jugador O
Ingrese una fila (0-2): 2
Ingrese una columna (0-2): 1
Movimiento invalido
- - - 
- - - 
- X - 
Turno del jugador O
Ingrese una fila (0-2): 2
Ingrese una columna (0-2): 2
- - - 
- - - 
- X O 
Turno del jugador X
Ingrese una fila (0-2): 1
Ingrese una columna (0-2): 1
- - - 
- X - 
- X O 
Turno del jugador O
Ingrese una fila (0-2): 0
Ingrese una columna (0-2): 0
O - - 
- X - 
- X O 
Turno del jugador X
Ingrese una fila (0-2): 0
Ingrese una columna (0-2): 1
O X - 
- X - 
- X O 
 ¡X gano!
 */