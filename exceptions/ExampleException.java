package exceptions;

import java.util.Scanner;

public class ExampleException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an 18+ age: ");
        int age = scan.nextInt();
        if (age < 18) {
            try {
                throw new AgeException("Age is less than 18.");
            } catch (AgeException e) {
                System.out.println(e.getMessage());
            } finally {
                scan.close();
            }
            
        }
    }
}
