package threads;

public class Yield extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Yield is running: " + i);
            Thread.yield();
        }
    }
    public static void main(String[] args) {
        new Thread(new Yield()).start();
        new Thread(new Yield()).start();
    }
}
