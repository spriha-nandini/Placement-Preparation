package day8;
import java.util.Scanner;
public class friends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,count=0;
        N=sc.nextInt();
        int [] arr=new int [N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i]==arr[j]){
                    count++;
                    }
    }
}
if(count>0)
{
    System.out.println(N-count);
}else{
    System.out.println(N);
}
sc.close();
}
}
