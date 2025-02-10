package AllCoreTopicsExamples.Multi;

// isAlive is a predefined method of a thread class through which we can verify weather a thread isAlive or Not.
// if thread is alive then it will true otherwise false.
// if we use isAlive method before the start method then it will print false but after the start it will print true.

class MyThread extends Thread {
    public void run(){
        System.out.println("isAlive method programs......");
    }
}

public class IsAliveProgram {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        System.out.println(t1.isAlive());
        
        t1.start();
        t2.start();

        System.out.println(t1.isAlive());
    }
}
