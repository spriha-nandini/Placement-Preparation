
package day7;
import java.util.*;
public class linkedlist {
    public static void main(String[] args){
        LinkedList<String> al = new LinkedList<String>();
        al.add("ravi");
        al.add("Vijay");
        al.add("ravi");
        al.add("Ajay");
        Iterator<String> itr0 = al.iterator();
        while(itr0.hasNext()){
        System.out.println(itr0.next());
    }
        al.add(3,"naveen");
        al.remove(2);
        al.removeLast();
        al.removeFirst();
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
        System.out.println(itr.next());
    }
}
}
