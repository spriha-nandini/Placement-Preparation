package s5day3;
import java.io.*;
import java.util.*;
public class languages {
    public static void main(String args[]){
        LinkedList<String> languages = new LinkedList<>();
        languages.add("java");
        languages.add("python");
        languages.add("javaScript");
        languages.add("java");
        languages.add("CSS");
        System.out.println("linkedlist:" + languages);
        //remove elements
        languages.remove(3);
        System.out.println(languages);
        //change elements at index 3
        languages.set(3,"kotlin");
        System.out.println("updatedlinkedlist" + languages);
        String str = languages.get(1);
        System.out.print("elements at index 1: " + str);
        //access the first element
        String str1 = languages.peek();
        System.out.println("accessed element: " + str1);

        //access and remove the first element
        String str2 = languages.poll();
        System.out.println("removed element: " + str2);
        System.out.println("linked list after poll(): " + languages);

        //add element at end
        languages.offer("swift");
        System.out.println("linked list after offer(): "+ languages);
    }
}
