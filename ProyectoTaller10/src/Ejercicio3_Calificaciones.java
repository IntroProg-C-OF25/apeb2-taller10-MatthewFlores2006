/***
 * Ejercicio 3
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al 
 * finalizar el periodo, la Dirección de la carrera de Computación a solicitado 
 * las siguientes estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN 
 * en función a los promedios por estudiante, dichos promedios se deben 
 * calcular (ponderar, ya que el docente ingresa todo sobre 10pts.) de 3 
 * calificaciones (ACD que representa el 35% de la nota, APE del 35%
 * y la nota del AA con un peso del 30%). En resumen, los requerimientos son los siguientes: 
 * - Registre los nombres de cada estudiante de dicho paralelo.
 * - Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts. 
 * - Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD -> 35%, APE ->35%, y el AA -> 30%.
 * - Obtenga el promedio del curso, del _paralelo C_. 
 * - Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso. 
 * - Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso. 
 * - Muestre el estudiante con su calificación, si es el del mayor promedio _(el más alto de la clase)_. 
 * - Muestre el estudiante con su calificación, si es el del menor promedio _(el más bajo de la clase)_. 
 * @author Matthew Flores
 */
public class ejercicio3_Calificaciones {
    public static void main(String[] args) {
        int totEst = 28, mayor = 0, menor = 0;
        double[] acd = new double[totEst];
        double[] ape = new double[totEst];
        double[] aa = new double[totEst];
        double[] prmds = new double[totEst];
        double sumProm = 0, promCur, mayorProm, menorProm;
        String[] nombres = new String[totEst];
        for (int i = 0; i < totEst; i++) {
            nombres[i] = "Estudiante " + (i + 1);
            acd[i] = (int) (Math.random() * 10);
            ape[i] = (int) (Math.random() * 10);
            aa[i] = (int) (Math.random() * 10);
            prmds[i] = (acd[i] * 0.35) + (ape[i] * 0.35) + (aa[i] * 0.30);
            sumProm += prmds[i];
        }
        promCur = sumProm / totEst;
        mayorProm = prmds[0];
        menorProm = prmds[0];
        for (int i = 0; i < totEst; i++) {
            if (prmds[i] > mayorProm) {
                mayorProm = prmds[i];
                mayor = i;
            }
        }
        for (int i = 0; i < totEst; i++) {
            if (prmds[i] < menorProm) {
                menorProm = prmds[i];
                menor = i;
            }
        }
        System.out.printf("Promedio del curso: %.2f%n ", promCur);
        System.out.println("\nEstudiantes con puntajes mayores al promedio: ");
        for (int i = 0; i < totEst; i++) {
            if (prmds[i] > promCur) {
                System.out.printf("%s: %.2f%n", nombres[i], prmds[i]);
            }
        }
        System.out.println("\nEstudiantes con puntajes menores al promedio:");
        for (int i = 0; i < totEst; i++) {
            if (prmds[i] < promCur) {
                System.out.printf("%s: %.2f%n", nombres[i], prmds[i]);
            }
        }
        System.out.printf("El estudiante con el mayor promedio es el %s con un promedio de %.2f%n", nombres[mayor], mayorProm);
        System.out.printf("El estudiante con el menor promedio es el %s con un promedio de %.2f%n", nombres[menor], menorProm);
    }
}
/***
 * run:
 * Promedio del curso: 4,23
 
 * Estudiantes con puntajes mayores al promedio: 
 * Estudiante 4: 6,25
 * Estudiante 6: 5,30
 * Estudiante 7: 5,50
 * Estudiante 9: 4,80
 * Estudiante 10: 4,85
 * Estudiante 12: 4,85
 * Estudiante 14: 6,65
 * Estudiante 15: 4,60
 * Estudiante 16: 6,05
 * Estudiante 17: 4,90
 * Estudiante 18: 4,95
 * Estudiante 19: 4,90
 * Estudiante 21: 5,15
 * Estudiante 22: 4,55
 * Estudiante 24: 5,75
 * Estudiante 26: 4,55

 * Estudiantes con puntajes menores al promedio:
 * Estudiante 1: 3,85
 * Estudiante 2: 2,95
 * Estudiante 3: 4,05
 * Estudiante 5: 2,80
 * Estudiante 8: 3,90
 * Estudiante 11: 2,10
 * Estudiante 13: 2,70
 * Estudiante 20: 2,60
 * Estudiante 23: 3,55
 * Estudiante 25: 1,85
 * Estudiante 27: 2,05
 * Estudiante 28: 2,55
 * El estudiante con el mayor promedio es el Estudiante 14 con un promedio de 6,65
 * El estudiante con el menor promedio es el Estudiante 25 con un promedio de 1,85
 */

