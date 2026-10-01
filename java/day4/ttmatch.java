package day4;
import java.util.Scanner;
class ttmatch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        int count1=0,count2=0;
        System.out.print("enter a string: ");
        str= sc.nextLine();
        sc.close();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='0'){
                count1++;
            }else{
                count2++;
            }
        }
        if(count1<count2){
            System.out.print("win");
        } else if(count1==count2){
            System.out.print("draw");

        }else{
            System.out.print("loss");
        }
    }
}