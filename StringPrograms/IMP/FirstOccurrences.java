package StringPrograms.IMP;

import java.util.Scanner;

public class FirstOccurrences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String text = sc.nextLine();
        System.out.println("Enter pattern:");
        String pattern = sc.nextLine();

        int index = firstOccurrence(text, pattern);
        if(index != -1){
            System.out.println("First Occurrences of '"+pattern+"' is at index "+index);
        }else{
            System.out.println("SubString not found");
        }
        
        sc.close();
    }
    public static int firstOccurrence(String text, String pattern){
        int textLength = text.length();
        int patternLength = pattern.length();

        if(patternLength > textLength){
            return -1;
        }
        for(int i=0; i<=textLength-patternLength; i++){
            int j;
            for(j=0; j<patternLength; j++){
                if(text.charAt(i+j)!=pattern.charAt(j)){
                    break;                      //mismatch found.
                }
            }
            if(j==patternLength){
                return i;                       //Found full match.
            }
        }
        return -1;
    }
}
