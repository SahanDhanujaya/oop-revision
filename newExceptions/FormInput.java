package newExceptions;

import java.util.Scanner;

class FormInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your name: ");
            String input = scanner.nextLine();
            if (input.trim().isEmpty() || input == null) {
                throw new InvalidException("Input is null.");
            }
            System.out.println(input);
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

    }
}