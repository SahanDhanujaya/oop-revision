package thread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread");
        }
        MyThread_1 myThread_1 = new MyThread_1();
        myThread_1.run();
        
    }
}
