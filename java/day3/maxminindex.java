package day3;
import java.util.Scanner;
class maxminindex {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        System.out.print("enter the number of elements you want to enter: ");
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the " + i + " value: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("the max value is: " + max);
        System.out.println("the min value is: " + min);
        sc.close();
    }
}