package day2;
import java.util.Scanner;
public class maxmin {
    public static void main(String[] args){
        Scanner scanner=new Scanner (System.in);
        int n, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        char ch;
        do{
            System.out.print("enter a numer");
            n=scanner.nextInt();
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
            System.out.print("do you want to enter another number?(y/n)");
            ch = scanner.next().charAt(0);


        }while(ch=='y' || ch=='Y');
        System.out.print("the maximum value is"+max);
        System.out.print("the minimum value is"+min);

        scanner.close();
        }

        
    }
    

