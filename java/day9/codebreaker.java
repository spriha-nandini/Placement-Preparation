// in a undercover operation a code breaker incoperates on a secret message encoded with a unique algorithm.
//the message is a string of characters when each character appears twice except 1 character that appears 
//only once. your task is to help the code breaker decipher the message.by finding the first non repeating character
//in the given string.
//input:abbbcdda     output:c
//input:eeefhgffh    output:g
package day9;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codebreaker {
    public static char firstNonRepeatingChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : s.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s.toCharArray()) {
            if (charCount.get(ch) == 1) {
                return ch;
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the encoded message: ");
        String input = scanner.nextLine();
        
        char result = firstNonRepeatingChar(input);
        
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No unique character found.");
        }

        scanner.close();
    }
}
