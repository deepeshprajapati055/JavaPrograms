package AllCoreTopicsExamples.Multi;

// Stop is a method of a thread class which is used to terminate a thread permanently.

class threadStopProgram extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i=1; i<=3; i++){
            System.out.println(name+" is running");
        }
    }
}
public class StopProgram {
    public static void main(String[] args){
        threadStopProgram t1 = new threadStopProgram();
        threadStopProgram t2 = new threadStopProgram();
        threadStopProgram t3 = new threadStopProgram();

        t1.setName("Thread-One");
        t2.setName("Thread-Two");
        t3.setName("Thread-Three");

        t1.start();
        t2.start();
        t3.start();

        // t2.stop();   // now t2 thread will not execute. It will terminate immediately.
    }
}
