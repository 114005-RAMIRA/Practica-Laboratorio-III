package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        // Check if the input string is a palindrome and print the result
        if (isPalindrome(a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    static boolean isPalindrome(String s) {
        // Convert the string to lowercase
        s = s.toLowerCase();
        // Remove white spaces
        s = s.replaceAll("\\s", "");
        // Initialize pointers for the start and end of the string
        int i = 0, j = s.length() - 1;
        // Iterate through the string from both ends
        while (i < j) {
            // If characters at the current positions are not equal, return false
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            // Move the pointers towards the center of the string
            i++;
            j--;
        }
        // If the loop completes without returning false, the string is a palindrome
        return true;
    }
}
