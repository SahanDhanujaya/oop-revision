package newExceptions;
import java.util.Scanner;

class NestedCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int index = scan.nextInt();
            int arr[] = { 10, 20, 30, 40, 50 };
            
            if (index < 0) {
                throw new FormValidate("Index can't be less than 0");
            } else if ( index > arr.length-1) {
                throw new FormValidate("Index can't be greater than array length");
            }

            System.out.println(arr[index]); // ArrayIndexOutOfBoundsException
            for (int num : arr) {
                num = num / index; // ArithmeticException
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Index out of bounds.");
        } catch (ArithmeticException e) {
            throw new RuntimeException("Cannot divide by zero.");
        } catch (FormValidate e) {
            System.out.println(e.getMessage());
        } finally {
            scan.close();
        }
    }
}