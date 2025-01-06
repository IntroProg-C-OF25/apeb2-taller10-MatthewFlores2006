
/** *
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios,
 * desarrollar su procesamiento para presentar los elementos:
 *  De la diagonal principal.
 *  De la diagonal segundaria.
 *  Ubicados bajo la diagonal principal.
 *  Ubicados sobre la diagonal principal.
 *  Ubicados bajo la diagonal secundaria.
 *  Ubicados sobre la diagonal secundaria.
 *
 * @author Matthew Flores
 */
import java.util.Scanner;

public class Ejercicio1_DiagonalesMatriz {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        System.out.print("Ingrese el limite de la matriz: ");
        m = in.nextInt();
        int[][] array = new int[m][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\n - Diagonal principal obvia -");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + "\t");
                }
            }
        }
        System.out.println("\n - Diagonal principal eficiente -");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + "\t");
        }
        System.out.println("");
        System.out.println("\n - Diagonal secundaria obvia -");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i + j == m - 1) {
                    System.out.print(array[i][j] + "\t");
                }
            }
        }
        System.out.println("\n - Diagonal secundaria eficiente -");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][array.length - i - 1] + "\t");
        }
        System.out.println("");
        System.out.println("\n - Elementos bajo la diagonal principal (obvia) -");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i > j) {
                    System.out.print(array[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("\n - Elementos bajo la diagonal principal (eficiente) -");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println("\nElementos encima de la diagonal principal");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println("\nElementos por debajo de la diagonal secundaria");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i + j > array.length - 1) {
                    System.out.print(array[i][j] + "\t");
                }
            }
        }
        System.out.println("\nElementos por encima de la diagonal secundaria");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i + j < array.length - 1) {
                    System.out.print(array[i][j] + "\t");
                }
            }
        }
    }
}
/***
 * run:
Ingrese el limite de la matriz: 3
2	6	5	
2	5	8	
8	6	2	

 - Diagonal principal obvia -
2	5	2	
 - Diagonal principal eficiente -
2	5	2	

 - Diagonal secundaria obvia -
5	5	8	
 - Diagonal secundaria eficiente -
5	5	8	

 - Elementos bajo la diagonal principal (obvia) -
2	8	6	

 - Elementos bajo la diagonal principal (eficiente) -
2	8	6	
Elementos encima de la diagonal principal
6	5	8	
Elementos por debajo de la diagonal secundaria
8	6	2	
Elementos por encima de la diagonal secundaria
2	6	2	
 */