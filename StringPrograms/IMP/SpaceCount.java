package StringPrograms.IMP;

import java.util.Scanner;

public class SpaceCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        int spaceCount = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                spaceCount++;
            }
        }
        System.out.println("Total available space in string are: "+spaceCount);

        sc.close();
    }
}
