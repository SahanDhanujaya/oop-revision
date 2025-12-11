package newExceptions;

public class Main {

    public static void operation() throws ArithmeticException {
        int x = 10;
        System.out.println("Come to the top of exception");
        int result = x / 0; // ArithmeticException // breaked
        System.out.println("Come to the bottom of exception");
        System.out.println(result);
    }

    public static void main(String[] args) {
        try {
            operation();
        } catch (ArithmeticException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            System.out.println("finally block executed.");
        }
        System.out.println("End of program."); // not printed
    }
}
