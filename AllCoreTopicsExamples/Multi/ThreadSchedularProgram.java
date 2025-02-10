package AllCoreTopicsExamples.Multi;
import java.lang.Thread;

class A extends Thread{
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i=1; i<=3; i++){
            System.out.println(n);
        }
    }
}
public class ThreadSchedularProgram extends A{
    public static void main(String[] args){
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread-One");
        t2.setName("Thread-Two");
        t3.setName("Thread-Three");
        
        t1.start();
        t2.start();
        t3.start();

        String n = Thread.currentThread().getName();
        for(int i=1; i<=3; i++){
            System.out.println(n);
        }
    }

}

/*
 * Thread life cycle.
 * New state - In this state we will create any thread object.
 * Runnable state - In this state we will call start() method of thread class.
 * Running state - In this state thread will execute its run() method.
 * Waiting state - If we don't want to execute a particular thread then we will put that thread into waiting state. using t.join(), t.suspend(), t.sleep(), t.wait().
 * Dead state - If thread is executed successfully then it comes in dead state. also if we call t.stop() method then it comes in dead state.
 */
