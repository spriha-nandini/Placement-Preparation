//use array to find middle element of the data
//then use linked list
package s6day1;
import java.util.*;
public class arraylink {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n%2==1){
            System.out.print(arr[(n-1)/2]);
        }
        else{
            System.out.print(arr[(n/2)]);
        }
    }
}
