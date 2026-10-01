package day5;
import java.util.Scanner;
class hijacked {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r,c,count=0,sum=0, avg, count1=0;
        System.out.print("enter the number of rows: ");
        r= sc.nextInt();
        System.out.print("enter the number of columns: ");
        c= sc.nextInt();
        int[] []arr = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
                count++;
            }
        }
        avg=sum/count;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]>avg){
                    System.out.println(arr[i][j]);
                    count1++;
                }
            }
        }
        System.out.print("the number of people going out of the aircraft are "+ count1);
        sc.close();
    }

    
}

