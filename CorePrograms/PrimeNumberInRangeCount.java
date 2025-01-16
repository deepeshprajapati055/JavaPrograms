import java.util.Scanner;

public class PrimeNumberInRangeCount {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int count=0;
        for(int i=1; i<=n; i++)
        {
            boolean flag = false;
            for(int j=2; j<=i-1; j++)
            {
                if(i%j==0)
                {
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nCount number of primes in range: "+count);
        sc.close();        
    }
}
