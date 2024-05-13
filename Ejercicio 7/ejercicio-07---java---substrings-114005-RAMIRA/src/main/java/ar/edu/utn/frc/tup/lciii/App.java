package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Sub-Strings!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto:");
        String s = in.nextLine();
        System.out.println("Ingrese el índice de inicio:");
        int start = in.nextInt();
        System.out.println("Ingrese el índice final:");
        int end = in.nextInt();


        if (end > s.length()) {
            System.out.println("El índice final excede la longitud de la cadena.");
            return;
        }

        String recorte = s.substring(start, end);

        System.out.println("Resultado: " + recorte);
        in.close();
    }
}
