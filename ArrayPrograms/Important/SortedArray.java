package ArrayPrograms.Important;
import java.util.Scanner;
public class SortedArray {
    public static void main(String args){
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

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nSorted element from an array in ascending order: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
