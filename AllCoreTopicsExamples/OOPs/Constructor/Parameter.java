package AllCoreTopicsExamples.OOPs.Constructor;

class Para{
    int x, y;
    Para(int a, int b){
        x = a; y = b;
    }
    Para(int a, String b){
        System.out.println(a+" "+b+"\n");
    }
    void Show(){
        System.out.print(x+" "+y+"\n");
    }
}
public class Parameter {
    public static void main(String[] args){
        // Para p1 = new Para(14, 100);
        // Para p2 = new Para(14, "Deepesh");  
        // p1.Show();
        // In this program will run successfully and print the result. 

        // Para p1 = new Para(14, 100);
        // p1.Show();
        // Para p2 = new Para(14, "Deepesh");
        // In this program will run successfully and print the result just because we print the values inside the constructor.
        
        // p1.Show();
        // Para p1 = new Para(14, 100);
        // Para p2 = new Para(14, "Deepesh");
        // In this program will not run because we are trying to get call the method before creating an object. that is not possible in java programming.
        
    }
}
