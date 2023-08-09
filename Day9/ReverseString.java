/*
 * Day 9:
 * Challenge:Reverse a string using recursion.
 */
package Day9;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to Reverse: ");
        String input = scanner.next();
        
        String reversed = reverse(input);
        System.out.println("Reversed String: " + reversed);
    }

    private static String reverse(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        } else {
            char first = str.charAt(0);
            String rest = str.substring(1);
            String reversed = reverse(rest);
            return reversed + first;
        }
    }
}
/*
 * Output:
 *  Enter a String to Reverse: 
	DECODE
	Reversed String: EDOCED
 */
