// Find the missing number in an array of size N-1 containing numbers from 1 to N.
package ArrayPrograms.Important;

public class Missing {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,6};
        int n = 6;

        int totalSum = n*(n+1)/2;
        
        int arrSum = 0;
        for(int num : arr){
            arrSum += num;
        }

        int missing_number = totalSum - arrSum;

        System.out.println("Missing Number is: "+missing_number);
    }
}
