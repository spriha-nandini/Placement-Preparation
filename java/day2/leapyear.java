//to check whether the year is a leap year or not
package day2;
import java.util.Scanner;
class leapyear {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int x;
        System.out.print("enter a year");
        x= sc.nextInt();
        if(x%4==0){
            if(x%100!=0 || (x%100==0 && x%400==0)){
                System.out.print(x + " is a leap year");

            }
        }else{
            System.out.print(x + " is not a leap year");
        }sc.close();
    }
}
