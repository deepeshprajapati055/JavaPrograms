package StringPrograms.StringBuffer;

public class CreationAppend{
    public static void main(String[] args){
        StringBuffer bf = new StringBuffer("10 20 30 40 50");
        //append at the end
        // bf.append("Prajapati"); 

        //insert at any index number.
        // bf.insert(bf.length(), "Prajapati"); 

        //Replace value - start at any index, end at any index.
        // bf.replace(0, bf.length()-1, "Rahul Prajapati"); 

        //Removing character in a range.
        //bf.delete(0, 8);   
        
        //Reverse the string.
        // bf.reverse();.

        //Truncate or extend the string.
        // bf.setLength(7);.

        //Get character at position.
        // char ch = bf.charAt(6);
        // System.out.println(ch);

        //find index of substring.
        // int index = bf.indexOf("Prajapati");
        // System.out.println("-"+index);.

        //capacity(get or ensure capacity)
        // int cap = bf.capacity();     //default - 16
        // System.out.println(cap);
        // bf.ensureCapacity(20);

        bf.toString();
        
        System.out.println(bf);
    }
}