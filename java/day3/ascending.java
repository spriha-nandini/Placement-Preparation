package day3;
import java.util.Scanner;
class ascending {
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
        for(int j=0;j<n;j++){
            for(int k=j+1; k<n;k++){
                if(arr[j]<arr[k]){
                    temp=arr[j];                                                                                    
                    arr[j]=arr[k];
                    arr[k]=temp;

                }
            }
        }
        System.out.println("the descending order is:");
        for(int s=0;s<n;s++){
            System.out.println(arr[s]+" ");
        }
        for(int j=0;j<n;j++){
            for(int k=j+1; k<n;k++){
                if(arr[j]>arr[k]){
                    temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;

                }
            }
        }
        System.out.println("the ascending order is:");
        for(int s=0;s<n;s++){
            System.out.println( arr[s] + " ");
        }
        sc.close();
    }
}