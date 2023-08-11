/*
 * Day 11:
 * Challenge:You are given a string S, the task is to reverse the string word by word.
 * Input - "i love programming"
 * Input - "programming love i"
 * 
 */
package Day11;

import java.util.Scanner;

public class ReverseWords {
	
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the string:");
    	String str = sc.nextLine();
    	
        String reversed = reversedWords(str);
        System.out.println("Reversed String: " + reversed);

    }

	private static String reversedWords(String str) {
		
		String []words = str.split(" ");
		
		if(words.length == 0)
		{
			return str;
		}
		else if(words.length==1)
		{
			return words[0];
		}
		else
		{
			    String firstWord = words[0];
	            String rest = str.substring(firstWord.length()).trim();
	            String reversed = reversedWords(rest);
	            return reversed + " " + firstWord;
		}
	}

}
/*
 * Output:
 * Enter the string:
 * i love programming
 * Reversed String: programming love i
*/
