package AllCoreTopicsExamples;
public class StaticOne {
    //todo - Example one.
    // static{
    //     System.out.println("Hello Deepesh from static method.");
    // }

    // public static void main(String[] args){
         //main method is important to execute static block otherwise we will get CT error.
    // }


    public static void main(String[] args){
        //now only static block will call, if we uncomment line no 15 then instance block and constructor will call.
        
        // StaticOne obj = new StaticOne();    
        
    }
    // Third - Constructor is calling.
    StaticOne(){
        System.out.println("1. Constructor calling.");
    }
    // Second - Instance block calling.
    {
        System.out.println("2. Instance block calling.");
    }
    // First - Static block is calling 
    static{
        System.out.println("3. Static block calling.");
    }
}
