package day2;
import java.util.Scanner;
class weekdays {
    public static void main(String[] args){
        int x;
        Scanner sc=new Scanner (System.in);
        System.out.print("enter a value");

        x=sc.nextInt();
        switch (x) {
            case 0:
                System.out.print("Monday");
                break;
                case 1:
                System.out.print("Tuesday");
                break;
                case 2:
                System.out.print("Wednesday");
                break;
                case 3:
                System.out.print("Thursday");
                break;
                case 4:
                System.out.print("Friday");
                break;
                case 5:
                System.out.print("Saturday");
                break;
                case 6:
                System.out.print("Sunday");
                break;
            default:
            System.out.print("please enter a valid number");
                break;
        } 
        sc.close();
    }
}
