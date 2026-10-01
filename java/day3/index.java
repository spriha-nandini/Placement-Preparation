package day3;
import java.util.Scanner;
public class index {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int a;
        boolean f=false;
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.print("enter the number you want to check: ");
        a=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(a==arr[i]){
                System.out.print(a + " is in the array");
                System.out.print("it is at index: " + i);
                f=true;
            }
        }
        if (f!=true){
            System.out.print(a + " is not in the array");
        }
        sc.close();
}
}