package threads;

class FastThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("FastThread is running: " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }  
}

class SlowThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("SlowThread is running: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Task_2 {
    public static void main(String[] args) {
        new Thread(new FastThread()).start();
        new Thread(new SlowThread()).start();
    }
}
