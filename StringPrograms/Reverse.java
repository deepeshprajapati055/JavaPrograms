package StringPrograms;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String rev = "";

        for(int i=str.length()-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }

        System.out.println("Reverse String is: "+rev);

        sc.close();
    }
}
