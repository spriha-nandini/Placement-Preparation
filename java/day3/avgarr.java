package day3;
import java.util.Scanner;
class avgarr {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n, sum = 0;
        System.out.print("enter the number of elements you want to enter: ");
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the " + i + " value: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            sum+=arr[i];
    }
    System.out.println("the sum of the array is: " + sum);
    System.out.println("the average of the array is: " + sum/n);
        
    sc.close();
}
}
