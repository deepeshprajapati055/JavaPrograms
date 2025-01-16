package ArrayPrograms;
import java.util.Scanner;
public class Search {
    public static void main(String[] args){
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
        System.out.print("\nEnter element you want to search: ");
        int elementSearch = sc.nextInt();
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == elementSearch){
                flag = true;
                System.out.println("Element found at "+i+" index");
            }
        }
        if(!flag){
            System.out.println("Element not found at any index.");
        }
        sc.close();
    }
}
