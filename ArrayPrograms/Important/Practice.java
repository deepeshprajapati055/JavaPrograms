package ArrayPrograms.Important;


public class Practice {
    public static void main(String[] args){
        int arr[] = new int[]{1,2,3,4,5,6,7,8,10};
        int n = 10;

        int totalSum = n*(n+1)/2;
        int arrSum = 0;
        for(int num : arr){
            arrSum += num;
        }

        int missing_number = totalSum - arrSum;
        System.out.println("Missing number is: "+missing_number);
    }
}
