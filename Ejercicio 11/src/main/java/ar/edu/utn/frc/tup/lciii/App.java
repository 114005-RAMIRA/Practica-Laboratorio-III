package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        // Sum the lengths of strings a and b
        int sumLength = a.length() + b.length();
        System.out.println(sumLength);

        // Determine if a is lexicographically greater than b
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Capitalize the first letter in both a and b
        String capitalizedA = capitalizeFirstLetter(a);
        String capitalizedB = capitalizeFirstLetter(b);
        System.out.println(capitalizedA + " " + capitalizedB);
    }

    // Method to capitalize the first letter of a string
    static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}