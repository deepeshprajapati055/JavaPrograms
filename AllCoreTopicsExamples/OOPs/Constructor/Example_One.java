package AllCoreTopicsExamples.OOPs.Constructor;

class Demo{
    int a = 10; String b = "Deepesh";
    void show(){
        System.out.println(a+" "+b);
    }
}
public class Example_One {
    public static void main(String[] args){
        Demo d = new Demo();
        d.show();
    }
}
