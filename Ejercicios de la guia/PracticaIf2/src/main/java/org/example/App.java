package org.example;
import java.util.Scanner;
/*
6--
Una empresa de alquiler de autos cobra $300 por día si no se superan los 200
km de uso diario. Por cada km extra hasta los 1000 km cobra $5 adicionales,
y a partir de los 1000 cobra $10 adicionales. Hacer un programa que solicite
la cantidad de km realizados por un cliente e indique el importe que se le debe
cobrar.
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        double adicional;
        double importeaPagar;
        double precioxDia = 300;

        // Solicitar la cantidad de kilómetros realizados al cliente
        System.out.println( "Ingrese la cantidad de km realizados" );
        double kmRealizados = scan.nextDouble();

        // Evaluar las diferentes condiciones para determinar el importe a pagar
        if (kmRealizados < 200) {
            // Si los kilómetros son menores a 200, el importe a pagar es el precio base por día
            importeaPagar = precioxDia;
        }
        else if (kmRealizados <= 1000) {
            // Si los kilómetros están entre 200 y 1000, se calcula el importe con un costo adicional de $5 por cada km extra
            double exceso = kmRealizados - 200;
            importeaPagar = precioxDia + exceso *  5;
        }
        else {
            // Si los kilómetros superan los 1000, se calcula el importe con un costo adicional de $10 por cada km extra sobre 1000
            double exceso = kmRealizados - 1000;
            importeaPagar = precioxDia + exceso *  10; // Se calcula el costo adicional hasta los primeros 1000 km y luego el costo adicional sobre los 1000 km
        }

        // Mostrar el importe a pagar al cliente
        System.out.println( "El importe a pagar es de: " + importeaPagar );
    }
}
