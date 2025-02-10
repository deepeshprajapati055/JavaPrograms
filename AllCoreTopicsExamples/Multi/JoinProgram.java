package AllCoreTopicsExamples.Multi;
class A extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i=1; i<=3; i+=1){
            System.out.println(name);
        }
    }
}
public class JoinProgram {
    public static void main(String[] args){
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread-One");
        t2.setName("Thread-Two");
        t3.setName("Thread-Three");

        t3.start();
        try{
            t3.join();
        }catch(InterruptedException e){
            System.out.println("Thread is interrupted");
        }
        t1.start();
        t2.start();

        String name = Thread.currentThread().getName();
        for(int i=1; i<=3; i++){
            System.out.println(name);
        }
    }
}
