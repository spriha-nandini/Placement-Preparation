package day7;
import java.util.Scanner;
public class repitition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=1;
        String str;
        String out="";
        str=sc.next();
        for(int i=0;i<str.length();i++){
                if(i>0 && str.charAt(i)==str.charAt(i-1)){
                    count++;
                }else {
                    if (i > 0) { 
                        out += str.charAt(i - 1) + String.valueOf(count);
                    }
                    count = 1; 
                }
            }
            out += str.charAt(str.length() - 1) + String.valueOf(count);
        System.out.print(out);
        sc.close();
    }
}
    

