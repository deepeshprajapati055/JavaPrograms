package StringPrograms;

import java.util.Scanner;

public class RemoveExtraSpaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        

        sc.close();
    }
}





// import java.util.Scanner;

// public class RemoveExtraSpaces {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a string: ");
//         String str = sc.nextLine();
//         String newStr = "";
//         boolean isSpace = false;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if (ch != ' ' && ch != '\t') {
//                 newStr += ch;
//                 isSpace = true; // Next space can be added after this character
//             } else if (isSpace) {
//                 newStr += ' '; // Add only one space
//                 isSpace = false; // Avoid consecutive spaces
//             }
//         }

//         newStr = newStr.trim(); // Remove any trailing space added at the end
//         System.out.println(newStr);
//     }
// }
