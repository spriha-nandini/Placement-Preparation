//for finding the area and perimeter of the rectangle
package day1;
import java.util.Scanner;
class area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l,b;

        System.out.print("enter length: ");
        l=sc.nextInt();
        System.out.print("enter breadth: ");
        b=sc.nextInt();
        System.out.println("the area is = " + (l*b));
        System.out.println("the parameter is = " + (2*(l+b)));
        sc.close();
    }
    }

