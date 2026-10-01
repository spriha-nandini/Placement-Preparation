package day3;
import java.util.Scanner;
class perfectnum {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int num, sum=0;
        System.out.print("enter a number: ");
        num=sc.nextInt();
        
            for(int i=1;i<=num/2;i++){
            if(num%i==0){
                System.out.println(i + " ");
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println(num + " is a perfect number");
        }else{
            System.out.println(num + " is not a perfect number");
        }
        sc.close();
    }
    
}

