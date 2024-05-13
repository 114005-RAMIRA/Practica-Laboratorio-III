package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String expression = scanner.nextLine(); // Lee la siguiente línea de la entrada
            System.out.println(isBalanced(expression)); // Verifica si la expresión está balanceada y la imprime
        }
        scanner.close(); // Cierra el Scanner
    }

    // Método para verificar si una cadena de paréntesis está balanceada
    static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>(); // Creamos una pila para almacenar paréntesis de apertura

        // Iteramos sobre cada carácter en la expresión
        for (char c : expression.toCharArray()) { //expression.toCharArray() convierte la cadena expression en un array de caracteres en Java.
            //ejecutará el cuerpo del bucle una vez por cada carácter en la cadena expression, y en cada iteración, el carácter actual se
            // almacenará en la variable c para su posterior procesamiento dentro del cuerpo del bucle.
            // Si c es un paréntesis de apertura, lo agregamos a la pila
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c); //agrega el carácter c a la parte superior de la pila stack
            }
            // Si c es un paréntesis de cierre
            else if (c == ')' || c == ']' || c == '}') {
                // Si la pila está vacía, no hay un paréntesis de apertura correspondiente, por lo que la expresión está desbalanceada
                if (stack.isEmpty()) {
                    return false;
                }
                // Extraemos el elemento superior de la pila
                char top = stack.pop();
                // Verificamos si el elemento superior coincide con el paréntesis de cierre actual
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false; // Paréntesis no coincidentes, la expresión está desbalanceada
                }
            }
        }

        // Si la pila está vacía después de procesar todos los caracteres, la expresión está balanceada
        return stack.isEmpty();
    }
}
