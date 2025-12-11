package threads;

public class Main {
    public static void main(String[] args) {
        // MyThread myThread = new MyThread();
        // myThread.setName("MyThread");
        // myThread.start();
        // myThread.setPriority(Thread.MAX_PRIORITY);

        // MyThread_1 myThread_1 = new MyThread_1();
        // myThread_1.run();

        // CountsDown countsDown = new CountsDown();
        // countsDown.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("MyThread_2 is running. " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                System.out.println("MyThread_3 is running. " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("MyThread_4 is running. " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }
}
