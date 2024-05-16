package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear un Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Definir el tamaño del vector para almacenar los nombres y alturas
        int n = 2;

        // Declarar un vector para almacenar los nombres
        String[] nombres = new String[n];

        // Declarar un vector para almacenar las alturas
        double[] alturas = new double[n];

        // Solicitar y almacenar los nombres y alturas de las personas
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i+1) + ":");
            nombres[i] = scanner.nextLine();

            System.out.println("Ingrese la altura de la persona " + (i+1) + " en metros:");
            alturas[i] = scanner.nextDouble();

            // Limpiar el buffer del Scanner después de leer los datos numéricos
            scanner.nextLine();
        }

        // Determinar quién es la persona más alta
        String personaMasAlta = nombres[0];
        double alturaMasAlta = alturas[0];
        // Este bucle recorre el vector de alturas para comparar cada altura con la altura más alta encontrada hasta el momento.
        // Comienza desde i = 1 porque ya hemos inicializado personaMasAlta y alturaMasAlta con los valores en la posición 0 del vector,
        // por lo que no necesitamos compararlos en la primera iteración.
        // Si la altura en la posición actual (alturas[i]) es mayor que la altura más alta encontrada hasta el momento (alturaMasAlta),
        // actualizamos la altura más alta (alturaMasAlta) con la altura en la posición actual (alturas[i])
        // y actualizamos el nombre de la persona más alta (personaMasAlta) con el nombre en la misma posición del vector de nombres (nombres[i]).
        for (int i = 1; i < n; i++) {
            if (alturas[i] > alturaMasAlta) {
                alturaMasAlta = alturas[i];
                personaMasAlta = nombres[i];
            }
        }

        // Imprimir el nombre de la persona más alta
        System.out.println("La persona más alta es: " + personaMasAlta + " con una altura de " + alturaMasAlta + " metros.");

        // Cerrar el Scanner
        scanner.close();
    }
}
