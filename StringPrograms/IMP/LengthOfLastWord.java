package StringPrograms.IMP;

import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int length = findLastWordLength(str);
        System.out.println("Length of the last word:"+length);
        sc.close();
    }
    public static int findLastWordLength(String str){
        int length=0;
        int i=str.length()-1;
        while(i>=0 && str.charAt(i)==' '){
            i--;
        }
        while (i>=0 && str.charAt(i)!=' ') {
            length++;
            i--;
        }
        return length;
    }
}
