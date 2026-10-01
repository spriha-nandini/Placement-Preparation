//to find the average of three numbers
package day1;
import java.util.Scanner;
class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z;

        System.out.print("enter x: ");
        x=sc.nextInt();
        System.out.print("enter y: ");
        y=sc.nextInt();
        System.out.print("enter z: ");
        z=sc.nextInt();
        System.out.println("the average is = " + ((x+y+z)/3));
        sc.close();
    }
    }