package StringPrograms;

import java.util.Scanner;

public class InsertAnother {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String original = sc.nextLine();

        System.out.println("Enter String to be inserted: ");
        String toBeInserted = sc.nextLine();

        System.out.println("Enter Index Number: ");
        int index = sc.nextInt();

        String newString = new String();

        for(int i=0; i<original.length(); i++){
            newString = newString + original.charAt(i);
            if(i == index){
                newString = newString + toBeInserted;
            }
        }
        System.out.print("After inserting string is: "+newString);


        sc.close();
    }
}
