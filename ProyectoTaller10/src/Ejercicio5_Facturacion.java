/***
 * Ejercicio 5
 * Crea un programa que gestione el inventario de una tienda, así como la emisión 
 * de facturas. Utiliza una matriz bidimensional para almacenar los productos disponibles 
 * en la tienda, con información como nombre, precio y cantidad. El programa debe permitir 
 * facturar un producto dado su código, y unidades deseadas. Adicional se debe agregar a la 
 * factura al _15% del IVA_, y si la compra superar los $100, se debe aplicar un descuento. 
_**Nota**_: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva. 
 * @author Matthew Flores
 */
import java.util.Scanner;
public class ejercicio5_Facturacion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] prod = {
            {"Camisetas", "5.0", "19"},
            {"Pantalones", "13.0", "12"},
            {"Chompas", "26.0", "13"},
            {"Medias", "6.0", "10"},
            {"Zapatos", "27.0", "10"}
        };
        final double iva = 0.15, desc = 0.10;
        int opcion, codigo, cantDes, stockDis;
        boolean continuar = true;
        double sTot, totIva, totDesc, preUni;
        while (continuar) {
            System.out.println("\n- Menu principal -");
            System.out.println("1. Ver inventario");
            System.out.println("2. Factura");
            System.out.println("3. Salir");
            System.out.print("Ingrese un numero: ");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n- Inventario -");
                    System.out.printf("%-10s %-20s %-10s %-10s%n", "Codigo", "Nombre", "Precio", "Cantidad");
                    for (int i = 0; i < prod.length; i++) {
                        System.out.printf("%-10d %-20s $%-10s %-10s%n", i, prod[i][0], prod[i][1], prod[i][2]);
                    }
                    break;
                case 2:
                    System.out.print("- Factura -");
                    System.out.print("\nIngrese el codigo del producto (0-" + (prod.length - 1) + "): ");
                    codigo = in.nextInt();

                    if (codigo < 0 || codigo >= prod.length) {
                        System.out.println("Codigo invalido");
                        break;
                    }
                    System.out.println("Ingrese la cantidad deseada: ");
                    cantDes = in.nextInt();
                    stockDis = Integer.parseInt(prod[codigo][2]);// Utilize esto para transformar de string a int
                    if (cantDes > stockDis) {
                        System.out.println("Esta cantidad del producto no esta disponible");
                    } else {
                        preUni = Double.parseDouble(prod[codigo][1]);// Utilize esto para convertir de string a double
                        sTot = cantDes * preUni;
                        totIva = sTot + (sTot * iva);
                        totDesc = totIva - (totIva * desc);
                        prod[codigo][2] = String.valueOf(stockDis - cantDes);// Utilize esto para convertir de int o double a string 
                        System.out.printf("Producto: %s%n", prod[codigo][0]);
                        System.out.printf("Cantidad: %d%n", cantDes);
                        System.out.printf("Subtotal: %.2f%n", sTot * iva);
                        System.out.printf("Iva (15%%): %.2f%n", totIva * desc);
                        System.out.printf("Descuento: %.2f%n", totDesc);
                        System.out.printf("Total a pagar: %.2f%n", totDesc);
                    }
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Saliendo...");
                    break;
                default: 
                    System.out.println("opcion invalida, intente otra vez");
            }
        }
    }
}
/***run:
- Menu principal -
1. Ver inventario
2. Factura
3. Salir
Ingrese un numero: 1

- Inventario -
Codigo     Nombre               Precio     Cantidad  
0          Camisetas            $5.0        19        
1          Pantalones           $13.0       12        
2          Chompas              $26.0       13        
3          Medias               $6.0        10        
4          Zapatos              $27.0       10        

- Menu principal -
1. Ver inventario
2. Factura
3. Salir
Ingrese un numero: 2
- Factura -
Ingrese el codigo del producto (0-4): 1
Ingrese la cantidad deseada: 
3
Producto: Pantalones
Cantidad: 3
Subtotal: 5,85
Iva (15%): 4,49
Descuento: 40,37
Total a pagar: 40,37

- Menu principal -
1. Ver inventario
2. Factura
3. Salir
Ingrese un numero: 3
Saliendo...
 */

