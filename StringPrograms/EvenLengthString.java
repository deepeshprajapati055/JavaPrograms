package StringPrograms;

import java.util.Scanner;

public class EvenLengthString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        // String[] word = str.split(" ");
        // int[] len = new int[word.length];

        // for(int i=0; i<word.length; i++){
        //     len[i] = word[i].length();
        // }
        // for(int i=0; i<word.length; i++){
        //     if(len[i]%2==0){
        //         System.out.print(word[i]+" ");
        //     }
        // }

        for(String s : str.split(" ")){
            if(s.length()%2==0){
                System.out.print(s+" ");
            }
        }
        sc.close();
    }
}
