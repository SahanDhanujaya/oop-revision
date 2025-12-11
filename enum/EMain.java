import java.util.Scanner;

public class EMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number(1-7): ");
        int num = scan.nextInt();
        
        switch (num) {
            case 1 -> System.out.println(WeekDays.MONDAY);
            case 2 -> System.out.println(WeekDays.TUESDAY);
            case 3 -> System.out.println(WeekDays.WEDNESDAY);
            case 4 -> System.out.println(WeekDays.THURSDAY);
            case 5 -> System.out.println(WeekDays.FRIDAY);
            case 6 -> System.out.println(WeekDays.SATURDAY);
            case 7 -> System.out.println(WeekDays.SUNDAY);
            default -> System.out.println("Invalid input.");
        }
        scan.close();
    }
}
