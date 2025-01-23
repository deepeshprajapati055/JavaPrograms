package PatternPrograms;
import java.util.Scanner;

public class InvertedPyramidStartPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();

        for(int i=row; i>=1; i--){
            for(int k=1; k<=row-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
