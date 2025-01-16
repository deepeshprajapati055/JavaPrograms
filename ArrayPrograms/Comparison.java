package ArrayPrograms;

import java.util.Arrays;

public class Comparison{
    public static void main(String[] args){

        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,4,5};

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Both the arrays are equal.");
        }else{
            System.out.println("Both the arrays are not equal.");
        }
    }
}


// arr1 == arr2
// Array.equals(arr1, arr2)
// arr1.equals(arr2)