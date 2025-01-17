package AllCoreTopicsExamples.OOPs.Constructor;

class A{
    int a; String b;
    A(){
        a=14; b="Deepesh";
    } 
    void show(){
        System.out.println(a+" "+b);
    }
}
public class Ex2 {
    public static void main(String[] args){
        A ref = new A();
        ref.show();
    }
}
