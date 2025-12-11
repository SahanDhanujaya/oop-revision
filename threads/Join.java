package threads;

public class Join {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("MyThread_1 is running. " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        // try {
        //     t1.join();
        // } catch(InterruptedException e) {
        //     e.printStackTrace();
        // }
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("MyThread_2 is running. " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();
    }
}