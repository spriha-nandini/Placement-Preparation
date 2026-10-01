package s5day2;
import java.io.*;
import java.util.*;
public class linkedlist {
    public static void main(String args[]){
        List <Integer> al = new LinkedList <Integer>();
        for(int i=1; i<=5;i++){
            al.add(i);
        }
        System.out.print(al);
        al.remove(3);
        System.out.println(al);
        for(int i=0; i<al.size();i++){
            System.out.println(al.get(i)+" ");
        }
    }
}
