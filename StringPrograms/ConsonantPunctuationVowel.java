package StringPrograms;

import java.util.Scanner;

public class ConsonantPunctuationVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        System.out.println("String is: "+str);
        
        int cCount=0, pCount=0, vCount=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vCount++;
            }else if(str.charAt(i)>='a' && str.charAt(i)<='z' && str.charAt(i)!=' '){
                cCount++;
            }else if(str.charAt(i)==':'||str.charAt(i)=='"'||str.charAt(i)==','||str.charAt(i)=='!'||str.charAt(i)=='?'||str.charAt(i)=='.'
            || str.charAt(i)=='-' || str.charAt(i)=='<' ||str.charAt(i)=='>'||str.charAt(i)==';'){
                pCount++;
            }
        }

        System.out.println("Total consonants present in a string : "+cCount);
        System.out.println("Total punctuations present in a string : "+pCount);
        System.out.println("Total vowels present in a string : "+vCount);
        System.out.println("Total length of the string is : "+str.length());
        sc.close();
    }
}
