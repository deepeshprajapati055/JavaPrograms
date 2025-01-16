package StringPrograms;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine(); 
        String[] word = str.split(" ");
        String revString = "";
        System.out.println("Reverse each character form string is: ");
        for(int i=0; i<word.length; i++){
            String words = word[i];
            String rev = "";
            for(int j=words.length()-1; j>=0; j--){
                rev = rev+words.charAt(j);
            }
            revString = revString + rev + " ";
        }
        System.out.println(revString);
        sc.close();
    }
}
