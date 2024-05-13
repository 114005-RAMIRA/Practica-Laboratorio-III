package ar.edu.utn.frc.tup.lciii;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of entries in the phone book
        int n = scanner.nextInt(); // Lee el número de entradas en el directorio telefónico
        scanner.nextLine(); // Consumimos la nueva línea

        // Create a HashMap to store phone book entries
        Map<String, String> phoneBook = new HashMap<>(); // Creamos un HashMap para almacenar las entradas del directorio

        // Read phone book entries
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine(); // Lee el nombre de la persona
            String phoneNumber = scanner.nextLine(); // Lee el número de teléfono correspondiente
            phoneBook.put(name, phoneNumber); // Agrega la entrada al HashMap (nombre como clave, número de teléfono como valor)
        }

        // Read queries and print results
        while (scanner.hasNext()) {
            String query = scanner.nextLine(); // Lee la consulta (nombre de la persona)
            if (phoneBook.containsKey(query)) { // Verifica si el nombre está en el directorio telefónico
                System.out.println(query + "=" + phoneBook.get(query)); // Si se encuentra, imprime el nombre y el número de teléfono correspondiente
            } else {
                System.out.println("Not found"); // Si no se encuentra, imprime "Not found"
            }
        }
        scanner.close(); // Cierra el Scanner
    }
}

