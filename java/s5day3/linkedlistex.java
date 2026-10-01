package s5day3;
import java.io.*;
import java.util.*;
public class linkedlistex {
    public static void main(String args[]){
        LinkedList<String> animals = new LinkedList<>();
        animals.add("cow");
        animals.add("cat");
        animals.add("dog");
        System.out.println("linkedList" + animals );
        //using for each loop
        System.out.println("accessng linkedlist elements:");
        for(String animal: animals){
            System.out.print(animal);
            System.out.print(", ");
        }
    }
}
