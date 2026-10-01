//multiplication tables
package day1;
import java.util.Scanner;

class  table{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;

        System.out.print("Enter value for x: ");
        x=sc.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(x + "*" + i + "=" + (x*i) );
        }
        sc.close();
    }
}
