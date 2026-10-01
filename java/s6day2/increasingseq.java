// identify the number of increasing subseqence in java
package s6day2;
import java.util.*;
public class increasingseq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max =arr[0];
        int count=1;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i]&&i+1<n){
                count++;
                max=arr[i+1];
            }
            else{
                continue;
            }
        }
        System.out.print(count);
    }
}
