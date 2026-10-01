package day3;
import java.util.Scanner;
class common {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n,m;
        System.out.print("enter the number of elements you want to enter for 1st array: ");
        n=sc.nextInt();
        int[] arr1 = new int[n];
        for(int s=0;s<n;s++){
            System.out.println("enter the " + s + " value: ");
            arr1[s]=sc.nextInt();
        }
        System.out.print("enter the number of elements you want to enter for 2nd array: ");
        m=sc.nextInt();
        int[] arr2 = new int[m];
        for(int r=0;r<m;r++){
            System.out.println("enter the " + r + " value: ");
            arr2[r]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]+ " is a common value.");
                }
            }
        }
    }
}
