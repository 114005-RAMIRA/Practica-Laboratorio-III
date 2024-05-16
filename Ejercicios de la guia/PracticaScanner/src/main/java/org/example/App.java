package org.example;
import  java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    /*
    1--
    Declarar dos variables enteras y cargar sus valores por teclado.
    Informar su suma, diferencia, producto y cociente.
    * */
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in); //System.in es un objeto que representa la entrada estándar del sistema, es decir, la entrada del usuario desde la consola.

        System.out.println( "Ingresa el primer valor:" );
        int a = scan.nextInt();

        System.out.println( "Ingresa el segundo valor:" );
        int b = scan.nextInt();

        int suma = a+b;
        int diferencia = a-b;
        int producto = a*b;
        int cociente = a/b;


        System.out.println( "De los dos valores ingresados:\nSu suma: "+suma+"\nSu diferencia: "+diferencia+"\nSu producto: "+producto+"\nSu cociente: "+cociente );
    }
}
