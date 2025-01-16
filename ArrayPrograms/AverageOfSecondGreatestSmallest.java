package ArrayPrograms;

public class AverageOfSecondGreatestSmallest {
    public static void main(String[] args){
        int[] x = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("Second Highest from an array is: "+secondHighest(x));
        System.out.println("Second Lowest from an array is: "+secondSmallest(x));
        float sum = secondHighest(x) + secondSmallest(x);
        float avg = sum/2;
        System.out.println("Average of Highest and Smallest value is: "+avg);
    }
    public static int secondHighest(int[] x){
        for(int i=0; i<x.length; i++){
            for(int j=i+1; j<x.length; j++){
                if(x[i] > x[j]){
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        return x[x.length-2];
    }
    public static int secondSmallest(int[] x){
        for(int i=0; i<x.length; i++){
            for(int j=i+1; j<x.length; j++){
                if(x[i] < x[j]){
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        return x[x.length-2];
    }
}
