package Tricky;
// Possible ways when finally block will not executed.
public class exceptionOne {
    public static void main(String[] args){
        try{
            System.out.println("Inside try block;");
        }finally{
            notification();
            System.out.println("Inside finally block");
        }
    }
    public static void notification(){
        System.out.println("Notification sent");
    }
}
