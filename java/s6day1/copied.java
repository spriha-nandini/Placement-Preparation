package s6day1;
import java.util.Arrays;
import java.util.Scanner;

public class copied {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter the Second name:");
        String secondName = sc.nextLine();

        String firstLower = firstName.toLowerCase();
        String secondLower = secondName.toLowerCase();

        char[] firstChars = firstLower.toCharArray();
        char[] secondChars = secondLower.toCharArray();
        Arrays.sort(firstChars);
        Arrays.sort(secondChars);

        if (Arrays.equals(firstChars, secondChars)) {
            // If copied (anagrams), output 1
            System.out.println(1);
        } else {
            // If not copied, output 0
            System.out.println(0);
        }

        sc.close();
    }
}