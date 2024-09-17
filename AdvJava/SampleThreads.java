package AdvJava;

public class SampleThreads {
    
    public static void main(String[] args) {
      
        // A a = new A();
        // B b = new B();
        // a.start();
        // b.start();

        Runnable ojb1 = ()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi");
            }
        };
        Runnable ojb2 = ()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
            }
        };
        Thread t1 = new Thread(ojb1);
        Thread t2 = new Thread(ojb2);
        t1.start();
        t2.start();
    }
}


// class A extends Thread{
    // public void run(){
    //     for (int i = 0; i < 10; i++) {
    //         System.out.println("Hi");
    //     }
    // }
// }
// class B extends Thread{
//     public void run(){
//         for (int i = 0; i < 10; i++) {
//             System.out.println("Hello");
//         }
//     }
// }