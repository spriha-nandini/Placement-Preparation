package s6day3;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a= sc.nextInt();
        int sum=0, sum1=0;
        while(a>0){
            int r=a%10;
            sum+=r;
            a/=10;
        }
        while (sum>0){
            int r=sum%10;
            sum1+=r;
            sum/=10;
        }
        System.out.print(sum1);
    }
}