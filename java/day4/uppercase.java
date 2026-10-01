package day4;
import java.util.Scanner;
class uppercase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.print("enter a string: ");
        str= sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
            System.out.print((char)(str.charAt(i)-32));
        }else{
            System.out.print(str.charAt(i));
        }
    }
    sc.close();
}
}