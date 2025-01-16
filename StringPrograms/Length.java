package StringPrograms;

import java.util.Scanner;

public class Length {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String is: "+str);
        int length=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=' '){
                length++;
            }
        }
        System.out.println("Total length of the string is: "+length);
        sc.close();

    }
}
