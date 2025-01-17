import java.util.Scanner;
public class Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt(), rem, rev=0, temp=n;

        while(n!=0){
            rem = n%10;
            rev = rev+(rem*rem*rem);
            n = n/10;
        }
        if(rev == temp){
            System.out.println(temp+" Number is armstrong "+rev);
        }else{
            System.out.println(temp+" Number is not armstrong "+rev);
        }

        sc.close();
    }
}
