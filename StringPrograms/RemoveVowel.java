package StringPrograms;

public class RemoveVowel {
    // public static String removeVowels(String str){
    //     char[] chars = str.toCharArray();
    //     String newStr = "";
    //     for(int i=0; i<chars.length; i++){
    //         char ch = chars[i];
    //         if(ch!='a'&& ch!='e'&&ch!='i'&&ch!='o'&&ch!='u' && ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'){
    //             newStr += ch;
    //         }
    //     }
    //     return newStr;
    // }
    // public static void main(String[] args){
    //     String str = "Deepesh Prajapati";
    //     String result = removeVowels(str);
    //     System.out.println(result);
    // }

    public static void main(String[] args){
        String str = "Hello world";
        String newStr="";
        char[] chars = str.toCharArray();

        for(int i=0; i<chars.length; i++){
            char ch = chars[i];
            if(ch!='a'&& ch!='e'&&ch!='i'&&ch!='o'&&ch!='u' && ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'){
                newStr += ch;
            }
        }

        System.out.println(newStr);
    }

}
