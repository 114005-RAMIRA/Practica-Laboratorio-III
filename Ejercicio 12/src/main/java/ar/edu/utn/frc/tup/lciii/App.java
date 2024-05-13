package ar.edu.utn.frc.tup.lciii;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial list L and the number of queries Q
        int N = scanner.nextInt(); // Número de elementos en la lista inicial
        List<Integer> L = new ArrayList<>(); // Creamos una lista vacía para almacenar los elementos
        for (int i = 0; i < N; i++) {
            L.add(scanner.nextInt()); // Agregamos cada elemento de la lista inicial a la lista L
        }
        int Q = scanner.nextInt(); // Número de queries que vamos a realizar

        // Procesamos cada query
        for (int i = 0; i < Q; i++) {
            String queryType = scanner.next(); // Tipo de query: Insert o Delete
            if (queryType.equals("Insert")) { // Si la query es Insert
                int x = scanner.nextInt(); // Leemos el índice x
                int y = scanner.nextInt(); // Leemos el valor y
                insertElement(L, x, y); // Insertamos el valor y en la posición x de la lista L
            } else if (queryType.equals("Delete")) { // Si la query es Delete
                int x = scanner.nextInt(); // Leemos el índice x
                deleteElement(L, x); // Eliminamos el elemento en la posición x de la lista L
            }
        }

        // Imprimimos la lista L actualizada
        for (int num : L) {
            System.out.print(num + " ");
        }
    }

    // Método para insertar un elemento en la lista en un índice especificado
    private static void insertElement(List<Integer> L, int index, int value) {
        L.add(index, value); // Añade el elemento en la posición index de la lista L
    }

    // Método para eliminar un elemento de la lista en un índice especificado
    private static void deleteElement(List<Integer> L, int index) {
        L.remove(index); // Elimina el elemento en la posición index de la lista L
    }
}
