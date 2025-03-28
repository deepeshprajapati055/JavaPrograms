package StringPrograms;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "   Hello   World!  This   is  Java.  ";
        char[] chars = str.toCharArray(); // Convert string to char array
        StringBuilder result = new StringBuilder();
        
        boolean spaceFound = false;

        // Loop through each character in the array
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];

            // Ignore leading spaces
            if (result.length() == 0 && currentChar == ' ') {
                continue;
            }

            // Handle multiple spaces
            if (currentChar == ' ') {
                if (!spaceFound) { // Add only one space
                    result.append(currentChar);
                }
                spaceFound = true;
            } else {
                result.append(currentChar);
                spaceFound = false;
            }
        }

        // Remove trailing space manually
        if (result.length() > 0 && result.charAt(result.length() - 1) == ' ') {
            result.setLength(result.length() - 1);
        }

        System.out.println("Original: \"" + str + "\"");
        System.out.println("Processed: \"" + result.toString() + "\"");
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
