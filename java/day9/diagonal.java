package day9;
import java.util.Scanner;
public class diagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int r=sc.nextInt();
        System.out.print("enter the number of cols: ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.print("the sum is: "+sum);
        sc.close();
    }
}
