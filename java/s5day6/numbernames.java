package s5day6;
import java.util.*;
public class numbernames {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        String[] arr1 = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.println("Enter the number of elements: ");
        int n= sc.nextInt();
        int[] arr =  new int[n]; 
        for(int i=0; i<n;i++){
            System.out.println("enter element "+ i + " :");
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++){
            System.out.println(arr1[arr[i]]);
        }
        sc.close();
    }
}
