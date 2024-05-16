package org.example;
import java.util.Scanner;

/**
 5--
 Ingresar la cantidad de horas trabajadas por un empleado y el sueldo que
 cobra por hora. Indique el total a cobrar teniendo en cuenta que si trabajó más
 de 180 horas las excedentes las cobra con un 50 % de aumento.

 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double total;

        System.out.println( "Ingrese la cantidad de horas trabajadas" );
        double horasTrabajadas = scan.nextDouble();
        scan.nextLine();

        System.out.println( "Ingrese el sueldo que cobra por hora" );
        double sueldoHora = scan.nextDouble();

        if (horasTrabajadas > 180) {
            double horasExcedentes = horasTrabajadas - 180; // Calcular horas excedentes
            double sueldoConAumento = sueldoHora * 1.5; // Aumentar el sueldo por hora en un 50%
            double horasConAumento = sueldoConAumento * horasExcedentes; // Aplicar el sueldo con aumento a las horas excedentes
            total = sueldoHora * 180 + horasConAumento; // Calcular el total a cobrar
        } else {
            total = sueldoHora * horasTrabajadas; // Calcular el total a cobrar sin horas excedentes
        }

        System.out.println( "El Total a cobrar es de: "+total );
    }
}
