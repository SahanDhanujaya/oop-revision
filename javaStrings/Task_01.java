import java.util.Arrays;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {

/**
 
    📌 Question:

Write a Java program that takes an input string from the user and performs the following operations:

Print the length of the string.

Print the first and last characters using charAt().

Trim leading and trailing spaces and display the trimmed string.

Convert the string to uppercase and lowercase.

Check whether the string contains the word "java".

Replace all spaces with "-" and print the new string.

Print a substring from index 2 to index 6.

Split the string by spaces and print each word separately.

Check whether the string starts with "Hello" and ends with "java".

Reverse the string (without using StringBuilder.reverse()).



 **/
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        System.out.println(userInput.length());
        System.out.println(userInput.charAt(0));
        System.out.println(userInput.charAt(userInput.length()-1));
        System.out.println("[" + userInput + "]");
        System.out.println(userInput.trim());
        System.out.println("[" + userInput.trim() + "]");
        System.out.println(userInput.toUpperCase());
        System.out.println(userInput.toLowerCase());
        System.out.println(userInput.contains("java"));
        System.out.println(userInput.replace(" ","-"));
        System.out.println(userInput.substring(2,6));
        System.out.println(Arrays.toString(userInput.split(" ")));
        System.out.println(userInput.startsWith("Hello"));
        System.out.println(userInput.endsWith("java"));
        scan.close();
    
    }
}
