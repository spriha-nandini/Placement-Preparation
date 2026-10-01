//calculator for 2 numbers
package day1;
import java.util.Scanner;

class sec {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float x,y;

        System.out.print("Enter value for x:");
        x=sc.nextFloat();
        System.out.print("Enter value for y:");
        y=sc.nextFloat();
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        sc.close();
    }
}
