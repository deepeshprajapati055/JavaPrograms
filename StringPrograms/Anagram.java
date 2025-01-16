package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        char[] ch1 = str1.toCharArray();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();
        char[] ch2 = str2.toCharArray();

        if(ch1.length != ch2.length){
            System.out.println("It is not an anagram1.");
            System.exit(0);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        for(int i=0; i<ch1.length; i++){
            if(ch1[i] != ch2[i]){
                System.out.println("It is not an anagram2.");
                System.exit(0);
            }
        }

        System.out.println("It is an anagram.");
        sc.close();
    }
}
