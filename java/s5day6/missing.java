package s5day6;
import java.util.*;
public class missing {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the number of elements: ");
        int n= sc.nextInt();
        int[] arr =  new int[n]; 
        for(int i=0; i<n;i++){
            System.out.println("enter element "+ i + " :");
            arr[i]=sc.nextInt();
        }
    for (int j=arr[0];j<=arr[n-1];j++){
            if(count<n && arr[count]==j){
                count++;
                continue;
            }
            else {
                System.out.println("the missing number is: "+ j);
            }
        }
        sc.close();
}
}
