package ArrayPrograms;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element in array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        System.out.print("[");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        System.out.println("\nEnter element location: ");
        int loc = sc.nextInt();
        for(int i=loc; i<n-1; i++){
            arr[i]=arr[i+1];
        }
        n--;

        System.out.println("After Deleting element the array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
