package threads;

public class Sync_task_1 {

    synchronized void loop_1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Loop_1 is running: " + i);
            if (i == 5) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    synchronized void loop_2() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Loop_2 is running: " + i);
            if (i == 5) {
                notify();
            }
        }
    }

    public static void main(String[] args) {
        Sync_task_1 sync_task_1 = new Sync_task_1();
        new Thread(() -> sync_task_1.loop_1()).start();
        new Thread(() -> sync_task_1.loop_2()).start();
    }
}
