//voting eligibility
package day2;
import java.util.Scanner;
class ifelse{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x;
    System.out.print("enter the age of the candidate");
    x=sc.nextInt();
    if(x<=18){
        System.out.print("you are not eligible for voting");
    }else{
        System.out.print("you are eligible for voting");
    }sc.close();
}
}