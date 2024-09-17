package AdvJava;

public class SafeThread {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        

        Runnable ojb1 = ()-> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
      
            }
        };
        Runnable ojb2 = ()-> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };
        Thread t1 = new Thread(ojb1);
        Thread t2 = new Thread(ojb2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}

class Counter {
    int count;
    // "synchronized" to make sure only one is being run 
    //  this is for using threads
    public synchronized  void increment(){
        count++;
    }
}