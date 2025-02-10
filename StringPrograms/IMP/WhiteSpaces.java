package StringPrograms.IMP;
import java.util.Scanner;

public class WhiteSpaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String newString = removeWhiteSpaces(str);
        System.out.println("Original String is: "+str);
        System.out.println("New String is: "+newString);
        sc.close();
    }
    public static String removeWhiteSpaces(String str){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
