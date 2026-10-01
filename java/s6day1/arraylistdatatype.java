//to tale any datatype as input and print it
//when we declare datatype its called generic, when we want any datatype we should not declare datatype
package s6day1;
import java.io.*;
import java.util.*;
public class arraylistdatatype {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List al=new ArrayList();
        al.add("Sathyabama");
        al.add(23);
        al.add("spriha");
        System.out.print(al);
    }
}
