package AllCoreTopicsExamples.OOPs.Polymorphism;
/*
* Overloading - Two method is said to be overloaded if and only if both method having same and different argument type.
*    or
* A class can contain more than one method with same name different parameter type is know as overloading.
*
* Overloading is also known as early binding or static polymorphism or compile time polymorphism.
*
* Method resolution always takes care by compiler based on reference type object.
*
* In overloading runtime won't play any role.
*/
public class Overloading {
    
    public static int methodOne(int a){
        return a;
    }
    public static int methodTwo(int a, int b){
        return a+b;
    }
    public static void main(String[] args)
    {
        int a = methodOne(20);
        int b = methodTwo(20, 20);

        a = methodOne(10);
        b = methodTwo(20,30);

        System.out.println(a+" "+b);
    }
}
