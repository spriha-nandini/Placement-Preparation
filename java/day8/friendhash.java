package day8;
import java.util.*;
public class friendhash {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int integer=sc.nextInt();
        int[] arr1=new int[integer];
        for(int i=0;i<integer;i++){
            arr1[i]=sc.nextInt();
        }
    HashSet<Integer> st=new HashSet<Integer>();
    for(int i=0;i<arr1.length;i++){
        int num=arr1[i];
        if(arr1[i]/num>0){
            st.add(arr1[i]);
        }
    }
    System.out.print(st.size());
    sc.close();
}
}
