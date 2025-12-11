package threads;

public class Classroom {
    synchronized void waitingStudent() {
        System.out.println("Waiting for teacher...");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Let's study!");
    }
    synchronized void commingTeacher() {
        System.out.println("Teacher is comming...");
        notifyAll();
    }

    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        new Thread(() -> classroom.waitingStudent()).start();
        new Thread(() -> classroom.waitingStudent()).start();
        new Thread(() -> classroom.waitingStudent()).start();
        new Thread(() -> classroom.commingTeacher()).start();
    }
}
