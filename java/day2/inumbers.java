//finding the max and min values ffrom the entered values
package day2;
import java.util.Scanner;

public class inumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        char choice;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            
            // Update min and max values
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        
        System.out.println("Greatest number: " + max);
        System.out.println("Smallest number: " + min);
        
        scanner.close();
    }
}
