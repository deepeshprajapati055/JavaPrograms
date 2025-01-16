package StringPrograms;

import java.util.Scanner;

public class AlphabeticOrderAsc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string; ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length; i++){
            for(int j=i+1; j<ch.length; j++){
               if(ch[i] > ch[j]){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
               } 
            }  
        }

        System.out.println(new String(ch));


        sc.close();
    }
}
