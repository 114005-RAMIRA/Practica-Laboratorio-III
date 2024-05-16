package org.example;
import java.util.Scanner;
import java.util.HashMap;

/**
 Hacer un programa que ingrese los datos de una factura en la cual haya tres
 artículos vendidos.
 De cada artículo ingresar el precio unitario y la cantidad.
 Finalmente imprimir el total de la factura

----------------------------------------------------------------------------------------------------
 Cuando trabajas con entrada de usuario utilizando métodos como nextDouble() y nextInt() en Scanner,
 es importante tener en cuenta que estos métodos no consumen la nueva línea (\n) después de leer el número.
 Esto puede causar problemas cuando se combina con nextLine() para leer cadenas de texto después de leer números.
 * */
public class App {
    public static void main(String[] args) {
        // Crear un Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un HashMap para almacenar los datos de la factura (artículo, precio unitario * cantidad)
        HashMap<String, Double> factura = new HashMap<>();

        // Solicitar y almacenar los datos de los tres artículos
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese el nombre del artículo " + i + ":");
            String articulo = scanner.nextLine();

            System.out.println("Ingrese el precio unitario del artículo " + i + ":");
            double precioUnitario = scanner.nextDouble();

            System.out.println("Ingrese la cantidad del artículo " + i + ":");
            int cantidad = scanner.nextInt();

            // Calcular el precio total del artículo y almacenarlo en el HashMap
            double precioTotal = precioUnitario * cantidad;
            factura.put(articulo, precioTotal); //La función put se utiliza para agregar o actualizar un par clave-valor en un HashMap en Java.

            // Limpiar el buffer del Scanner después de leer los datos numéricos
            scanner.nextLine();
        }

        // Calcular el total de la factura sumando todos los precios de los artículos
        double totalFactura = 0;
        for (double precio : factura.values()) { //bucle for-each que itera sobre los valores almacenados en el HashMap llamado "factura".
            totalFactura += precio;
        }

        // Imprimir el total de la factura
        System.out.println("El total de la factura es: " + totalFactura);

        // Cerrar el Scanner
        scanner.close();
    }
}
