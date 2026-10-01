package trainingpractice;
import java.util.*;
public class sum {
    static int unitdig(int x){
        int sum=0, m=0;
        while(x>0){
            int r=x%10;
            sum+=r;
            x/=10;
        }
        if(sum>9){
            return unitdig(sum);
        }
        else{
            return sum;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=unitdig(a);
        System.out.print(b);
    }
}
