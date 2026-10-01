package day3;
import java.util.Scanner;
class arr {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int[] arr = new int[6];
        for(int i=0;i<=5;i++){
            System.out.print("enter the " + i + " value: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
    }
    sc.close();
}
}
