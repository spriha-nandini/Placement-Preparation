package s6day1;
import java.util.*;
public class findingnum {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                count++;
            }
        }
        if(count>0){
            System.out.print("the number is found in the data");
        }else{
            System.out.print("the number is not found in the data");
        }
    }
}
