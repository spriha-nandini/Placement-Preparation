//write a program to find the middle element of the enetered values
package s6day1;
import java.util.*;
public class linkedlist {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        LinkedList al=new LinkedList();
        al.add(1);
        al.add(23);
        al.add(4);
        al.add(5);
        if(al.size()%2==1){
            System.out.print(al.get((al.size()-1)/2));
        }
        else{
            System.out.print(al.get(al.size()/2));
        }
    }
}
