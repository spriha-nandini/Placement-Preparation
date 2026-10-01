//printing alphabets using ascii value
package day2;

import java.util.Scanner;
class alphabets{
    public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    for(char i=65;i<=90;i++){
        System.out.print(i);
    }
    System.out.println(" ");
    for(char i=90;i>=65;i--){
        System.out.print(i);
        sc.close();
    }
}
}