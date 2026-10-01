package day3;
import java.util.Scanner;
class duplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n, count = 0;
        int a = 0;
        System.out.print("enter the number of elements you want to enter: ");
        n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("enter the " + (i+1) + " value: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]&& (i!=j)){
                    a=arr[i];
                    count+=1;
                    
                }

            }
        }
        System.out.println("the duplicate number is: " + a);
        System.out.println("the frequency is: " + count);
        sc.close();
    }
}