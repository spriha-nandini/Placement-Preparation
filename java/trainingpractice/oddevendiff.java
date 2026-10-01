package trainingpractice;
import java.util.*;
public class oddevendiff {
    static int diff(int x){
        int odd=0;
        int even=0;
        while(x>0){
            if((x%10)%2==0){
                even+=x%10;
            }else{
                odd+=x%10;
            }
            x/=10;
        }
        return odd-even;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int b=diff(num);
        System.out.print(b);
    }
}
