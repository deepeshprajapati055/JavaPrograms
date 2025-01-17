package AllCoreTopicsExamples.OOPs.Constructor;
//Whenever we have more than one constructor in out class then it is called as constructor overloading.
//All the constructor parameter should be different or more than the other one.

class Overload{
    int a; double b; String c;
    Overload(){
        a=14; b=31.14; c="Deepesh Prajapati";
    }
    Overload(int x){
        a = x;
    }
    Overload(int x, String y){
        a = x; c = y;
    }
}

public class ConstOverload {
    public static void main(String[] args){
        Overload o1 = new Overload();
        Overload o2 = new Overload(100);
        Overload o3 = new Overload(200, "Deepesh");
        System.out.println(o1.a+" "+o1.b+" "+o1.c);
        System.out.println(o2.a);
        System.out.println(o3.a+" "+o3.c);
    }
}


// Within a class we can't take private constructor or default constructor both simultaneously.
// because both are default constructor but the thing is just have access modifier 
// if we try to take both of them in one class it will show error - constructor is already defined in this class.

// if our constructor is private and we try to overload the private constructor - it is possible.

