package day3;
import java.util.Scanner;
class perfect {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int sum=0;
        
        for(int num=1;num<=100;num++){
            for(int i=1;i<=num;i++){
            if(num%i==0){
                sum+=i;
                if(sum==num){
                    System.out.println(num);
                }
            }
        }
       
        
        sc.close();
    }
    
}
}
