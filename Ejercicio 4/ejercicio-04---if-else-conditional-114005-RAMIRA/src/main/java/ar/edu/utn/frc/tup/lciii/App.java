package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * if - else Conditional!
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

        if (n >= 1 && n <= 100) {
            if (n % 2 != 0) {
                System.out.println("Weird");
            } else {
                if (n <= 5) {
                    System.out.println("Not Weird");
                } else if (n <= 20) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not Weird");
                }
            }
        } else {
            System.out.println("n debe ser mayor o igual a 1 y menor o igual a 100");
        }




        scanner.close();
    }
}
