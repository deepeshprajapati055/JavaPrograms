package StringPrograms;

import java.util.Scanner;

public class WhiteSpace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine(); 
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i)!=' ') &&str.charAt(i)!='\t'){
                newStr = newStr+str.charAt(i);
            }
        }
        System.out.println(newStr);

        sc.close();
    }
}
