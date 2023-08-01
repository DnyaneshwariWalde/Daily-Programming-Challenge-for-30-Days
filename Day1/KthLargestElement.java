/*
 * Day 1:
 * Challenge: Find Kth largest element in a given array.
 */
package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of elements in array: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		
		System.out.println("Enter elements of array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the value of k :");
		int k = sc.nextInt();
		
		int kthlargest = kthlargestelement(arr,k);
		System.out.println("The kth (" + k + ")largest element is"+ kthlargest);
		

	}

	private static int kthlargestelement(int[] arr, int k) {
		Arrays.sort(arr);
		
		return arr[arr.length-k];
	}

}
