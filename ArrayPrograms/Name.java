package ArrayPrograms;

import java.util.Scanner;

public class Name {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string array size: ");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enter element in array: ");
        for(int i=0; i<str.length; i++){
            str[i] = sc.next(); 
        }
        System.out.print("[ ");
        for(int i=0; i<str.length; i++){
            System.out.print(str[i]+", ");
        }
        System.out.print("]");
        
        sc.close();
    }
}
