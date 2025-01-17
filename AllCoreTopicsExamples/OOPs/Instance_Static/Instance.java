package AllCoreTopicsExamples.OOPs.Instance_Static;

public class Instance {
    int a, b;
    static {
        System.out.println("Good Morning, Deepesh Prajapati");
    }
    void show(){
        System.out.println("Good Evening, Deepesh");
    }
    static void show1(){
        System.out.println("Good Night, Deepesh");
    }
    Instance(){
        a=50; b=60;
        System.out.println(a+" "+b);
    }
    {
        a=10; b=20;
        System.out.println(a+" "+b);
    }
    {
        a=30; b=40;
        System.out.println(a+" "+b);
    }

    public static void main(String[] args){
        // Instance a = new Instance();
        // a.show();
        // Instance.show1(); 
        
        Instance.show1();
        Instance a = new Instance();
        a.show();
       
    }
}

//*Output of the code */

// Good Morning, Deepesh Prajapati
// Good Night, Deepesh
// 10 20
// 30 40
// 50 60
// Good Evening, Deepesh