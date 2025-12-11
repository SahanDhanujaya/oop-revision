import java.util.Scanner;

public class ControllAccess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Username: ");
        String username = scan.nextLine();

        if (username.equals(String.valueOf(Users.ADMIN).toLowerCase())) {
            System.out.println("Access Granted.");
        } else if (username.equals(String.valueOf(Users.GUEST).toLowerCase())) {
            System.out.println("Access to website.");
        } else {
            System.out.println("Access Denied.");
        }
        scan.close();
    }
}
