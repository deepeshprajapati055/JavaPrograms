package AllCoreTopicsExamples.Multi;
import java.lang.Thread;

//Yield is a method of a thread class that allow us to run another thread which has same priority by pause its current thread.

class threadOne extends Thread{
    public void run(){
        String name1 = Thread.currentThread().getName();
        for(int i=1; i<=3; i++){
            System.out.println(name1 + " is running");
            Thread.yield();
        }

    }
}

class threadTwo extends Thread{
    public void run(){
        String name1 = Thread.currentThread().getName();
        for(int i=1; i<=3; i++){
            System.out.println(name1 +" is running");
        }
    }
}

public class YieldProgram {
    public static void main(String[] args){
        threadOne t1 = new threadOne();
        threadTwo t2 = new threadTwo();

        t1.setName("Deepesh");
        t2.setName("Rahul");

        t1.start();
        t2.start();
    }
}
