/**
 * Day 3:
 * Challenge: Given an array arr[] of non-negative integers and an integer sum,
 * find a subarray that adds to a given sum.
 * There may be more than one subarray with sum as the given sum,
 * print first such subarray.
 */
package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class SubarraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum");
        int targetSum = sc.nextInt();

        subarray(arr, n, targetSum);
    }

    private static void subarray(int[] arr, int n, int targetSum) {
        int currentSum = arr[0];
        int start = 0;

        ArrayList<Integer> subarray = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            while (currentSum > targetSum && start < i - 1) {
                currentSum = currentSum - arr[start];
                start++;
            }

            if (currentSum == targetSum) {
                System.out.print("Subarray with target sum " + targetSum + " found: ");
                for (int j = start; j < i; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
                return;
            }

            if (i < n) {
                currentSum = currentSum + arr[i];
            }
        }

        System.out.println("No subarray found");
    }
}




/*
 Output:
 	Enter size of array
	5
	Enter elements of array
	1 2 3 4 5
	Enter the target sum
	15
	Subarray with target sum 15 found: 1 2 3 4 5 

*/