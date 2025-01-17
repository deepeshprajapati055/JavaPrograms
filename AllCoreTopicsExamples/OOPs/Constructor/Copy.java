package AllCoreTopicsExamples.OOPs.Constructor;

class Copy1{    
    int a; String b;        //instance variable of a as integer b as string.
    Copy1()                 //default constructor.
    {        
        System.out.println("This is original constructor.");    
        a = 14; b = "Deepesh";  //initializing the object - means putting these values into instance variable.
        System.out.print(a+" "+b+"\n"); //show the result
    }
    Copy1(Copy1 ref){       //This constructor is for copying the values of the constructor - again default constructor same as class name and, you must make a reference variable of class type.
        System.out.println("This is copy constructor.");
        a=ref.a;    //copy the content of one constructor and put into a variable.
        b=ref.b;    //copy the content of second constructor and put into b variable.
        System.out.println(a+" "+b);    //show the result.
    }
}
public class Copy {
    public static void main(String[] args){
        //create object one as r
        Copy1 r = new Copy1(); 
        //create object two as r2 and copy all the value of r into r2.
        Copy1 r2 = new Copy1(r);        
    }
}
