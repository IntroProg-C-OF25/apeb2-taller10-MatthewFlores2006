/** *
 * Ejercicio 2
 * Dadas dos matrices _(cuadradas y/o rectangulares)_ de valores enteros aleatorios, desarrollar su procesamiento para calcular y presentar:
 * La suma de las dos matrices _(considerar las restricciones matemáticas para ello)
 * La multiplicación de las dos matrices _(considerar las reglas matemáticas para ello)
 *
 * @author Matthew Flores
 */
import java.util.Scanner;
public class ejercicio2_MatricesOperaciones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f1, col1, f2, col2;
            int mat1[][] = null; 
            int mat2[][] = null;
            int sum[][]= null;
            while (true) {
                System.out.print("Ingrese la cantidad de filas de la primera matriz : ");
                f1 = in.nextInt();
                System.out.print("Ingrese la cantidad de columnas de la primera matriz: ");
                col1 = in.nextInt();
                mat1 = new int[f1][col1]; 
                System.out.print("Ingrese la cantidad de filas de la segunda matriz: ");
                f2 = in.nextInt();
                System.out.print("Ingrese la cantidad de columnas de la segunda matriz: ");
                col2 = in.nextInt();
                mat2 = new int[f2][col2]; 
                
                if (f1 != f2 || col1 != col2) {
                    System.out.println("No se puede realizar una operacion aritmetica; Las matrices deben ser de iguales dimensiones");
                } else {
                    sum = new int[f1][col1];
                    break;
                }
            }
         System.out.println("- Matriz 1 -");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                mat1[i][j] = (int) (Math.random() * 10);
                System.out.print(mat1[i][j] + "\t"); 
            }
            System.out.println(); 
        }
        System.out.println("\n- Matriz 2 -");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                mat2[i][j] = (int) (Math.random() * 10);
                System.out.print(mat2[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("\nSumatoria: ");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                sum[i][j] = mat1[i][j] * mat2[i][j];
            }
        }
        System.out.println("\nMultiplicacion:");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
/***
* run:
Ingrese la cantidad de filas de la primera matriz : 3
Ingrese la cantidad de columnas de la primera matriz: 3
Ingrese la cantidad de filas de la segunda matriz: 3
Ingrese la cantidad de columnas de la segunda matriz: 3
- Matriz 1 -
9	9	1	
6	6	5	
6	6	7	

- Matriz 2 -
1	9	0	
6	7	2	
8	3	3	

Sumatoria: 
10	18	1	
12	13	7	
14	9	10	

Multiplicacion:
9	81	0	
36	42	10	
48	18	21	
*/