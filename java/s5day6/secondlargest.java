package s5day6;
import java.util.*;
public class secondlargest {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter the number of elements: ");
        int n= sc.nextInt();
        int[] arr =  new int[n]; 
        for(int i=0; i<arr.length;i++){
            System.out.println("enter element "+ i + " :");
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int[] arr1 =  new int[n];
        for (int j=0;j<arr.length;j++){
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        arr1[j]=max;
    }
    System.out.println(arr1[n-1]);
    }

}
