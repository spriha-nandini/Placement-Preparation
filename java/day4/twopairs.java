package day4;
import java.util.Scanner;
class twopairs {
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
                for(int k=i+1;k<n;k++){
                    for(int l=i+1;l<n;l++){
                if(arr[i]+arr[j]+arr[k]+arr[l]==a){
                    System.out.println("the combination is: "+ arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]); 
                }
            }
        }
        sc.close();
    }
}
    }
}