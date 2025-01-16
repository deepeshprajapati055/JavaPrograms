import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt(), rem, rev=0, temp=n;
        while(n!=0)
        {
            rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        if(temp == rev){
            System.out.println(temp+" Number is palindrome " + rev);
        }else{
            System.out.println(temp+" Number is not palindrome " + rev);
        }
        sc.close();
    }
}
