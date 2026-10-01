package trainingpractice;
import java.util.*;
public class prac {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=n;
        int revnum=0;
        while(n>0){
            int a=n%10;
            revnum = revnum * 10 + a;
            n=n/10;
        }
        if(b==revnum){
            System.out.print("the number is a palindrome");
        }else{
            System.out.print("this number is not a palindrome");
        }
    }
} 
