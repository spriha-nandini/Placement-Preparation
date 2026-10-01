package s5day7;
import java.util.*;
public class averagearr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n= sc.nextInt();
        int sum=0;
        int[] arr =  new int[n]; 
        for(int i=0; i<n;i++){
            System.out.println("enter element "+ i + " :");
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++){
            sum+=arr[i];
        }
        System.out.print(sum/n);
        sc.close();
    }
}
