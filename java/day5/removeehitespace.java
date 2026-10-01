package day5;
import java.util.Scanner;

class RemoveWhitespace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        char[] chars = s.toCharArray();
        int start = 0, end = chars.length - 1;

        // Find first non-space character from the start
        while (start <= end && chars[start] == ' ') {
            start++;
        }

        // Find first non-space character from the end
        while (end >= start && chars[end] == ' ') {
            end--;
        }

        // Construct the trimmed string manually
        String trimmedStr = "";
        for (int i = start; i <= end; i++) {
            trimmedStr += chars[i]; // Concatenating without using StringBuilder
        }

        System.out.println("Trimmed string: [" + trimmedStr + "]");
        sc.close();
    }
}
