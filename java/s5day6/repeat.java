package s5day6;
import java.util.*;
public class repeat {
    public static void main(String args[]){
    int[] arr= new int[]{1,2,5,5,5,5,123,125};
    int n=0;
    for (int j=0;j<arr.length;j++){
            if(arr[j]==arr[j+1]){
                n+=j;
                System.out.println("the repeated element is: " + arr[j]);
                System.out.println("the starting index is :" + j);
                break;
            }
        }
    for (int k=n;k<arr.length;k++){
            if(arr[k]!=arr[k+1]){
                System.out.println("the ending index is :" + k);
                break;
            }
        }
    }
}
