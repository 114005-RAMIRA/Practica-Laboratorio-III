package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Stdin & Stdout 2!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el String:");
        String a = scan.nextLine();

        System.out.println("Ingrese el double:");
        double b = scan.nextDouble();
        scan.nextLine();

        System.out.println("Ingrese el int:");
        int c = scan.nextInt();
        scan.nextLine();


        System.out.println("String: " + a);
        System.out.println("Double: " + b);
        System.out.println("Int: " + c);

        scan.close();
    }
}
