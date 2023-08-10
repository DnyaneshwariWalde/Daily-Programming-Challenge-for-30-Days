/*
 * Day 10:
 * Challenge:Given a string, find the first non-repeated character in it. 
 * If no such character exists, return a specific value (e.g., a special character or -1) 
 * to indicate that no non-repeated character is found.
 * Input: "programming"
 * Expected Output: 'p'
 * 
 */

package Day10;

import java.util.Scanner;

public class UniqueCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();

        char uniquechar = findfirstuniquechar(str);
        if (uniquechar != '\0') {
            System.out.println("First non-repeated character: " + uniquechar);
        } else {
            System.out.println("No non-repeated character found");
        }
    }

    private static char findfirstuniquechar(String str) {
        char[] charArr = str.replace(" ", "").toLowerCase().toCharArray();

        int n = charArr.length;
        boolean isRepeated;
        for (int i = 0; i < n; i++) {
            isRepeated = false;

            for (int j = 0; j < n; j++) {
                if (i != j && charArr[i] == charArr[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                return charArr[i];
            }
        }

        return '\0';
    }
}

/*
 * Output:
 * Enter the string: 
   programming
   First non-repeated character: p
 * 
*/
