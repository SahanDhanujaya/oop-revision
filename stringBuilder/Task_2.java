package stringBuilder;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = scan.nextLine();

        //no. of uppercase and lowercase lettres
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            }
        }
        System.out.println("Number of uppercase letters: " + upperCaseCount);
        System.out.println("Number of lowercase letters: " + lowerCaseCount);
        
        //no. of digits
        int digitCount = 0;
        for(char c : sentence.toCharArray()) {
            if(Character.isDigit(c)) {
                digitCount++;
            }
        }
        System.out.println("Number of digits: " + digitCount);

        //no. of special characters
        int specialcharacters = 0;
        for(char c : sentence.toCharArray()) {
            if(!Character.isLetterOrDigit(c)) {
                specialcharacters++;
            }
        }
        System.out.println("Number of special characters: " + specialcharacters);

        //convert to title case
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " "); //hello => Hello
        }
        System.out.println("\b\b\b");

        //find the longest word
        String longestWord = "";
        for (String word : words) {
            for (int i = 0; i < words.length-1; i++) {
                if (word.length() > words[i+1].length()) {
                    longestWord = word;
                }   
            }
        }
        System.out.println("Longest word: " + longestWord);

        //remove duplicate characters
        String uniqueCharacters = "";
        for (char c : sentence.toCharArray()) {
            if(!uniqueCharacters.contains(String.valueOf(c))) {
                uniqueCharacters += c;
            }
        }
        System.out.println("Unique characters: " + uniqueCharacters);

        //no. of vowels
        int vowelCount = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

        scan.close();
    }
}
