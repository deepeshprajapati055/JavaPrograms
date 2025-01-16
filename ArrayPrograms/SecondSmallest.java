package ArrayPrograms;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter element in array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array element's are: ");
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");

        SecondSmallest obj = new SecondSmallest();
        int result = obj.secondSmall(arr);
        System.out.println("\nSecond smallest element from an array is: "+result);

        sc.close();
    }
    public int secondSmall(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-2];
    }
}
