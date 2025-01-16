package ArrayPrograms;

import java.util.Scanner;

public class Length {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // System.out.println("Enter element in array: ");
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        int length = 0;
        for(int i=0; i<=100000; i++){
            try{
                int j = arr[i];
                System.out.print(j+" ");
                length++;
            }catch(ArrayIndexOutOfBoundsException e){
                break;
            }
        }
        System.out.println("Length of the array is: "+length);

        sc.close();
    }
}
