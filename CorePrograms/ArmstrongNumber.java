import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt(), rem, res=0, temp=n;

        while(n!=0){
            rem = n%10;
            res = res+(rem*rem*rem);
            n = n/10;
        }
        
        if(temp == res){
            System.out.println(temp+" Number is armstrong "+res);
        }else{
            System.out.println(temp+" Number is not armstrong "+res);
        }
        sc.close();
    }
}
