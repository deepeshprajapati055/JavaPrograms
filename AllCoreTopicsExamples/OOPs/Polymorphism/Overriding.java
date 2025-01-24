package AllCoreTopicsExamples.OOPs.Polymorphism;
/*
 * Parent class defined method is by default available to the child if child class is not satisfied parent class method
 * then child is responsible to redefined that method according to there need. this process is noting but overriding.
 * 
 * parent class defined method is known as overridden method and child class defined method is known as overriding method.
 * 
 * Overriding is also know as runtime polymorphism or dynamic polymorphism or late binding.
 * 
 * Method resolution is always takes care by jvm based on runtime object.
 */
class Parent{
    public void methodOne(){
        System.out.println("I am your parent");
    }
}
class Child extends Parent{
    public void methodOne(){
        System.out.println("I am your child");
    }
}
public class Overriding {
    public static void main(String[] args){
        Parent p = new Parent();
        p.methodOne();      //I am your parent.

        Child c = new Child();
        c.methodOne();      //I am your child.

        Parent p1 = new Child();
        p1.methodOne();      //I am your child.
    }
}
