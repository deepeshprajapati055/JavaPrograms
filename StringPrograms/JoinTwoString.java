package StringPrograms;

import java.util.Scanner;

public class JoinTwoString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        // str1 = str1.concat(" "+str2);
        // System.out.println("Concat: "+ str1);

        if(str1.length() == str2.length()){
            str1 = str1+" "+str2;
            System.out.println("Concat String is: "+str1);
        }else{
            System.out.println("String length are not equal.");
        }

        sc.close();
    }
}
