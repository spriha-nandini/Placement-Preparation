package s5day2;
import java.io.*;
import java.util.*;
public class arraylist {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        List <Integer> al = new ArrayList <Integer>();
        for(int i=1; i<=5;i++){
            int num=sc.nextInt();
            al.add(num);
        }
        System.out.print(al);
        al.remove(3);
        System.out.println(al);
        for(int i=0; i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}
