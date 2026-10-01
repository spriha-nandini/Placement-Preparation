package day4;
import java.util.Scanner;
class stringreverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.print("enter a string: ");
        str= sc.nextLine();
        for(int i=str.length()-1;i>=0;i--){
        System.out.print(str.charAt(i));
    }
   sc.close(); 
}
}
