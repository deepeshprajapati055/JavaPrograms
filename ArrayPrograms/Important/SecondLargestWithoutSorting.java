//Find the second largest element in an array without sorting.
package ArrayPrograms.Important;

import java.util.Scanner;

public class SecondLargestWithoutSorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter element in an array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Array element in an array are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        // Initialize first and second largest
        int first = 0;
        int second = 0;

        // Find first and second largest
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == 0) {
            System.out.println("\nNo second largest element.");
        } else {
            System.out.println("\nSecond largest element: " + second);
        }

        sc.close();
    }
}