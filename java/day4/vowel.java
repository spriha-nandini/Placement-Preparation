package day4;
import java.util.Scanner;
class vowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        int count=0;
        System.out.print("enter a string: ");
        str= sc.nextLine();
        for(int i=0;i<str.length();i++){
        
            char c= str.charAt(i);
            if (c == ' ') {
                continue; 
            }
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                System.out.println(c+" is a vowel");
                count++;
            }else{
                System.out.println(c+" is not a vowel");
            }
            
        }
        System.out.print("the number of vowels is: "+count);
        sc.close();
    }

    
}
