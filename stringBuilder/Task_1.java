package stringBuilder;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = scan.nextLine();

        //character counting
        System.out.println("Number of characters: " + sentence.length());
        
        //word counting
        String[] words = sentence.split("\\s+"); //" "
        System.out.println("Number of words: " + words.length);

        //no. of vowels
        int vowelCount = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        
        //reversed sentence
        String reverseSentence = new StringBuilder(sentence).reverse().toString();
        System.out.println("Reversed sentence: " + reverseSentence);

        //replace " " to -
        String replacedSentence = sentence.replace(" ", "-");
        System.out.println("Replaced sentence: " + replacedSentence);

        //check if is plandrome
        String cleanSentence = sentence.replace(" ", "").toLowerCase();
        String reverseString = new StringBuilder(cleanSentence).reverse().toString();
        System.out.println(cleanSentence.equals(reverseString) ? "Is plandrome" : "Is not plandrome");

        scan.close();
    }
}
