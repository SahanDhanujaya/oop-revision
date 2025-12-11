package threads;
public class Sync {
    synchronized void producer() {
        System.out.println("producer is producing.");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("producer is resuming.");
    }
    synchronized void consumer() {
        System.out.println("consumer is consuming.");
        notify();
        System.out.println("consumer is resuming.");
    }
    public static void main(String[] args) {
        Sync sync =  new Sync();
        new Thread(()-> sync.producer()).start(); 
        new Thread(()-> sync.consumer()).start();
    }
}
