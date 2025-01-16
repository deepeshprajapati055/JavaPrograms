import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();

        /*first = first + second;
        second = first - second;
        first = first - second;*/

        int temp = first;
        first = second;
        second = temp;
        
        System.out.println("First number will be: "+first);
        System.out.println("Second number will be: "+second);

        sc.close();
    }
}
