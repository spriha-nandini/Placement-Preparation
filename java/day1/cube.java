//to find cube of a number
package day1;
import java.util.Scanner;
class cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter a value below 100 :");
        n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(i*i*i);
            
        }
        sc.close();
    }
}