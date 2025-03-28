package StringPrograms;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a String: ");
        // String str = sc.nextLine();
        // char[] ch = str.toCharArray();
        
        // for(int i=0; i<ch.length; i++){
        //     int count = 0;
        //     int x = ch[i];
        //     if(ch[i] == (char)-1 || ch[i] == ' ')
        //         continue;
        //     for(int j=0; j<ch.length; j++){
        //         if(ch[j] == x){
        //             count++;
        //             ch[j] = (char) -1;
        //         }
        //     }
        //     System.out.println("Count of "+(char)x+" is: "+(count));
        // }
        // sc.close();



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++){
            int x = ch[i], count=0;
            if(ch[i] == (char)-1 || ch[i]==' '){
                continue;
            }
            for(int j=0; j<ch.length; j++){
                if(Character.toLowerCase(ch[j]) == x || Character.toUpperCase(ch[j])==x){
                    count++;
                    ch[j] = (char)-1;
                }
            }
            System.out.println("Count of "+(char)x+" - "+count);
        }
        sc.close();
    }
}
