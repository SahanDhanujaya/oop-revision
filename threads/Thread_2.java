package threads;

public class Thread_2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("MyThread_1 is running. " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        Thread t2 = new Thread(() -> {
            for (int i = 4; i <= 7; i++) {
                System.out.println("MyThread_2 is running. " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t3 = new Thread(() -> {
            for (int i = 8; i <= 10; i++) {
                System.out.println("MyThread_3 is running. " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t3.start();

        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
