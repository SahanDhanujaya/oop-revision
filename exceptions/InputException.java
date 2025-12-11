package exceptions;

import java.util.Scanner;

public class InputException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter numbers : ");
            String num = scan.nextLine();
            if (!num.matches("^[0-9]+$")) {
                throw new NumberException("Input is not a number.");
            }
        } catch (NumberException e) {
            System.out.println(e.getMessage());
        } finally {
            scan.close();
        }

    }
}
