//main class bicycle extended by another class
package day6;
import java.util.Scanner;
public class bicycle {
    void gear(int gear, int speed){
        System.out.println("the number of gears is: "+gear);
        System.out.println("the speed of the bicycle is: "+speed);
    }
}
class mbicycle extends bicycle{
    void height(int height){
        System.out.println("the height of the seat is: "+height);
    }
}
class q{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int gear,speed,height;
        System.out.println("enter the number of gears: ");
        gear=sc.nextInt();
        System.out.println("enter the speed: ");
        speed=sc.nextInt();
        System.out.println("enter the height: ");
        height=sc.nextInt();
        bicycle bi = new bicycle();
        bi.gear(gear,speed);
        mbicycle bic = new mbicycle();
        bic.height(height);
        sc.close();
    }
}
