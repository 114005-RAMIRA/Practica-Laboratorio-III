package org.example;
import java.util.Scanner;

/*
9--
Ingresar un número y validar que sea positivo. Si no lo es continuar
solicitándolo al usuario hasta que ingrese un número correcto.
*/
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double numero;
        do{
            System.out.println( "Ingrese un numero positivo:" );
            numero = scan.nextDouble();
        }
        while(numero<0);
        System.out.println( "Se ingreso un numero positivo: "+numero);


        System.out.println( "Hello World!" );
    }
}
