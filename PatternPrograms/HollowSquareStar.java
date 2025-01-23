package PatternPrograms;

import java.util.Scanner;

public class HollowSquareStar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of cols: ");
        int cols = sc.nextInt();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if(i==1||j==1||i==5||j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
