package day2;
import java.util.Scanner;
class oe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter a value below 100 :");
        n=sc.nextInt();
        for(int i=n;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
