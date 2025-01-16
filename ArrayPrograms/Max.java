package ArrayPrograms;

import java.util.Scanner;

public class Max {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element in array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum from an array is: "+max);
        sc.close();
    }
}
