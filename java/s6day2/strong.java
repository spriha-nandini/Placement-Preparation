//write a program to check whether the number is a strong number 
package s6day2;
import java.util.*;
public class strong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int originalNum = num;
        int sum = 0;
        do{
            int digit = num % 10; 
            sum += factorial(digit);  
            num /= 10;  
        } while (num > 0);

        if (sum == originalNum) {
            System.out.println(originalNum + " is a Strong Number.");
        } else {
            System.out.println(originalNum + " is not a Strong Number.");
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        if(n==0){
            fact=1;
        }else{
        do {
            fact *= n;
            n--;
        } while (n > 0);
    }
        return fact;
    }

}
