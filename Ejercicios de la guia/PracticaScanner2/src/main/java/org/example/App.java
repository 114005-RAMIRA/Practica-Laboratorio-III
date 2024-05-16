package org.example;
import java.util.Scanner;

/**
 * Hacer un programa que ingrese el precio de un artículo a la venta y calcule el
 * precio con IVA.
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "Ingrese el precio neto del articulo, si el mismo contiene decimales ingresar con , (coma)");
        float precio = scan.nextFloat();

        float precioIva = (float) (precio * 1.21);

        System.out.println( "El precio del producto con IVA es de: "+precioIva );
    }
}
