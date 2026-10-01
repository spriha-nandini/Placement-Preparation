package day3;
import java.util.Scanner;
class pair {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n, a;
        System.out.print("enter the number of elements you want to enter: ");
        n=sc.nextInt();
        System.out.print("enter the number you want to check: ");
        a=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the " + i + " value: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==a){
                    System.out.println("the pair is: "+ arr[i]+" "+arr[j]); 
                }
            }
        }
        sc.close();
    }
}