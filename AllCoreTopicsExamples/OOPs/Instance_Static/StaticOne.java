package AllCoreTopicsExamples.OOPs.Instance_Static;

public class StaticOne {
    //todo - Example one.
    // static{
    //     System.out.println("Hello Deepesh from static method.");
    // }

    // public static void main(String[] args){
         //main method is important to execute static block otherwise we will get CT error.
    // }


    public static void main(String[] args){
        StaticOne sc = new StaticOne();
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
