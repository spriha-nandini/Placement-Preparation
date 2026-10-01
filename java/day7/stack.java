package day7;
import java.util.*;
public class stack {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        stack.push("ayush");
        stack.push("garvit");
        stack.push("amit");
        stack.push("ashish");
        stack.push("garima");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
