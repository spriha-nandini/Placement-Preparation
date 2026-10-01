package day4;
import java.util.Scanner;
class lexicographical {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1 ,str2;
        int count=0;
        System.out.print("enter string 1: ");
        str1= sc.nextLine();
        System.out.print("enter string 2: ");
        str2= sc.nextLine();
        if (str1.length()==str2.length()){
            for (int i=0;i<str1.length();i++){
                if(str1.charAt(i)==str2.charAt(i)){
                    count++;
                }else{
                    System.out.print("string is not lexicographical");
                }
            }
        }else{
            System.out.print("string is not lexicographical");
        }
        if(count==str1.length()){
            System.out.print("string is lexicographical");
        }
        sc.close();
    }
}
