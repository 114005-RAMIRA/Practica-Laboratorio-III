package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Loops & Math 1!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // Write your code here


        if (n >= 2 && n<=20) {
            for(int i = 0; i<10;i++){

            }
        }
        else{
            System.out.print("El numero debe ser mayor o igual a 2 y menor o igual a 20");
        }

        scanner.close();
    }
}
