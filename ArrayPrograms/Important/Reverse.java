//Reverse the elements of an array in-place.
package ArrayPrograms.Important;

import java.util.Scanner;

public class Reverse {
    //First approach
    /*public static void main(String args){
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
        
        System.out.print("\n Reverse element in an array are: ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }*/

    //------------------------------------------------------------------------

    //Second approach
    /*public static void main(String args){
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
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nReverse element form an array are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }*/
    
    //------------------------------------------------------------------------

    //Best Approach
    //Time complexity - O(n).
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

        int left = 0, right = n-1;
        
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.print("\nReverse element form an array are: ");
        for(int i: arr){
            System.out.print(i+" ");
        }

        sc.close();
    }
    
}
