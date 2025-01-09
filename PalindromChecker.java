// write a program to show if the given string is palindrome or not ..
//these are the steps for this question
// Initialize:
// Create an empty string reversed to store the reversed version of the input string.
// Reverse the String:
// Loop through the input string from the last character to the first.
// For each character, append it to the reversed string.
// Compare Strings:
// Compare the original string and the reversed string.
// If they are equal, the string is a palindrome.
// Otherwise, it is not a palindrome.
// Output:
// Print whether the input string is a palindrome or not.
import java.util.Scanner;

public class PalindromChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        // Reverse the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Check if the input is the same as the reversed string
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
