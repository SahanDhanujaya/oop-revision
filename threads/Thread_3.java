package threads;

public class Thread_3 implements Runnable{
    private int start, end;

    public Thread_3(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread_3(1, 3));
        Thread t2 = new Thread(new Thread_3(4, 6));
        Thread t3 = new Thread(new Thread_3(7, 9));

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
    }
    
}
