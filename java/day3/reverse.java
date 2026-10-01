package day3;
import java.util.Scanner;
class reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n,temp;
        System.out.print("enter the number of elements you want to enter: ");
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the " + (i+1) + " value: ");
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=n-1;
        while(start<=end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int d=0;d<n;d++){
        System.out.print(arr[d]);
        }
        sc.close();

    }
    
}
