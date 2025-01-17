package AllCoreTopicsExamples.OOPs;

class Test{
    int a; String b;
    void show(){
        System.out.println("\n"+a+" "+b);
    }
}
public class Ex3 {
    public static void main(String[] args){
        Test ref = new Test();
        ref.show();
    }
}
