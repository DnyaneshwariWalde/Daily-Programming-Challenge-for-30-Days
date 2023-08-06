/*
 * Day 6:
 * Challenge:Given an unsorted array of N integers, 
 * find smallest and largest element in optimal way.
 */
package Day6;

import java.util.Scanner;

public class SmallestandLargest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int []arr = new int [n];
		System.out.println("Enter array element");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int min = findsmallestelement(arr);
		int max = findlargestelement(arr);
		
		System.out.println("Smallest Element in array:" + min);
		System.out.println("Largest Element in array: "+ max);
	}

	
	private static int findsmallestelement(int[] arr) {
		
		int min = arr[0];
		
		for(int i= 0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		
		return min;
	}
private static int findlargestelement(int[] arr) {
			int max = arr[0];
			
			for(int i= 0;i<arr.length;i++)
			{
				if(arr[i]>max)
				{
					max= arr[i];
				}
			}
		return max;
	}

}


/*Output:
 *	Enter array size
	5
	Enter array element
	5 2 9 1 7
	Smallest Element in array:1
	Largest Element in array: 9

*/

