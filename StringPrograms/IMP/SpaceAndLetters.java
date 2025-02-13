package StringPrograms.IMP;

import java.util.Scanner;

public class SpaceAndLetters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int spaceCount=0;
        int lettersCount=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                lettersCount++;
            }else{
                spaceCount++;
            }
        }
        
        System.out.println("Total Letters' - "+ lettersCount);
        System.out.println("Total Spaces' - "+spaceCount);

        sc.close();
    }
}
