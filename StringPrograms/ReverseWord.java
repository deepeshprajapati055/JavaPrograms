package StringPrograms;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String[] str1 = str.split(" ");

        System.out.println("Original String is: ");
        System.out.print(str);
    
        System.out.println("\nReverse string word is: ");
        for(int i=str1.length-1; i>=0; i--){
            System.out.print(str1[i]+" ");
        }

        sc.close();
    }
}
