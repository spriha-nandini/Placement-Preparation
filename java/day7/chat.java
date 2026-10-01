package day7;
import java.util.Scanner;

public class chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // Read input string
        sc.close();

        String out = ""; // Store final result
        int count = 1;

        for (int i = 1; i < str.length(); i++) { 
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;  // Increment count if the same character repeats
            } else {
                out += str.charAt(i - 1) + String.valueOf(count); // Append character + count
                count = 1; // Reset count for new character
            }
        }

        // Append the last character and its count
        out += str.charAt(str.length() - 1) + String.valueOf(count);

        System.out.println(out);
    }
}
