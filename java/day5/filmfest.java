package day5;
import java.util.Scanner;
class filmfest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,x,count=0, count1=0,in=0;
        System.out.print("enter the total number of movies: ");
        n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int[] arr3=new int[n];
        int[] arr4=new int[n];
        int max= Integer.MIN_VALUE;
        int max1= Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            x=arr1[i]*arr2[i];
            if(x>max){
                max=x;
                arr3[0]=arr1[i];
                arr4[0]=arr2[i];
            }else if(x==max){
                 count++;
            }
        }
        if(count==0){
        System.out.print(arr3[0]+" "+arr4[0]);
        }else if(count!=0){
            for(int i=0;i<n;i++){
                if(arr2[i]>max1){
                    max1=arr2[i];
                    arr3[0]=arr1[i];
                    arr4[0]=arr2[i];
                }else if(arr2[i]==max1){
                    arr3[0]=arr1[i];
                    arr4[0]=arr2[i];
                    count1++;
                    in=i;
                }
            }
        }
        if(count1==0){
            System.out.print(arr3[0]+" "+arr4[0]);
        }else if(count1!=0){
            System.out.print(arr3[0]+" "+arr4[0]+" at index: "+ in);

        }
        sc.close();
    }
}