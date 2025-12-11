package threads;

public class YieldTask implements Runnable {
    private String str;

    YieldTask(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(str + " : " + i);
            Thread.yield(); // gives other threads a chance to run
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new YieldTask("A"));
        Thread t2 = new Thread(new YieldTask("B"));

        t1.start();
        t2.start();

    }
}
