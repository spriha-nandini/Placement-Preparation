package s5day7;
import java.util.*;
public class binarysegregation {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int count=0;
        int count1=0;
        System.out.println("Enter the number of elements: ");
        int n= sc.nextInt();
        int[] arr =  new int[n]; 
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++){
            if(arr[i]==0){
                count++;
            }
            if(arr[i]==1){
                count1++;
            }
            else{
                continue;
            }
        }
        for(int i=0; i<count;i++){
            System.out.print(0);
        }
        for(int i=0; i<count1;i++){
            System.out.print(1);
        }
        sc.close();
    }
}
