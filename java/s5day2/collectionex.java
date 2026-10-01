package s5day2;
import java.io.*;
import java.util.*;
public class collectionex {
    public static void main(String args[]){
        int arr[] = new int[] {1,2,3,4};
        Vector <Integer> v= new Vector();
        Hashtable <String,Integer> h = new Hashtable();
        v.addElement(1);
        v.addElement(2);
        h.put("a",4);//key should always be unique but values can duplicate
        h.put("b",2);
        System.out.println(arr[3]);
        System.out.println(v.elementAt(1));
        System.out.println(h.get("a"));
    }
}
