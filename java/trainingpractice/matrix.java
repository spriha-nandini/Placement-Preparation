package trainingpractice;
import java.util.*;
public class matrix {
   public static void main(String[] args){
    int s=1, e=20;
    for(int i=0;i<4;i++){
        for (int j=0;j<5;j++){
            if(i>=j){
                System.out.print(s++ + " ");
            }else{
                System.out.print(e-- + " ");
            }

        }
        System.out.println();
    }
   } 
}
