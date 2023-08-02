/* Day 2:
 * Challenge: Given a sorted array arr[] and a number x, 
 * write a function that counts the occurrences of x in arr[]
 */
package Day2;

import java.util.Scanner;

public class Xoccurrences {

	public static void main(String[] args) {
		
		boolean flag = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of element in array");
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number x to count its occurance");
		int x = sc.nextInt();
		
        // Check if x is present in the array
		for (int i =0;i<n;i++)
		{
			if(x == arr[i])
			{
				flag = true;
				break;
			}
		}
		if(flag == true)
		{
			int xOccurrence = Xoccurrences(arr,x);
            System.out.println("Total Occurrences of x=" + x + " in the array: " + xOccurrence);
		}
		else
		{
			System.out.println("x = "+ x + " is not present in array i.e x = 0 . Please enter valid x value");
		}
		

	}

	private static int Xoccurrences(int[] arr, int x) {
		
		int count = 0;
		for(int i =0;i<arr.length;i++)
		{
			if(x == arr[i])
			{
				count++;
			}
		}
		
		return count;
	}

}
