import java.util.Scanner;
public class BinaryAddition {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Binary Number: ");
        String n1 = sc.nextLine();
        System.out.println("Input Second Binary Number: ");
        String n2 = sc.nextLine();

        String sum = n1+n2;
        int decimal = Integer.parseInt(sum);
        String binaryNumber = Integer.toBinaryString(decimal);
        System.out.println("Addition of two binary number is: "+binaryNumber);
        sc.close();
    }
}
