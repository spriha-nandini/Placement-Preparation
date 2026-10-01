package day5;
import java.util.Scanner;
class capital {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s,s1="",s2="";
        System.out.print("enter the string: ");
        s=sc.nextLine();
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)>65 && s.charAt(i)<90){
                s1=s1+s.charAt(i);
            }else{
                s2=s2+s.charAt(i);
            }
        }
        System.out.print(s2+s1);
        sc.close();
    }
    
}
