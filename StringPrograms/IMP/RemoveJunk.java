package StringPrograms.IMP;
import java.util.Scanner;
public class RemoveJunk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        String newString = removeJunk(input);
        
        System.out.println("Input String: "+input);
        System.out.println("Output String: "+newString);

        sc.close();
    }
    public static String removeJunk(String str){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if((ch >='A' && ch <='Z')|| 
                (ch >='a' && ch <='z') || 
                (ch >='0' && ch <='9')){
                    
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
