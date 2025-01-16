import java.util.Scanner;

public class FirstNaturalNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("First "+n+" natural numbers are: ");
        System.out.print("[ ");
        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
        System.out.print("]");

        sc.close();
    }
}
