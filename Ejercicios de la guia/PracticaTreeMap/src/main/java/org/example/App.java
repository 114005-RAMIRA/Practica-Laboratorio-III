package org.example;
import java.util.Scanner;
import java.util.TreeMap;

/*
8--
Ingresar el tiempo en segundos que realizó el ganador de la clasificación de
una carrera de F1.
Luego ingresar los tiempos de los otros 9 corredores e informar cuántos disputarán la carrera.
Para que un corredor pueda participar su tiempo de clasificación no puede superar en 15 % al del ganador.
 */

/*
 *  Los tiempos se almacenan como claves en el TreeMap, lo que garantiza que estén ordenados de manera ascendente.
 *  Luego, recorre los tiempos de los corredores y verifica si cada corredor disputará la carrera comparando su tiempo con el 15%
 *  del tiempo del ganador. Si el tiempo del corredor no supera el 15% del tiempo del ganador, se incrementa el contador de corredores
 *  que disputarán la carrera. El bucle termina tan pronto como encuentra un corredor cuyo tiempo supera el 15% del tiempo del ganador,
 *  ya que los tiempos están ordenados en el TreeMap. Finalmente, se imprime la cantidad de corredores que disputarán la carrera.
 */
public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tiempo en segundos del ganador de la clasificación:");
        int tiempoGanador = scanner.nextInt();

        // Crear un TreeMap para almacenar los tiempos de los corredores
        TreeMap<Integer, Integer> tiemposCorredores = new TreeMap<>();

        // Ingresar los tiempos de los otros 9 corredores
        for (int i = 1; i <= 9; i++) {
            System.out.println("Ingrese el tiempo en segundos del corredor " + i + ":");
            int tiempoCorredor = scanner.nextInt();
            tiemposCorredores.put(tiempoCorredor, i); // Almacenar el tiempo del corredor en el TreeMap
        }

        int corredoresDisputaranCarrera = 0;

        // Iterar sobre los tiempos de los corredores para verificar quiénes disputarán la carrera
        for (int tiempoCorredor : tiemposCorredores.keySet()) { // keySet() Devuelve un conjunto de claves presentes en el mapa.
            // Calcular el 15% del tiempo del ganador
            double limiteSuperior = tiempoGanador * 1.15;
            // Si el tiempo del corredor es menor o igual al 15% del tiempo del ganador, entonces disputará la carrera
            if (tiempoCorredor <= limiteSuperior) {
                corredoresDisputaranCarrera++;
            } else {
                // Si el tiempo del corredor supera el 15% del tiempo del ganador, terminamos el bucle porque los tiempos están ordenados
                break;
            }
        }

        System.out.println("Cantidad de corredores que disputarán la carrera: " + corredoresDisputaranCarrera);

        scanner.close();
    }
}


