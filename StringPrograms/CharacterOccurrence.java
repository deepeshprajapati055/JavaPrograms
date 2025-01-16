package StringPrograms;

import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String is: "+str);
        System.out.println("Enter character which you want to search : ");
        char countChar = 'd';

        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == countChar){
                count++;
            }
        }

        System.out.println(countChar+" present in a string "+count+" time");

        sc.close();
    }
}
