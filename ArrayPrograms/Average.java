package ArrayPrograms;

import java.util.Scanner;

public class Average {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element in array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array element are: ");
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        float sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        float avg = sum/n;
        System.out.println("\nAverage of an array is: "+avg);
        sc.close();
    }
}
