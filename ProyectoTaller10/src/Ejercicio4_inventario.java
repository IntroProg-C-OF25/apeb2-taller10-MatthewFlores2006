
/** *
 * Crea un programa que gestione el inventario de una tienda. Utiliza
 * una matriz bidimensional para almacenar los productos disponibles
 * en la tienda, con información como nombre, precio y cantidad. El
 * programa debe permitir agregar nuevos productos, actualizar existencias,
 * buscar productos y eliminarlos.
 * @author Matthew Flores
 */
import java.util.Scanner;

public class ejercicio4_inventario {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] inv = new String[100][3];
        double[] precios = new double[100];
        int[] cant = new int[100];
        int cont = 0, opcion;
        String nom, nomB, nomEl, nomAct;
        double precio;
        int cntd, nCntd;
        boolean encBus, elim, act;
        do {
            System.out.println("\n - Menú para gestionar inventario -");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar cantidad");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    if (cont < inv.length) {
                        System.out.print("Ingrese el nombre del producto: ");
                        nom = in.next();
                        System.out.print("Ingrese el precio del producto: ");
                        precio = in.nextDouble();
                        System.out.print("Ingrese la cantidad del producto: ");
                        cntd = in.nextInt();
                        inv[cont][0] = nom;
                        precios[cont] = precio;
                        cant[cont] = cntd;
                        cont++;
                        System.out.println("Producto agregado con exito.");
                    } else {
                        System.out.println("Inventario lleno");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto por actualizar: ");
                    nomAct = in.nextLine();
                    act = false;
                    for (int i = 0; i < cont; i++) {
                        if (inv[i][0].equalsIgnoreCase(nomAct)) {
                            System.out.print("Ingrese la nueva cantidad: ");
                            nCntd = in.nextInt();
                            cant[i] = nCntd;
                            System.out.println("Cantidad de " + nomAct + " actualizada");
                            act = true;
                            break;
                        }
                    }
                    if (!act) {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    nomB = in.next();
                    encBus = false;
                    for (int i = 0; i < cont; i++) {
                        if (inv[i][0].equalsIgnoreCase(nomB)) {
                            System.out.println("Producto: " + inv[i][0]);
                            System.out.println("Precio: " + precios[i]);
                            System.out.println("Cantidad disponible: " + cant[i]);
                            encBus = true;
                            break;
                        }
                    }
                    if (!encBus) {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    nomEl = in.next();
                    elim = false;
                    for (int i = 0; i < cont; i++) {
                        if (inv[i][0].equalsIgnoreCase(nomEl)) {
                            for (int j = 0; j < (cont - 1); j++) {
                                inv[j][0] = inv[j + 1][0];
                                precios[j] = precios[j + 1];
                                cant[j] = cant[j + 1];
                            }
                            cont--;
                            System.out.println("Producto " + nomEl + " eliminado");
                            elim = true;
                            break;
                        }
                    }
                    if (!elim) {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida, intente nuevamente.");
            }
        } while (opcion != 5);
    }
}
/**run:

 - Men� para gestionar inventario -
1. Agregar producto
2. Actualizar cantidad
3. Buscar producto
4. Eliminar producto
5. Salir
Seleccione una opcion: 1
Ingrese el nombre del producto: manzana
Ingrese el precio del producto: 2
Ingrese la cantidad del producto: 5
Producto agregado con exito.

 - Men� para gestionar inventario -
1. Agregar producto
2. Actualizar cantidad
3. Buscar producto
4. Eliminar producto
5. Salir
Seleccione una opcion: 2
Ingrese el nombre del producto por actualizar: Producto no encontrado

 - Men� para gestionar inventario -
1. Agregar producto
2. Actualizar cantidad
3. Buscar producto
4. Eliminar producto
5. Salir
Seleccione una opcion: 3
Ingrese el nombre del producto a buscar: manzana
Producto: manzana
Precio: 2.0
Cantidad disponible: 5

 - Men� para gestionar inventario -
1. Agregar producto
2. Actualizar cantidad
3. Buscar producto
4. Eliminar producto
5. Salir
Seleccione una opcion: 4
Ingrese el nombre del producto a eliminar: manzana
Producto manzana eliminado

 - Men� para gestionar inventario -
1. Agregar producto
2. Actualizar cantidad
3. Buscar producto
4. Eliminar producto
5. Salir
Seleccione una opcion: 5
Saliendo...
 */
