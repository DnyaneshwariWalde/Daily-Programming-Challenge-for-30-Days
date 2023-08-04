/*Day4:
 *Challenge:An array contains both positive and 
 *negative numbers in random order. Rearrange the array elements 
 *so that all negative numbers appear before all positive numbers.
 */
package Day4;

import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortarray(arr, n);

        System.out.println("Sorted array:");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
    }

    private static void sortarray(int[] arr, int n) {
        int negativeCount = 0;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] < 0) 
            {
                negativeCount++;
            }
        }

        int left = 0;
        int right = n - 1;

        while (left < right) 
        {
            if (arr[left] < 0) 
            {
                left++;
            } 
            else if (arr[right] >= 0) 
            {
                right--;
            } 
            else 
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}




/*
 * Output:
 * Enter total number of elements in array: 
	6
   Enter elements of array:
	10 -5 7 -3 0 -8
   Sorted array:
	-8 -5 -3 7 0 10 
*/
