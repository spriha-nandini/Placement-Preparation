package s6day1;
import java.util.*;
public class duplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int a=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]&&i!=j){
                    count++;
                    a=arr[i];
                }
                break;
            }
        }
        System.out.println("the number repeated is "+ a);
        System.out.println("number of times it is repeated is "+count+1);
    }
}
