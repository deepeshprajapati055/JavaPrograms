package AllCoreTopicsExamples.OOPs.Constructor;

public class Private {
    //instance variable a, b, c
    int a; double b; String c;
    //private constructor for security purpose
    //No other class can make object except this class 
    Private(){
        a=14; b=31.14; c="Deepesh Prajapati";
    }
    //method to show all the value which we initialized in the private constructor.
    void show(){
        System.out.print("\n"+a+"-"+b+"-"+c);
    }
    // public static void main(String[] args){
    //     Private p = new Private();
    //     p.show();
    // }
}

//todo - If we are trying to make object of private constructor in other class then it will show error
//todo -  Private() has private access in Private 
//todo -          Private() p = new Private();
//todo - 1error 

//todo - If we want to access private constructor data then make a static method. because
//todo - It will call without creating object.
//todo - It will call directly by its class name.


//todo -(***) if we define constructor as private then other class will restricted to created object of private constructor.