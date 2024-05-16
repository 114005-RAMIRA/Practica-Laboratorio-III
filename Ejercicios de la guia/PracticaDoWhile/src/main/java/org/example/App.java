package org.example;
import java.util.Scanner;


/*
7--
Desarrollar un programa que permita ingresar la antigüedad los autos de una
concesionaria de usados. Finalizar la carga cuando se ingrese 0. Por cada
auto ingresado mostrar por pantalla un mensaje adecuado con el siguiente
criterio: si el auto tiene entre 1 y 5 años mostrar el texto “NUEVO”, si tiene

    entre 6 y 10 mostrar “POCO USO”, si tiene entre 11 y 20 “MUCHO USO” y si
    tiene más de 20 “MUY ANTIGUO”.
    Luego de finalizada la carga calcular y mostrar los siguientes resultados:
    • Cantidad total de autos.
    • Cantidad de autos con poco uso.
    • Promedio de antigüedad de los autos que no sean muy antiguos.
*/
public class App
{
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        int antiguedad;
        int cantidadAutos = 0;
        int cantPocoUso = 0;
        int totalAntigNoMuyAntiguos =0;
        int cantNoMuyAntiguos = 0;
        double promNoMuyAntiguos;

        do {
            System.out.println("Ingrese la antiguedad de Auto");
            antiguedad = scan.nextInt();
            if (antiguedad != 0) {
                cantidadAutos++; // Incrementar la cantidad de autos solo si la antigüedad no es 0
            }
            if (antiguedad >= 1 && antiguedad <= 5) {
                System.out.println("El auto es NUEVO!");
                totalAntigNoMuyAntiguos += antiguedad;
                cantNoMuyAntiguos++; // Incrementar el contador de autos que no son muy antiguos
            }
            else if (antiguedad >= 6 && antiguedad <= 10) {
                System.out.println("El auto tiene POCO USO!");
                cantPocoUso++;
                totalAntigNoMuyAntiguos += antiguedad;
                cantNoMuyAntiguos++; // Incrementar el contador de autos que no son muy antiguos
            }
            else if (antiguedad >= 11 && antiguedad <= 20) {
                System.out.println("El auto tiene MUCHO USO!");
                totalAntigNoMuyAntiguos += antiguedad;
                cantNoMuyAntiguos++; // Incrementar el contador de autos que no son muy antiguos
            }
            else if (antiguedad > 20) {
                System.out.println("El tiene MUCHO USO!");
            }

        }
        while (antiguedad != 0);

        System.out.println("La cantidad total de autos es de "+cantidadAutos+" Autos");
        System.out.println("La cantidad de autos con poco uso es de "+cantPocoUso+" Autos");

        // Verificar si hay autos que no son muy antiguos antes de calcular el promedio
        if (cantNoMuyAntiguos != 0) {
            promNoMuyAntiguos = (double) totalAntigNoMuyAntiguos / cantNoMuyAntiguos; // Calcular el promedio con la división adecuada
            long promedioRedondeado = Math.round(promNoMuyAntiguos); // Redondear el promedio al entero más cercano
            System.out.println("El promedio de antigüedad de los autos que no son muy antiguos es de "+ promedioRedondeado +" años");
        } else {
            System.out.println("No hay autos que no sean muy antiguos para calcular el promedio.");
        }
    }
}
