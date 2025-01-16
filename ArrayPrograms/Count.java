package ArrayPrograms;
import java.util.Scanner;
public class Count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element in array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            int x = arr[i], count=0;
            if(arr[i] == -1)
                continue;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == x){
                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println("Count of "+x+" is: "+count);
        }
        sc.close();
    }
}