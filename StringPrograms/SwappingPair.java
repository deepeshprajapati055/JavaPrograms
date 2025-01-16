package StringPrograms;

import java.util.Scanner;

public class SwappingPair {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length-1; i+=2){
            char temp = ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = temp;
        }

        System.out.println(new String(ch));

        sc.close();
    }
}
