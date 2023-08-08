/*
 * Day 8:
   Challenge:How do you check if two strings are anagrams of each other?
			 String 1: "listen"
			 String 2: "silent"
			 Expected Output: True
	An anagram of a string is another string that uses the same characters, 
	but the order of characters can be different
 */
package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings to check if they are anagrams of each other?");
		String str1 = sc.next();
		String str2 = sc.next();
		
		if(areAnagrams(str1, str2))
		{
			System.out.println("The given strings "+ str1 + " and " + str2 + " are anagrams of each other");

		}
		else
		{
			System.out.println("The given strings "+ str1 + " and " + str2 + " are not anagrams of each other");
		}

	}
	
	public static boolean areAnagrams(String str1,String str2){
		
		char [] charArr1 = str1.replace(" ","").toLowerCase().toCharArray();
		char [] charArr2 = str2.replace(" ", "").toLowerCase().toCharArray();
		
		if(str1.length()!=str2.length())
		{
			return false;
		}
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		
      return Arrays.equals(charArr1, charArr2);		
	}

}
/*
 * Output:
 * Enter two strings to check if they are anagrams of each other?
	Listen Silent
   The given strings Listen and Silent are anagrams of each other
   
 * */
