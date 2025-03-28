package Java8Features.Lambda;

interface MyInterface{
    void show(String show);
}
public class LambdaProgram{
    public static void main(String[] args){
        // MyInterface obj = () -> System.out.println("Hello, Java 8!");
        // obj.show();

        MyInterface obj1 = (name) -> System.out.println("Hello, "+name);
        obj1.show("Deepesh Prajapati");
    }
}