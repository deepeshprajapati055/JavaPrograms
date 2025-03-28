package StringPrograms.IMP;

public class Palindrome{
    // public boolean isPalindrome(String str){
    //     int left=0;
    //     int right=str.length()-1;

    //     while(left<right){
    //         if(str.charAt(left) != str.charAt(right))
    //             return false;
    //         left++;
    //         right--;
    //     }

    //     return true;
    // }
    // public static void main(String[] args){
    //     String str = "madam";
    //     Palindrome p = new Palindrome();
    //     boolean result = p.isPalindrome(str);
    //     if(result == true){
    //         System.out.println("String is palindrome.");
    //     }else{
    //         System.out.println("String is not a palindrome.");
    //     }
    // }

    public static void main(String[] args){
        String str = "madam";
        
        int left = 0;
        int right = str.length()-1;
        boolean flag = true;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                flag = false;
                break;
            }
            left++;
            right--;
        }
        if(flag){
            System.out.println("String is a palindrome.");
        }else{
            System.out.println("String is not a palindrome.");
        }
    }
}