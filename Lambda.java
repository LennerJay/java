public class Lambda {
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();
        b.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();

      
    }
}

class A extends  Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}
class B  extends  Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}


