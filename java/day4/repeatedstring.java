//coupon is only valid when the coupon code is repeated like abab mama etc
package day4;
import java.util.Scanner;
class repeatedstring {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str;
    System.out.print("enter your coupon code: ");
    str=sc.next();
    int count1=0, count2=0;
    for(int i=0;i<str.length();i+=2){
        if(str.charAt(0)==str.charAt(i)){
            count1++;
        }
    }
    for(int i=1;i<str.length();i+=2){
        if(str.charAt(1)==str.charAt(i)){
            count2++;
        }
    }
    if(count1+count2==str.length()){
        System.out.print("yes");
    }else{
        System.out.print("no");
    }
    sc.close();
}
}